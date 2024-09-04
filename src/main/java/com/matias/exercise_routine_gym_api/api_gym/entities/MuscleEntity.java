package com.matias.exercise_routine_gym_api.api_gym.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

@Entity
public class MuscleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(min = 2, max = 30)
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "muscleGroup_id")
    private MuscleGroupEntity muscleGroup;

    @OneToMany(mappedBy = "muscle", cascade = CascadeType.ALL, orphanRemoval = true)
    @NotEmpty
    private List<MusclePartEntity> musclePart;

    public MuscleEntity() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MuscleGroupEntity getMuscleGroup() {
        return muscleGroup;
    }

    public void setMuscleGroup(MuscleGroupEntity muscleGroup) {
        this.muscleGroup = muscleGroup;
    }

    public List<MusclePartEntity> getMuscleParts() {
        return musclePart;
    }

    public void setMusclePart(List<MusclePartEntity> musclePart) {
        this.musclePart = musclePart;
    }

    public Long getId() {
        return id;
    }

}
