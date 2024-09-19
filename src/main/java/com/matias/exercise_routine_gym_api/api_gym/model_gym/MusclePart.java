package com.matias.exercise_routine_gym_api.api_gym.model_gym;

public class MusclePart {

    private Long id;

    private String name;

    private Muscle muscle;

    public MusclePart() {
    }

    public MusclePart(String name) {
        this.name = name;
    }

    public MusclePart(Long id, String name, Muscle muscle) {
        this.id = id;
        this.name = name;
        this.muscle = muscle;
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

    public Muscle getMuscle() {
        return muscle;
    }

    public void setMuscle(Muscle muscle) {
        this.muscle = muscle;
    }

}
