package com.matias.exercise_routine_gym_api.api_gym.model_gym;

import java.util.Date;
import java.util.List;

public class TrainingPlan {

    private TrainingPlanType name;

    private Client client;

    private Trainer trainer;

    private List<Routine> routines;

    private Date creationDate;

    public TrainingPlan(TrainingPlanType name, Client client, Trainer trainer, List<Routine> routines,
            Date creationDate) {
        this.name = name;
        this.client = client;
        this.trainer = trainer;
        this.routines = routines;
        this.creationDate = creationDate;
    }

    public TrainingPlanType getTrainingPlanName() {
        return name;
    }

    public void setTrainingPlanName(TrainingPlanType name) {
        this.name = name;
    }

    public Client getClient() {
        return client;
    }

    public List<Routine> getRoutines() {
        return routines;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setRoutines(List<Routine> routines) {
        this.routines = routines;
    }

    public TrainingPlanType getName() {
        return name;
    }

    public void setName(TrainingPlanType name) {
        this.name = name;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

}
