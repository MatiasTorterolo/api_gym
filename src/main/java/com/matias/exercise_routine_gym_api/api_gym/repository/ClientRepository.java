package com.matias.exercise_routine_gym_api.api_gym.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.matias.exercise_routine_gym_api.api_gym.entities.ClientEntity;
import com.matias.exercise_routine_gym_api.api_gym.entities.TrainingPlanEntity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
public class ClientRepository extends JPARepositoryBehavior<ClientEntity, Long> implements IClientRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public ClientRepository(Class<ClientEntity> entityClass) {

        super(entityClass);
    }

    @Override
    public Optional<ClientEntity> findByDNI(String dni) {

        try {

            String jpql = "SELECT c.dni FROM ClientEntity c WHERE c.dni = :dni";

            ClientEntity entity = entityManager.createQuery(jpql, ClientEntity.class)
                    .setParameter("dni", dni)
                    .getSingleResult();

            return Optional.ofNullable(entity);

        } catch (Exception e) {

            return Optional.empty();
        }
    }

    @Override
    public Optional<ClientEntity> findByPhone(String phone) {

        try {

            String jpql = "SELECT c.phone FROM ClientEntity c WHERE c.phone = :phone";

            ClientEntity entity = entityManager.createQuery(jpql, ClientEntity.class)
                    .setParameter("phone", phone)
                    .getSingleResult();

            return Optional.ofNullable(entity);

        } catch (Exception e) {

            return Optional.empty();
        }
    }

    @Override
    public Optional<ClientEntity> findByEmail(String email) {

        try {

            String jpql = "SELECT c.email FROM ClientEntity c WHERE c.email = :email";

            ClientEntity entity = entityManager.createQuery(jpql, ClientEntity.class)
                    .setParameter("email", email)
                    .getSingleResult();

            return Optional.ofNullable(entity);

        } catch (Exception e) {

            return Optional.empty();
        }
    }

    @Override
    public Optional<List<TrainingPlanEntity>> findTrainingPlansById(Long clientEntity_id) {

        try {

            String jpql = "SELECT * FROM TrainingPlanEntity t WHERE t.client_entity_id = :clientEntity_id";

            @SuppressWarnings("unchecked")
            List<TrainingPlanEntity> entityList = (List<TrainingPlanEntity>) entityManager.createQuery(jpql)
                    .setParameter("clientEntity_id", clientEntity_id)
                    .getResultList();

            return Optional.ofNullable(entityList);

        } catch (Exception e) {

            throw new RuntimeException(e);
        }
    }

}
