package com.matias.exercise_routine_gym_api.api_gym.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.matias.exercise_routine_gym_api.api_gym.entities.TrainingPlanEntity;
import com.matias.exercise_routine_gym_api.api_gym.repository.TrainingPlanRepository;

@Service
public class TrainingPlanService implements IService<TrainingPlanEntity> {

    @Autowired
    private TrainingPlanRepository trainingPlanRepository;

    @Override
    public List<TrainingPlanEntity> findAll() {

        return trainingPlanRepository.findAll();
    }

    @Override
    public Optional<TrainingPlanEntity> findById(Long id) {

        return trainingPlanRepository.findById(id);
    }

    @Override
    public TrainingPlanEntity create(TrainingPlanEntity entity) {

        if (entity == null) {
            throw new IllegalArgumentException("Entity is null");
        }

        return trainingPlanRepository.save(entity);
    }

    @Override
    public Optional<TrainingPlanEntity> update(Long id, TrainingPlanEntity entity) {

        Optional<TrainingPlanEntity> TrainingPlanEntityOptional = trainingPlanRepository.findById(id);

        // si esta presente se retorna el optional de ese plan ya actualizado
        if (TrainingPlanEntityOptional.isPresent()) {

            TrainingPlanEntity trainingPlanEntity = TrainingPlanEntityOptional.orElseThrow();

            // Optional<TrainingPlanTypeEntity> tpte =
            // trainingPlanTypeRepository.findById(id);

            trainingPlanEntity.setType_id(entity.getType_id());
            trainingPlanEntity.setRoutines_id(entity.getRoutines_id());

            // optional con el objeto actualizado
            return Optional.of(trainingPlanRepository.save(entity));
        }

        // si esta vacio se retorna el optional vacio (empty) valga la redundancia...
        return TrainingPlanEntityOptional;
    }

    @Override
    public void delete(Long id) {

        trainingPlanRepository.deleteById(id);
    }

}
