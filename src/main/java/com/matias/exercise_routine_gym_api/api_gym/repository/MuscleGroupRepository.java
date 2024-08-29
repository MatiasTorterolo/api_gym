package com.matias.exercise_routine_gym_api.api_gym.repository;

import org.springframework.stereotype.Repository;

import com.matias.exercise_routine_gym_api.api_gym.entities.MuscleGroupEntity;

@Repository
public class MuscleGroupRepository extends JPARepositoryBehavior<MuscleGroupEntity, Long>
        implements IMuscleGroupRepository {

    public MuscleGroupRepository(Class<MuscleGroupEntity> entityClass) {

        super(entityClass);
    }

}
