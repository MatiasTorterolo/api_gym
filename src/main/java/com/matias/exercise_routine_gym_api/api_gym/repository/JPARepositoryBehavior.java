package com.matias.exercise_routine_gym_api.api_gym.repository;

import java.lang.reflect.Method;
import java.util.List;
import java.util.Optional;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

public abstract class JPARepositoryBehavior<T, ID> implements IRepository<T, ID> {

    @PersistenceContext
    protected EntityManager entityManager;

    private final Class<T> entityClass;

    // private final Class<ID> idClass;

    public JPARepositoryBehavior(Class<T> entityClass) {
        this.entityClass = entityClass;
        // this.idClass = idClass;
    }

    @Override
    public T save(T entity) {

        try {

            Method getIdMethod = entity.getClass().getMethod("getId");
            Object idObject = getIdMethod.invoke(entity);

            if (idObject == null) {

                entityManager.persist(entity);
                return entity;
            } else {
                return entityManager.merge(entity);
            }

        } catch (Exception e) {

            throw new RuntimeException("Error saving entity", e);
        }

    }

    @Override
    public void delete(T entity) {

        try {

            if (entityManager.contains(entity)) {
                entityManager.remove(entity);
            } else {
                T mangedEntity = entityManager.merge(entity);
                entityManager.remove(mangedEntity);
            }
        } catch (Exception e) {

            throw new RuntimeException("Error deleting entity", e);
        }

    }

    @Override
    public void deleteById(ID id) {

        try {

            T entity = entityManager.find(entityClass, id);

            if (entity != null) {

                entityManager.remove(entity);
            }
        } catch (Exception e) {

            throw new RuntimeException("Error deleting entity by ID", e);
        }
    }

    @Override
    public Optional<T> findById(ID id) {

        try {

            T entity = entityManager.find(entityClass, id);

            return Optional.ofNullable(entity);

        } catch (Exception e) {

            throw new RuntimeException("Error finding entity by ID", e);
        }
    }

    // JPQL es más simple y directa para consultas básicas.
    // Criteria API ofrece más flexibilidad para construir consultas complejas o
    // dinámicas.
    @Override
    public List<T> findAll() {

        try {

            String jpql = "SELECT t FROM " + entityClass.getSimpleName() + " t";

            TypedQuery<T> query = entityManager.createQuery(jpql, entityClass);

            return query.getResultList();
        } catch (Exception e) {

            throw new RuntimeException("Error finding all entities", e);
        }
    }

    @Override
    public Optional<T> findByName(String name) {

        try {

            String jpql = "SELECT t FROM " + entityClass.getSimpleName() + " t WHERE t.name = :name";

            TypedQuery<T> query = entityManager.createQuery(jpql, entityClass);

            return Optional.ofNullable(query.getSingleResult());

        } catch (Exception e) {

            throw new RuntimeException("Error finding the entity", e);
        }

    }

}
