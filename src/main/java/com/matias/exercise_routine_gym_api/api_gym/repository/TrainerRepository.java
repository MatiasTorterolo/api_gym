package com.matias.exercise_routine_gym_api.api_gym.repository;

import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.matias.exercise_routine_gym_api.api_gym.entities.TrainerEntity;

@Repository
public class TrainerRepository extends JPARepositoryBehavior<TrainerEntity, Long> implements ITrainerRepository {

    public TrainerRepository(Class<TrainerEntity> entityClass) {

        super(entityClass);
    }

    @Override
    public Optional<TrainerEntity> findByDNI(String dni) {

        try {

            String jpql = "SELECT t FROM TrainerEntity t WHERE t.dni = :dni ";

            TrainerEntity trainer = entityManager.createQuery(jpql, TrainerEntity.class)
                    .setParameter("dni", dni)
                    .getSingleResult();

            return Optional.ofNullable(trainer);
        } catch (Exception e) {

            throw new RuntimeException(String.format("Error, the Trainer with dni: %s doesn't exist", dni));
        }

    }

    @Override
    public Optional<TrainerEntity> findByPhone(String phone) {

        try {

            String jpql = "SELECT t FROM TrainerEntity t WHERE t.phone = :phone";

            TrainerEntity trainer = entityManager.createQuery(jpql, TrainerEntity.class)
                    .setParameter("phone", phone)
                    .getSingleResult();

            return Optional.ofNullable(trainer);

        } catch (Exception e) {

            throw new RuntimeException(String.format("Error, the Trainer with phone number: %s doesn't exist", phone));

        }

    }

    @Override
    public Optional<TrainerEntity> findByEmail(String email) {

        try {

            String jpql = "SELECT t FROM TrainerEntity t WHERE t.email = :email";

            TrainerEntity trainer = entityManager.createQuery(jpql, TrainerEntity.class)
                    .setParameter("email", email)
                    .getSingleResult();

            return Optional.ofNullable(trainer);

        } catch (Exception e) {

            throw new RuntimeException(String.format("Error, the Trainer with email: %s doesn't exist", email));

        }

    }

}
