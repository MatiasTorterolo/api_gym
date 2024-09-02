package com.matias.exercise_routine_gym_api.api_gym.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

@Entity
public class MuscleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String name;

    private List<Long> musclePart_id;

    public MuscleEntity() {
        musclePart_id = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Long> getMusclePart_id() {
        return musclePart_id;
    }

    public void setMusclePart_id(List<Long> musclePart_id) {
        this.musclePart_id = musclePart_id;
    }

    public Long getId() {
        return id;
    }

}
