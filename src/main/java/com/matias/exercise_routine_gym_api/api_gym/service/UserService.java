package com.matias.exercise_routine_gym_api.api_gym.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.matias.exercise_routine_gym_api.api_gym.entities.UserEntity;
import com.matias.exercise_routine_gym_api.api_gym.repository.UserRepository;

@Service
public class UserService implements IService<UserEntity> {

    @Autowired
    private UserRepository userRepository;

    @Transactional(readOnly = true)
    @Override
    public List<UserEntity> findAll() {

        return userRepository.findAll();
    }

    @Transactional(readOnly = true)
    @Override
    public Optional<UserEntity> findById(Long id) {

        return userRepository.findById(id);
    }

    @Transactional
    @Override
    public UserEntity create(UserEntity entity) {

        if (entity == null) {
            throw new IllegalArgumentException("Entity is null");
        }

        return userRepository.save(entity);
    }

    @Transactional
    @Override
    public Optional<UserEntity> update(Long id, UserEntity entity) {

        Optional<UserEntity> userOptional = userRepository.findById(id);

        if (userOptional.isPresent()) {

            UserEntity user = userOptional.get();

            user.setDni(entity.getDni());
            user.setPassword(entity.getPassword());
            user.setRoles(entity.getRoles());

            return Optional.of(userRepository.save(user));
        }

        return userOptional;
    }

    @Override
    public void delete(Long id) {

        // se usa para en algun momento si existen usuarios con mas de 1 mes de
        // inhabilitacion, se eliminen
        userRepository.deleteById(id);
    }

    @Transactional
    public void disable(Long id) {

        Optional<UserEntity> userOptional = userRepository.findById(id);

        if (userOptional.isPresent()) {

            UserEntity user = userOptional.get();
            user.setEnabled(false);

            userRepository.save(user);
        }

        throw new IllegalArgumentException("that user doesn´t exist");
    }

}
