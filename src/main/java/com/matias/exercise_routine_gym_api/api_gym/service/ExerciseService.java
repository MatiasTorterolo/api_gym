package com.matias.exercise_routine_gym_api.api_gym.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.matias.exercise_routine_gym_api.api_gym.entities.ExerciseEntity;
import com.matias.exercise_routine_gym_api.api_gym.repository.ExerciseRepository;

@Service
public class ExerciseService implements IService<ExerciseEntity> {

    @Autowired
    private ExerciseRepository exerciseRepository;

    @Transactional(readOnly = true)
    @Override
    public List<ExerciseEntity> findAll() {

        return exerciseRepository.findAll();
    }

    @Transactional(readOnly = true)
    @Override
    public Optional<ExerciseEntity> findById(Long id) {

        return exerciseRepository.findById(id);
    }

    @Transactional
    @Override
    public ExerciseEntity create(ExerciseEntity entity) {

        if (entity == null) {

            throw new IllegalArgumentException("Entity is null");
        }

        return exerciseRepository.save(entity);
    }

    @Transactional
    @Override
    public Optional<ExerciseEntity> update(Long id, ExerciseEntity entity) {

        Optional<ExerciseEntity> exerciseOptional = exerciseRepository.findById(id);

        if (exerciseOptional.isPresent()) {

            ExerciseEntity exercise = exerciseOptional.get();

            exercise.setPhoto(entity.getPhoto());
            exercise.setMuscle(entity.getMuscle());
            exercise.setSets(entity.getSets());
            exercise.setReps(entity.getReps());
            exercise.setToFailure(entity.isToFailure());
            exercise.setConsideration(entity.getConsideration());

            return Optional.of(exerciseRepository.save(exercise));
        }

        return exerciseOptional;
    }

    @Transactional
    @Override
    public void delete(Long id) {

        exerciseRepository.deleteById(id);
    }

}
