package com.matias.exercise_routine_gym_api.api_gym.repository;

import java.util.List;
import java.util.Optional;

public interface IRepository<T, ID> {

    T save(T entity);

    void delete(T entity);

    void deleteById(ID id);

    Optional<T> findById(ID id);

    List<T> findAll();

    Optional<T> findByName(String name);

}
