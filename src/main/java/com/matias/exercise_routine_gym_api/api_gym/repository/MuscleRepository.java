package com.matias.exercise_routine_gym_api.api_gym.repository;

import org.springframework.stereotype.Repository;

import com.matias.exercise_routine_gym_api.api_gym.entities.MuscleEntity;

@Repository
public class MuscleRepository extends JPARepositoryBehavior<MuscleEntity, Long>
        implements IMuscleRepository {

    public MuscleRepository(Class<MuscleEntity> entityClass) {

        super(entityClass);
    }
}
