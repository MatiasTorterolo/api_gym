package com.matias.exercise_routine_gym_api.api_gym.model_gym;

import java.util.List;

public class Client {

    private Long id;

    private String name;

    private String dni;

    private String phone;

    private String emergencyPhone;

    private String email;

    private List<TrainingPlan> trainingPlans;

    public Client() {
    }

    public Client(String name, String dni, String phone, String emergencyPhone, String email,
            List<TrainingPlan> trainingPlans) {
        this.name = name;
        this.dni = dni;
        this.phone = phone;
        this.emergencyPhone = emergencyPhone;
        this.email = email;
        this.trainingPlans = trainingPlans;
    }

    public Client(Long id, String name, String dni, String phone, String emergencyPhone, String email,
            List<TrainingPlan> trainingPlans) {
        this.id = id;
        this.name = name;
        this.dni = dni;
        this.phone = phone;
        this.emergencyPhone = emergencyPhone;
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

    public void setName(String name) {
        this.name = name;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEmergencyPhone() {
        return emergencyPhone;
    }

    public void setEmergencyPhone(String emergencyPhone) {
        this.emergencyPhone = emergencyPhone;
    }

    public Long getId() {
        return id;
    }

}
