package com.matias.exercise_routine_gym_api.api_gym.model_gym;

import java.util.List;

public class Client {

    private String name;

    private String dni;

    private String phone;

    private String email;

    private List<TrainingPlan> trainingPlans;

    public Client(String name, String dni, String phone, String email) {
        this.name = name;
        this.dni = dni;
        this.phone = phone;
        this.email = email;
    }

    public Client(String name, String dni, String phone, String email, List<TrainingPlan> trainingPlans) {
        this.name = name;
        this.dni = dni;
        this.phone = phone;
        this.email = email;
        this.trainingPlans = trainingPlans;
    }

    public String getName() {
        return name;
    }

    public String getDni() {
        return dni;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<TrainingPlan> getTrainingPlans() {
        return trainingPlans;
    }

    public void setTrainingPlans(List<TrainingPlan> trainingPlans) {
        this.trainingPlans = trainingPlans;
    }

}
