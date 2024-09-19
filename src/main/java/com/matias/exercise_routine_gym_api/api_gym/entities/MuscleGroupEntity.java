package com.matias.exercise_routine_gym_api.api_gym.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

@Entity
public class MuscleGroupEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(min = 2, max = 30)
    private String name;

    @OneToMany(mappedBy = "muscleGroup", cascade = CascadeType.ALL, orphanRemoval = true)
    @NotEmpty
    private List<MuscleEntity> muscles;

    public MuscleGroupEntity() {
        muscles = new ArrayList<>();
    }

    public MuscleGroupEntity(Long id, @NotBlank @Size(min = 2, max = 30) String name,
            @NotEmpty List<MuscleEntity> muscles) {
        this.id = id;
        this.name = name;
        this.muscles = muscles;
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

    public List<MuscleEntity> getMuscles() {
        return muscles;
    }

    public void setMuscles(List<MuscleEntity> muscles) {
        this.muscles = muscles;
    }

}
