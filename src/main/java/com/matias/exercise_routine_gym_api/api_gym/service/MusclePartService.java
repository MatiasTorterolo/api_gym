package com.matias.exercise_routine_gym_api.api_gym.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.matias.exercise_routine_gym_api.api_gym.entities.MusclePartEntity;
import com.matias.exercise_routine_gym_api.api_gym.repository.MusclePartRepository;

@Service
public class MusclePartService implements IService<MusclePartEntity> {

    @Autowired
    private MusclePartRepository musclePartRepository;

    @Transactional(readOnly = true)
    @Override
    public List<MusclePartEntity> findAll() {

        return musclePartRepository.findAll();
    }

    @Transactional(readOnly = true)
    @Override
    public Optional<MusclePartEntity> findById(Long id) {

        return musclePartRepository.findById(id);
    }

    @Transactional
    @Override
    public MusclePartEntity create(MusclePartEntity entity) {

        if (entity == null) {
            throw new IllegalArgumentException("Entity is null");
        }

        return musclePartRepository.save(entity);
    }

    @Transactional
    @Override
    public Optional<MusclePartEntity> update(Long id, MusclePartEntity entity) {

        Optional<MusclePartEntity> musclePartOptional = musclePartRepository.findById(id);

        if (musclePartOptional.isPresent()) {

            MusclePartEntity musclePart = musclePartOptional.get();

            musclePart.setName(entity.getName());
            musclePart.setMuscle(entity.getMuscle());

            return Optional.of(musclePartRepository.save(musclePart));

        }

        return musclePartOptional;
    }

    @Transactional
    @Override
    public void delete(Long id) {

        musclePartRepository.deleteById(id);
    }

}
