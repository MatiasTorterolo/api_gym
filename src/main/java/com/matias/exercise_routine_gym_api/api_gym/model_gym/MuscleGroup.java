package com.matias.exercise_routine_gym_api.api_gym.model_gym;

import java.util.List;

public class MuscleGroup {

    private Long id;

    private String name;

    private List<Muscle> muscles;

    public MuscleGroup() {
    }

    public MuscleGroup(String name, List<Muscle> muscles) {
        this.name = name;
        this.muscles = muscles;
    }

    public MuscleGroup(Long id, String name, List<Muscle> muscles) {
        this.id = id;
        this.name = name;
        this.muscles = muscles;
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

    public List<Muscle> getMuscles() {
        return muscles;
    }

    public void setMuscles(List<Muscle> muscles) {
        this.muscles = muscles;
    }

}
