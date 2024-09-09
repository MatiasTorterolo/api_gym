package com.matias.exercise_routine_gym_api.api_gym.model_gym;

import java.time.DayOfWeek;
import java.util.List;

public class Routine {

    private Long id;

    private MuscleGroup muscleGroup;

    private List<Exercise> exersices;

    private List<DayOfWeek> days;

    public Routine() {
    }

    public Routine(MuscleGroup muscleGroup, List<Exercise> exersices, List<DayOfWeek> days) {
        this.muscleGroup = muscleGroup;
        this.exersices = exersices;
        this.days = days;
    }

    public Routine(Long id, MuscleGroup muscleGroup, List<Exercise> exersices, List<DayOfWeek> days) {
        this.id = id;
        this.muscleGroup = muscleGroup;
        this.exersices = exersices;
        this.days = days;
    }

    public List<Exercise> getExersices() {
        return exersices;
    }

    public void setExersices(List<Exercise> exersices) {
        this.exersices = exersices;
    }

    public List<DayOfWeek> getDays() {
        return days;
    }

    public void setDays(List<DayOfWeek> days) {
        this.days = days;
    }

    public MuscleGroup getMuscleGroup() {
        return muscleGroup;
    }

    public void setMuscleGroup(MuscleGroup muscleGroup) {
        this.muscleGroup = muscleGroup;
    }

    public Long getId() {
        return id;
    }
}
