package com.matias.exercise_routine_gym_api.api_gym.repository;

import java.util.Optional;

import com.matias.exercise_routine_gym_api.api_gym.entities.UserEntity;

public interface IUserRepository {

    public Optional<UserEntity> findByDNI(String dni);

}
