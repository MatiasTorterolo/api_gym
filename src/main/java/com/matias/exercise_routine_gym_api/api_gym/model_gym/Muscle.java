package com.matias.exercise_routine_gym_api.api_gym.model_gym;

import java.util.List;

public class Muscle {

    private Long id;

    private String name;

    private List<MusclePart> muscleParts;

    public Muscle() {
    }

    public Muscle(String name, List<MusclePart> muscleParts) {
        this.name = name;
        this.muscleParts = muscleParts;
    }

    public Muscle(Long id, String name, List<MusclePart> muscleParts) {
        this.id = id;
        this.name = name;
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

}
