package com.matias.exercise_routine_gym_api.api_gym.repository;

import java.util.List;
import java.util.Optional;

import com.matias.exercise_routine_gym_api.api_gym.entities.ClientEntity;
import com.matias.exercise_routine_gym_api.api_gym.entities.TrainingPlanEntity;

public interface IClientRepository extends IRepository<ClientEntity, Long> {

    public Optional<ClientEntity> findByDNI(String dni);

    public Optional<ClientEntity> findByPhone(String phone);

    public Optional<ClientEntity> findByEmail(String email);

    public Optional<List<TrainingPlanEntity>> findTrainingPlansById(Long id);

}
