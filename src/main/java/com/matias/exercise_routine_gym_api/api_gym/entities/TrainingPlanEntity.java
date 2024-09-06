package com.matias.exercise_routine_gym_api.api_gym.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class TrainingPlanEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "type_id")
    private TrainingPlanTypeEntity type;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private ClientEntity client;

    @ManyToOne
    @JoinColumn(name = "trainer_id")
    private TrainerEntity trainer;

    @OneToMany(mappedBy = "trainingPlan", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<RoutineEntity> routines;

    private Date creationDate;

    public TrainingPlanEntity() {
        routines = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public TrainingPlanTypeEntity getType() {
        return type;
    }

    public ClientEntity getClient() {
        return client;
    }

    public void setClient(ClientEntity client) {
        this.client = client;
    }

    public List<RoutineEntity> getRoutines() {
        return routines;
    }

    public void setRoutines(List<RoutineEntity> routines) {
        this.routines = routines;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public TrainerEntity getTrainer() {
        return trainer;
    }

    public void setType(TrainingPlanTypeEntity type) {
        this.type = type;
    }

    // clientEntity_id MuscleGroupRepository

    // TrainingPlanEntity static fromDomainObject(TrainingPlan trainingPlan) {

}
