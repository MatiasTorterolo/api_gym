package com.matias.exercise_routine_gym_api.api_gym.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "excercises")
public class ExerciseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private PhotoEntity photo;

    @ManyToOne
    private MuscleEntity muscle;

    @NotBlank
    @Size(min = 2, max = 8)
    private Integer sets;

    @NotBlank
    private List<Integer> reps;

    @NotBlank
    private boolean toFailure;

    private String consideration;

    public ExerciseEntity() {
        reps = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public PhotoEntity getPhoto() {
        return photo;
    }

    public MuscleEntity getMuscleEntity() {
        return muscle;
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

    public void setMuscleEntity(MuscleEntity muscle) {
        this.muscle = muscle;
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
