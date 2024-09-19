package com.matias.exercise_routine_gym_api.api_gym.model_gym;

import java.util.List;

public class Muscle {

    private Long id;

    private String name;

    private MuscleGroup muscleGroup;

    private List<MusclePart> muscleParts;

    public Muscle() {
    }

    public Muscle(String name, MuscleGroup muscleGroup, List<MusclePart> muscleParts) {
        this.name = name;
        this.muscleGroup = muscleGroup;
        this.muscleParts = muscleParts;
    }

    public Muscle(Long id, String name, MuscleGroup muscleGroup, List<MusclePart> muscleParts) {
        this.id = id;
        this.name = name;
        this.muscleGroup = muscleGroup;
        this.muscleParts = muscleParts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<MusclePart> getMuscleParts() {
        return muscleParts;
    }

    public void setMusclePart(List<MusclePart> muscleParts) {
        this.muscleParts = muscleParts;
    }

    public Long getId() {
        return id;
    }

    public MuscleGroup getMuscleGroup() {
        return muscleGroup;
    }

    public void setMuscleGroup(MuscleGroup muscleGroup) {
        this.muscleGroup = muscleGroup;
    }

    public void setMuscleParts(List<MusclePart> muscleParts) {
        this.muscleParts = muscleParts;
    }

}
