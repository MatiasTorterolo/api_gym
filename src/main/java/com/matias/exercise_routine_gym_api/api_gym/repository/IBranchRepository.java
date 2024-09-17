package com.matias.exercise_routine_gym_api.api_gym.repository;

import java.util.List;
import java.util.Optional;

import com.matias.exercise_routine_gym_api.api_gym.entities.BranchEntity;

public interface IBranchRepository extends IRepository<BranchEntity, Long> {

    public Optional<List<BranchEntity>> findByNumber(String number);

    public Optional<List<BranchEntity>> findByStreet(String street);
}
