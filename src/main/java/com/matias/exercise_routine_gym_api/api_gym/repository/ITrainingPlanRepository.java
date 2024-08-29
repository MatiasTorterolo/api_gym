package com.matias.exercise_routine_gym_api.api_gym.repository;

import java.util.List;
import java.util.Optional;

import com.matias.exercise_routine_gym_api.api_gym.entities.TrainingPlanEntity;

public interface ITrainingPlanRepository {

    // buscar planes por el tipo de plan (nombre) por si el
    // entrenador desea copiar ese plan a otro cliente
    public Optional<List<TrainingPlanEntity>> findByPlanType(String type);

}
