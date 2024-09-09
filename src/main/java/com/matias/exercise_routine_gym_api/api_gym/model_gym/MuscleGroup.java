package com.matias.exercise_routine_gym_api.api_gym.model_gym;

public class MuscleGroup {

    private Long id;

    private String name;

    public MuscleGroup() {
    }

    public MuscleGroup(String name) {
        this.name = name;
    }

    public MuscleGroup(Long id, String name) {
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
