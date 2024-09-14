package com.matias.exercise_routine_gym_api.api_gym.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.matias.exercise_routine_gym_api.api_gym.entities.MuscleEntity;
import com.matias.exercise_routine_gym_api.api_gym.repository.MuscleRepository;

@Service
public class MuscleService implements IService<MuscleEntity> {

    @Autowired
    private MuscleRepository muscleRepository;

    @Transactional(readOnly = true)
    @Override
    public List<MuscleEntity> findAll() {

        return muscleRepository.findAll();
    }

    @Transactional(readOnly = true)
    @Override
    public Optional<MuscleEntity> findById(Long id) {

        return muscleRepository.findById(id);
    }

    @Transactional
    @Override
    public MuscleEntity create(MuscleEntity entity) {

        if (entity == null) {
            throw new IllegalArgumentException("Entity is null");
        }

        return muscleRepository.save(entity);
    }

    @Transactional
    @Override
    public Optional<MuscleEntity> update(Long id, MuscleEntity entity) {

        Optional<MuscleEntity> muscleOptional = muscleRepository.findById(id);

        if (muscleOptional.isPresent()) {

            MuscleEntity muscle = muscleOptional.get();

            muscle.setName(entity.getName());
            muscle.setMuscleGroup(entity.getMuscleGroup());
            muscle.setMusclePart(entity.getMuscleParts());

            return Optional.of(muscleRepository.save(muscle));
        }

        return muscleOptional;
    }

    @Transactional
    @Override
    public void delete(Long id) {

        muscleRepository.deleteById(id);
    }

}
