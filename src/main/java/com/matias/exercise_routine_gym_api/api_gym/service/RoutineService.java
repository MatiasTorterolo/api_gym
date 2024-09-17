package com.matias.exercise_routine_gym_api.api_gym.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.matias.exercise_routine_gym_api.api_gym.entities.RoutineEntity;
import com.matias.exercise_routine_gym_api.api_gym.repository.RoutineRepository;

@Service
public class RoutineService implements IService<RoutineEntity> {

    @Autowired
    private RoutineRepository routineRepository;

    @Transactional
    @Override
    public RoutineEntity create(RoutineEntity entity) {

        if (entity == null) {
            throw new IllegalArgumentException("Entity is null");
        }

        return routineRepository.save(entity);

    }

    @Transactional
    @Override
    public Optional<RoutineEntity> update(Long id, RoutineEntity entity) {

        Optional<RoutineEntity> optionalRoutineEntity = routineRepository.findById(id);

        if (optionalRoutineEntity.isPresent()) {

            RoutineEntity routine = optionalRoutineEntity.get();

            routine.setMuscleGroup(entity.getMuscleGroup());
            routine.setExersices(entity.getExersices());
            routine.setDays(entity.getDays());

            return Optional.of(routineRepository.save(routine));
        }

        return optionalRoutineEntity;
    }

    @Transactional
    @Override
    public void delete(Long id) {

        routineRepository.deleteById(id);
    }

    @Transactional(readOnly = true)
    @Override
    public List<RoutineEntity> findAll() {
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Transactional(readOnly = true)
    @Override
    public Optional<RoutineEntity> findById(Long id) {
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

}
