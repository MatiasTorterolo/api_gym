package com.matias.exercise_routine_gym_api.api_gym.model_gym;

public class MuscleGroup {

    private String name;

    private Muscle muscle;

    private String consideration;

    public MuscleGroup(String name, Muscle muscle, String consideration) throws ClassNotFoundException {
        this.name = Class.forName(getConsideration()).getName();
        this.muscle = muscle;
        this.consideration = consideration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Muscle getMuscle() {
        return muscle;
    }

    public void setMuscles(Muscle muscle) {
        this.muscle = muscle;
    }

    public String getConsideration() {
        return consideration;
    }

    public void setConsideration(String consideration) {
        this.consideration = consideration;
    }

}
