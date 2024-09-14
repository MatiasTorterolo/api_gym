package com.matias.exercise_routine_gym_api.api_gym.repository;

import org.springframework.stereotype.Repository;

import com.matias.exercise_routine_gym_api.api_gym.entities.ExerciseEntity;

@Repository
public class ExerciseRepository extends JPARepositoryBehavior<ExerciseEntity, Long> implements IExerciseRepository {

    public ExerciseRepository(Class<ExerciseEntity> entityClass) {

        super(entityClass);
    }

}
