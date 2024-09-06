package com.matias.exercise_routine_gym_api.api_gym.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "trainers")
public class TrainerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(min = 5, max = 50)
    private String name;

    @NotBlank
    @Size(min = 8, max = 9)
    @Column(unique = true)
    private String dni;

    @ManyToOne
    @JoinColumn(name = "branch_id")
    private BranchEntity branch;

    @NotBlank
    @Size(min = 12)
    @Column(unique = true)
    private String email;

    @NotBlank
    @Size(min = 10, max = 10)
    @Column(unique = true)
    private String phone;

    public TrainerEntity() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDni() {
        return dni;
    }

    public BranchEntity getBranch() {
        return branch;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setBranch(BranchEntity branch) {
        this.branch = branch;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}
