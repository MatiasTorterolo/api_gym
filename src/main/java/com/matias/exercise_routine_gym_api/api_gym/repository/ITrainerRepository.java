package com.matias.exercise_routine_gym_api.api_gym.repository;

import java.util.Optional;

import com.matias.exercise_routine_gym_api.api_gym.entities.TrainerEntity;

public interface ITrainerRepository extends IRepository<TrainerEntity, Long> {

    public Optional<TrainerEntity> findByDNI(String dni);

    public Optional<TrainerEntity> findByPhone(String phone);

    public Optional<TrainerEntity> findByEmail(String email);

}
