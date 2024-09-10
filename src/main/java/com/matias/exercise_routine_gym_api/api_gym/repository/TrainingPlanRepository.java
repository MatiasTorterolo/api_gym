package com.matias.exercise_routine_gym_api.api_gym.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.matias.exercise_routine_gym_api.api_gym.entities.TrainingPlanEntity;

@Repository
public class TrainingPlanRepository extends JPARepositoryBehavior<TrainingPlanEntity, Long>
        implements ITrainingPlanRepository {

    public TrainingPlanRepository(Class<TrainingPlanEntity> entityClass) {

        super(entityClass);
    }

    @Override
    public Optional<List<TrainingPlanEntity>> findByPlanType(String type) {

        try {

            String jpql = "SELECT t FROM TrainingPlanEntity t WHERE t.type = :type";

            @SuppressWarnings("unchecked")
            List<TrainingPlanEntity> entityList = (List<TrainingPlanEntity>) entityManager.createQuery(jpql)
                    .setParameter("type", type)
                    .getResultList();

            return Optional.ofNullable(entityList);

        } catch (Exception e) {

            throw new RuntimeException("Error finding plans", e);
        }

    }
}
