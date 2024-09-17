package com.matias.exercise_routine_gym_api.api_gym.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.matias.exercise_routine_gym_api.api_gym.entities.BranchEntity;

@Repository
public class BranchRepository extends JPARepositoryBehavior<BranchEntity, Long> implements IBranchRepository {

    public BranchRepository(Class<BranchEntity> entityClass) {

        super(entityClass);
    }

    @Override
    public Optional<List<BranchEntity>> findByNumber(String number) {

        try {

            String jpql = "SELECT b FROM BranchEntity b WHERE b.number = :number";

            @SuppressWarnings("unchecked")
            List<BranchEntity> listBranch = (List<BranchEntity>) entityManager.createQuery(jpql)
                    .setParameter("number", number)
                    .getResultList();

            return Optional.of(listBranch);

        } catch (Exception e) {

            throw new RuntimeException("Error, doesn´t exist that branch", e);
        }

    }

    @Override
    public Optional<List<BranchEntity>> findByStreet(String street) {

        try {

            String jpql = "SELECT b FROM BranchEntity b WHERE b.street = :street";

            @SuppressWarnings("unchecked")
            List<BranchEntity> listBranch = (List<BranchEntity>) entityManager.createQuery(jpql)
                    .setParameter("street", street)
                    .getResultList();

            return Optional.of(listBranch);

        } catch (Exception e) {

            throw new RuntimeException("Error, doesn´t exist that branch", e);
        }
    }

}
