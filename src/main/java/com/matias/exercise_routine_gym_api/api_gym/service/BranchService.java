package com.matias.exercise_routine_gym_api.api_gym.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.matias.exercise_routine_gym_api.api_gym.entities.BranchEntity;
import com.matias.exercise_routine_gym_api.api_gym.repository.BranchRepository;

@Service
public class BranchService implements IService<BranchEntity> {

    @Autowired
    private BranchRepository branchRepository;

    @Transactional(readOnly = true)
    @Override
    public List<BranchEntity> findAll() {

        return branchRepository.findAll();
    }

    @Transactional(readOnly = true)
    @Override
    public Optional<BranchEntity> findById(Long id) {

        return branchRepository.findById(id);
    }

    @Transactional
    @Override
    public BranchEntity create(BranchEntity entity) {

        if (entity == null) {
            throw new IllegalArgumentException("Entity is null");
        }

        return branchRepository.save(entity);
    }

    @Transactional
    @Override
    public Optional<BranchEntity> update(Long id, BranchEntity entity) {

        Optional<BranchEntity> branchOptional = branchRepository.findById(id);

        if (branchOptional.isPresent()) {

            BranchEntity branch = branchOptional.get();

            branch.setStreet(entity.getStreet());
            branch.setNumber(entity.getNumber());

            return Optional.of(branch);
        }

        return branchOptional;
    }

    @Transactional
    @Override
    public void delete(Long id) {

        branchRepository.deleteById(id);
    }

}
