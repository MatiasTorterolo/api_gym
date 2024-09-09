package com.matias.exercise_routine_gym_api.api_gym.model_gym;

public class Trainer {

    private Long id;

    private String name;

    private String dni;

    private Branch branch;

    private String email;

    private String phone;

    public Trainer() {
    }

    public Trainer(String name, String dni, Branch branch, String email, String phone) {
        this.name = name;
        this.dni = dni;
        this.branch = branch;
        this.email = email;
        this.phone = phone;
    }

    public Trainer(Long id, String name, String dni, Branch branch, String email, String phone) {
        this.id = id;
        this.name = name;
        this.dni = dni;
        this.branch = branch;
        this.email = email;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getDni() {
        return dni;
    }

    public Branch getBranch() {
        return branch;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Long getId() {
        return id;
    }

}
