package com.matias.exercise_routine_gym_api.api_gym.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.matias.exercise_routine_gym_api.api_gym.entities.TrainingPlanTypeEntity;
import com.matias.exercise_routine_gym_api.api_gym.repository.TrainingPlanTypeRepository;

@Service
public class TrainingPlanTypeService implements IService<TrainingPlanTypeEntity> {

    @Autowired
    private TrainingPlanTypeRepository trainingPlanTypeRepository;

    @Override
    public List<TrainingPlanTypeEntity> findAll() {

        return trainingPlanTypeRepository.findAll();
    }

    @Override
    public Optional<TrainingPlanTypeEntity> findById(Long id) {

        return trainingPlanTypeRepository.findById(id);
    }

    @Override
    public TrainingPlanTypeEntity create(TrainingPlanTypeEntity entity) {

        if (entity == null) {
            throw new IllegalArgumentException("Entity is null");
        }

        return trainingPlanTypeRepository.save(entity);
    }

    @Override
    public Optional<TrainingPlanTypeEntity> update(Long id, TrainingPlanTypeEntity entity) {

        Optional<TrainingPlanTypeEntity> TrainingPlanTypeEntityOptional = trainingPlanTypeRepository.findById(id);

        // si esta presente se retorna el optional de ese plan ya actualizado
        if (TrainingPlanTypeEntityOptional.isPresent()) {

            TrainingPlanTypeEntity trainingPlanTypeEntity = TrainingPlanTypeEntityOptional.orElseThrow();

            trainingPlanTypeEntity.setName(entity.getName());

            // optional con el objeto actualizado
            return Optional.of(trainingPlanTypeRepository.save(entity));
        }

        // si esta vacio se retorna el optional vacio (empty) valga la redundancia...
        return TrainingPlanTypeEntityOptional;
    }

    @Override
    public void delete(Long id) {

        trainingPlanTypeRepository.deleteById(id);
    }

}
