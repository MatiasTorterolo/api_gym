package com.matias.exercise_routine_gym_api.api_gym.model_gym;

public class MusclePart {

    private Long id;

    private String name;

    public MusclePart() {
    }

    public MusclePart(String name) {
        this.name = name;
    }

    public MusclePart(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

}
