package com.matias.exercise_routine_gym_api.api_gym.model_gym;

public class Branch {

    private Long id;

    private String street;

    private String number;

    public Branch() {
    }

    public Branch(String street, String number) {
        this.street = street;
        this.number = number;
    }

    public Branch(Long id, String street, String number) {
        this.id = id;
        this.street = street;
        this.number = number;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Long getId() {
        return id;
    }
}
