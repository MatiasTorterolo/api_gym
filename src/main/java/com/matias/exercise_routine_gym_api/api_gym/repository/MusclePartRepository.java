package com.matias.exercise_routine_gym_api.api_gym.repository;

import org.springframework.stereotype.Repository;

import com.matias.exercise_routine_gym_api.api_gym.entities.MusclePartEntity;

@Repository
public class MusclePartRepository extends JPARepositoryBehavior<MusclePartEntity, Long>
        implements IMusclePartRepository {

    public MusclePartRepository(Class<MusclePartEntity> entityClass) {

        super(entityClass);
    }

}
