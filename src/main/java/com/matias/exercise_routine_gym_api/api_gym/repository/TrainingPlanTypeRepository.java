package com.matias.exercise_routine_gym_api.api_gym.repository;

import org.springframework.stereotype.Repository;

import com.matias.exercise_routine_gym_api.api_gym.entities.TrainingPlanTypeEntity;

@Repository
public class TrainingPlanTypeRepository extends JPARepositoryBehavior<TrainingPlanTypeEntity, Long>
        implements ITrainingPlanTypeRepository {

    public TrainingPlanTypeRepository(Class<TrainingPlanTypeEntity> entityClass) {

        super(entityClass);
    }

}
