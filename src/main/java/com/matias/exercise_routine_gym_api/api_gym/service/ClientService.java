package com.matias.exercise_routine_gym_api.api_gym.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.matias.exercise_routine_gym_api.api_gym.entities.ClientEntity;
import com.matias.exercise_routine_gym_api.api_gym.repository.ClientRepository;

@Service
public class ClientService implements IService<ClientEntity> {

    @Autowired
    private ClientRepository clientRepository;

    @Transactional(readOnly = true)
    @Override
    public List<ClientEntity> findAll() {

        return clientRepository.findAll();
    }

    @Transactional(readOnly = true)
    @Override
    public Optional<ClientEntity> findById(Long id) {

        return clientRepository.findById(id);
    }

    @Transactional
    @Override
    public ClientEntity create(ClientEntity entity) {

        if (entity == null) {

            throw new IllegalArgumentException("Entity is null");
        }

        return clientRepository.save(entity);
    }

    @Transactional
    @Override
    public Optional<ClientEntity> update(Long id, ClientEntity entity) {

        Optional<ClientEntity> clientOptional = clientRepository.findById(id);

        if (clientOptional.isPresent()) {

            ClientEntity client = clientOptional.get();

            client.setName(entity.getName());
            client.setEmail(entity.getEmail());
            client.setPhone(entity.getPhone());
            client.setEmergencyPhone(entity.getEmergencyPhone());

            return Optional.of(clientRepository.save(client));
        }

        return clientOptional;
    }

    @Transactional
    @Override
    public void delete(Long id) {

        clientRepository.deleteById(id);
    }

}
