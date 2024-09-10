package com.matias.exercise_routine_gym_api.api_gym.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.matias.exercise_routine_gym_api.api_gym.entities.TrainingPlanEntity;
import com.matias.exercise_routine_gym_api.api_gym.repository.TrainingPlanRepository;

@Service
public class TrainingPlanService implements IService<TrainingPlanEntity> {

    @Autowired
    private TrainingPlanRepository trainingPlanRepository;

    @Transactional(readOnly = true)
    @Override
    public List<TrainingPlanEntity> findAll() {

        return trainingPlanRepository.findAll();
    }

    @Transactional(readOnly = true)
    @Override
    public Optional<TrainingPlanEntity> findById(Long id) {

        return trainingPlanRepository.findById(id);
    }

    @Transactional
    @Override
    public TrainingPlanEntity create(TrainingPlanEntity entity) {

        if (entity == null) {
            throw new IllegalArgumentException("Entity is null");
        }

        return trainingPlanRepository.save(entity);
    }

    @Transactional
    @Override
    public Optional<TrainingPlanEntity> update(Long id, TrainingPlanEntity entity) {

        Optional<TrainingPlanEntity> TrainingPlanEntityOptional = trainingPlanRepository.findById(id);

        // si esta presente se retorna el optional de ese plan ya actualizado
        if (TrainingPlanEntityOptional.isPresent()) {

            TrainingPlanEntity trainingPlanEntity = TrainingPlanEntityOptional.orElseThrow();

            // Optional<TrainingPlanTypeEntity> tpte =
            // trainingPlanTypeRepository.findById(id);

            trainingPlanEntity.setType(entity.getType());
            trainingPlanEntity.setRoutines(entity.getRoutines());

            // optional con el objeto actualizado
            return Optional.of(trainingPlanRepository.save(entity));
        }

        // si esta vacio se retorna el optional vacio (empty) valga la redundancia...
        return TrainingPlanEntityOptional;
    }

    @Transactional
    @Override
    public void delete(Long id) {

        trainingPlanRepository.deleteById(id);
    }

}
