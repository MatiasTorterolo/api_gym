package com.matias.exercise_routine_gym_api.api_gym.repository;

import org.springframework.stereotype.Repository;

import com.matias.exercise_routine_gym_api.api_gym.entities.RoutineEntity;

@Repository
public class RoutineRepository extends JPARepositoryBehavior<RoutineEntity, Long> implements IRoutineRepository {

    public RoutineRepository(Class<RoutineEntity> entityClass) {

        super(entityClass);
    }

}
