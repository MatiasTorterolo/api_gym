package com.matias.exercise_routine_gym_api.api_gym.entities;

import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class RoutineEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long muscleGroup_id;

    private List<Long> exersice_id;

    private List<DayOfWeek> days;

    public RoutineEntity() {
        exersice_id = new ArrayList<>();
        days = new ArrayList<>();
    }

    public Long getMuscleGroup_id() {
        return muscleGroup_id;
    }

    public void setMuscleGroup_id(Long muscleGroup_id) {
        this.muscleGroup_id = muscleGroup_id;
    }

    public List<Long> getExersice_id() {
        return exersice_id;
    }

    public void setExersice_id(List<Long> exersice_id) {
        this.exersice_id = exersice_id;
    }

    public List<DayOfWeek> getDays() {
        return days;
    }

    public void setDays(List<DayOfWeek> days) {
        this.days = days;
    }

    public Long getId() {
        return id;
    }

}
