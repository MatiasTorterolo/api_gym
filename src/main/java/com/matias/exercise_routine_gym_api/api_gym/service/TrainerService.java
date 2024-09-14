package com.matias.exercise_routine_gym_api.api_gym.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.matias.exercise_routine_gym_api.api_gym.entities.TrainerEntity;
import com.matias.exercise_routine_gym_api.api_gym.repository.TrainerRepository;

public class TrainerService implements IService<TrainerEntity> {

    @Autowired
    private TrainerRepository trainerRepository;

    @Transactional(readOnly = true)
    @Override
    public List<TrainerEntity> findAll() {

        return trainerRepository.findAll();
    }

    @Transactional(readOnly = true)
    @Override
    public Optional<TrainerEntity> findById(Long id) {

        return trainerRepository.findById(id);
    }

    @Transactional
    @Override
    public TrainerEntity create(TrainerEntity entity) {

        if (entity == null) {
            throw new IllegalArgumentException("Entity is null");
        }

        return trainerRepository.save(entity);
    }

    @Transactional
    @Override
    public Optional<TrainerEntity> update(Long id, TrainerEntity entity) {

        Optional<TrainerEntity> trainerEntityOptional = trainerRepository.findById(id);

        if (trainerEntityOptional.isPresent()) {

            TrainerEntity trainer = trainerEntityOptional.get();

            trainer.setName(entity.getName());
            trainer.setDni(entity.getDni());
            trainer.setBranch(entity.getBranch());
            trainer.setEmail(entity.getEmail());
            trainer.setPhone(entity.getPhone());

            return Optional.of(trainerRepository.save(trainer));
        }

        // optional empty
        return trainerEntityOptional;
    }

    @Transactional
    @Override
    public void delete(Long id) {

        trainerRepository.deleteById(id);
    }

}
