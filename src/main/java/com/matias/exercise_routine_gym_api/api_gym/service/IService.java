package com.matias.exercise_routine_gym_api.api_gym.service;

import java.util.List;
import java.util.Optional;

public interface IService<T> {

    List<T> findAll();

    Optional<T> findById(Long id);

    T create(T entity);

    Optional<T> update(Long id, T entity);

    void delete(Long id);
}
