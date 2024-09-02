package com.matias.exercise_routine_gym_api.api_gym.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TrainingPlanEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long type_id;

    private Long client_id;

    private Long trainer_id;

    private List<Long> routines_id;

    private Date creationDate;

    public TrainingPlanEntity() {
        routines_id = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public Long getType_id() {
        return type_id;
    }

    public Long getClient_id() {
        return client_id;
    }

    public void setClient_id(Long client_id) {
        this.client_id = client_id;
    }

    public List<Long> getRoutines_id() {
        return routines_id;
    }

    public void setRoutines_id(List<Long> routines_id) {
        this.routines_id = routines_id;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public Long getTrainer_id() {
        return trainer_id;
    }

    public void setType_id(Long type_id) {
        this.type_id = type_id;
    }

    // clientEntity_id MuscleGroupRepository

    // TrainingPlanEntity static fromDomainObject(TrainingPlan trainingPlan) {

}
