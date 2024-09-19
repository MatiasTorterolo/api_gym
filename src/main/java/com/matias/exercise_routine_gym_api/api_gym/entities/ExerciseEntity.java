package com.matias.exercise_routine_gym_api.api_gym.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "excercises")
public class ExerciseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // relacion unidireccional, solo esta entidad tiene una referencia a la entidad
    // musculo
    @ManyToOne
    @JoinColumn(name = "phot_id")
    private PhotoEntity photo;

    // relacion unidireccional, solo esta entidad tiene una referencia a la entidad
    // musculo
    @ManyToOne
    @JoinColumn(name = "muscle_id")
    private MuscleEntity muscle;

    @NotBlank
    @Size(min = 2, max = 8)
    private Integer sets;

    @NotEmpty
    private List<Integer> reps;

    @NotBlank
    private boolean toFailure;

    private String consideration;

    @ManyToOne
    @JoinColumn(name = "routine_id")
    private RoutineEntity routine;

    public ExerciseEntity() {
        reps = new ArrayList<>();
    }

    public ExerciseEntity(Long id, PhotoEntity photo, MuscleEntity muscle,
            @NotBlank @Size(min = 2, max = 8) Integer sets, @NotEmpty List<Integer> reps, @NotBlank boolean toFailure,
            String consideration, RoutineEntity routine) {
        this.id = id;
        this.photo = photo;
        this.muscle = muscle;
        this.sets = sets;
        this.reps = reps;
        this.toFailure = toFailure;
        this.consideration = consideration;
        this.routine = routine;
    }

    public Long getId() {
        return id;
    }

    public PhotoEntity getPhoto() {
        return photo;
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

    public void setPhoto(PhotoEntity photo) {
        this.photo = photo;
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

    public MuscleEntity getMuscle() {
        return muscle;
    }

    public void setMuscle(MuscleEntity muscle) {
        this.muscle = muscle;
    }

    public void setSets(Integer sets) {
        this.sets = sets;
    }

    public RoutineEntity getRoutine() {
        return routine;
    }

    public void setRoutine(RoutineEntity routine) {
        this.routine = routine;
    }

}
