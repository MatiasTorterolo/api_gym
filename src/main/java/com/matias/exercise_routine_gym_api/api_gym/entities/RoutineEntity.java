package com.matias.exercise_routine_gym_api.api_gym.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class RoutineEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "muscleGroup_id")
    private MuscleGroupEntity muscleGroup;

    @OneToMany(mappedBy = "routine", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ExerciseEntity> exersices;

    // esta lista en la entidad deberia ser de enteros ya que en el dominio, la
    // lista
    // seria de "DaysOfWeek" que representa a los dias de la semana en enteros del 1
    // al 7
    // 1 = lunes, 2 = martes, 3 = miercoles, etc
    private List<Integer> days;

    @ManyToOne
    @JoinColumn(name = "trainingPlan_id")
    private TrainingPlanEntity trainingPlan;

    public RoutineEntity() {
        exersices = new ArrayList<>();
        days = new ArrayList<>();
    }

    public MuscleGroupEntity getMuscleGroup() {
        return muscleGroup;
    }

    public void setMuscleGroup(MuscleGroupEntity muscleGroup) {
        this.muscleGroup = muscleGroup;
    }

    public List<ExerciseEntity> getExersices() {
        return exersices;
    }

    public void setExersices(List<ExerciseEntity> exersices) {
        this.exersices = exersices;
    }

    public List<Integer> getDays() {
        return days;
    }

    public void setDays(List<Integer> days) {
        this.days = days;
    }

    public Long getId() {
        return id;
    }

    public TrainingPlanEntity getTrainingPlan() {
        return trainingPlan;
    }

    public void setTrainingPlan(TrainingPlanEntity trainingPlan) {
        this.trainingPlan = trainingPlan;
    }

}
