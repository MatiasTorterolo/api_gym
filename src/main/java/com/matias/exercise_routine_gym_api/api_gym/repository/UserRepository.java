package com.matias.exercise_routine_gym_api.api_gym.repository;

import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.matias.exercise_routine_gym_api.api_gym.entities.UserEntity;

@Repository
public class UserRepository extends JPARepositoryBehavior<UserEntity, Long>
        implements IUserRepository {

    public UserRepository(Class<UserEntity> entityClass) {

        super(entityClass);
    }

    @Override
    public Optional<UserEntity> findByDNI(String dni) {

        try {

            String jpql = "SELECT * FROM UserEntity u WHERE u.dni = :dni";

            UserEntity entity = entityManager.createQuery(jpql, UserEntity.class)
                    .setParameter("dni", dni)
                    .getSingleResult();

            return Optional.ofNullable(entity);

        } catch (Exception e) {

            throw new RuntimeException("Error, these user doesn't exist", e);
        }
    }

}
