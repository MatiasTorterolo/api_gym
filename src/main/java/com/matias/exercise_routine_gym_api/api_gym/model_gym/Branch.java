package com.matias.exercise_routine_gym_api.api_gym.model_gym;

public class Branch {

    private Long id;

    private String adress;

    private String number;

    public Branch() {
    }

    public Branch(String adress, String number) {
        this.adress = adress;
        this.number = number;
    }

    public Branch(Long id, String adress, String number) {
        this.id = id;
        this.adress = adress;
        this.number = number;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
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
