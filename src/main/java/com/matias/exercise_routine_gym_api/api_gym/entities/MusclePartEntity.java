package com.matias.exercise_routine_gym_api.api_gym.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class MusclePartEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(min = 2, max = 30)
    private String name;

    @ManyToOne
    @JoinColumn(name = "muscle_id")
    @NotBlank
    @Size(min = 2, max = 30)
    private MuscleEntity muscle;

    public MusclePartEntity() {
    }

    public MusclePartEntity(Long id, @NotBlank @Size(min = 2, max = 30) String name,
            @NotBlank @Size(min = 2, max = 30) MuscleEntity muscle) {
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

    public MuscleEntity getMuscle() {
        return muscle;
    }

    public void setMuscle(MuscleEntity muscle) {
        this.muscle = muscle;
    }

}
