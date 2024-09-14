package com.matias.exercise_routine_gym_api.api_gym.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.matias.exercise_routine_gym_api.api_gym.entities.MuscleGroupEntity;
import com.matias.exercise_routine_gym_api.api_gym.repository.MuscleGroupRepository;

@Service
public class MuscleGroupService implements IService<MuscleGroupEntity> {

    @Autowired
    private MuscleGroupRepository muscleGroupRepository;

    @Transactional(readOnly = true)
    @Override
    public List<MuscleGroupEntity> findAll() {

        return muscleGroupRepository.findAll();
    }

    @Transactional(readOnly = true)
    @Override
    public Optional<MuscleGroupEntity> findById(Long id) {

        return muscleGroupRepository.findById(id);
    }

    @Transactional
    @Override
    public MuscleGroupEntity create(MuscleGroupEntity entity) {

        if (entity == null) {
            throw new IllegalArgumentException("Entity is null");
        }

        return muscleGroupRepository.save(entity);
    }

    @Transactional
    @Override
    public Optional<MuscleGroupEntity> update(Long id, MuscleGroupEntity entity) {

        Optional<MuscleGroupEntity> muscleGroupOptional = muscleGroupRepository.findById(id);

        if (muscleGroupOptional.isPresent()) {

            MuscleGroupEntity muscleGroup = muscleGroupOptional.get();

            muscleGroup.setName(entity.getName());
            muscleGroup.setMuscles(entity.getMuscles());

            return Optional.of(muscleGroupRepository.save(muscleGroup));
        }

        return muscleGroupOptional;
    }

    @Transactional
    @Override
    public void delete(Long id) {

        muscleGroupRepository.deleteById(id);
    }

}
