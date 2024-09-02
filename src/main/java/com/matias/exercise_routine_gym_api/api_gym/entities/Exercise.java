package com.matias.exercise_routine_gym_api.api_gym.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Exercise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long photo_id;

    private Long muscle_id;

    private Integer sets;

    private List<Integer> reps;

    private boolean toFailure;

    private String consideration;

    public Exercise() {
        reps = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public Long getPhoto_id() {
        return photo_id;
    }

    public Long getMuscle_id() {
        return muscle_id;
    }

    public Integer getSets() {
        return sets;
    }

    public List<Integer> getReps() {
        return reps;
    }

    public boolean isToFailure() {
        return toFailure;
    }

    public String getConsideration() {
        return consideration;
    }

    public void setPhoto_id(Long photo_id) {
        this.photo_id = photo_id;
    }

    public void setMuscle_id(Long muscle_id) {
        this.muscle_id = muscle_id;
    }

    public void setSets(int sets) {
        this.sets = sets;
    }

    public void setReps(List<Integer> reps) {
        this.reps = reps;
    }

    public void setToFailure(boolean toFailure) {
        this.toFailure = toFailure;
    }

    public void setConsideration(String consideration) {
        this.consideration = consideration;
    }

}
