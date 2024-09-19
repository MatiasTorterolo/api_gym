package com.matias.exercise_routine_gym_api.api_gym.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "clients")
public class ClientEntity {

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

    @NotBlank
    @Size(min = 12)
    @Column(unique = true)
    private String email;

    @NotBlank
    @Size(min = 10, max = 10)
    @Column(unique = true)
    private String phone;

    @NotBlank
    @Size(min = 10, max = 10)
    private String emergencyPhone;

    public ClientEntity() {
    }

    public ClientEntity(Long id, @NotBlank @Size(min = 5, max = 50) String name,
            @NotBlank @Size(min = 8, max = 9) String dni, @NotBlank @Size(min = 12) String email,
            @NotBlank @Size(min = 10, max = 10) String phone,
            @NotBlank @Size(min = 10, max = 10) String emergencyPhone) {
        this.id = id;
        this.name = name;
        this.dni = dni;
        this.email = email;
        this.phone = phone;
        this.emergencyPhone = emergencyPhone;
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

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmergencyPhone() {
        return emergencyPhone;
    }

    public void setEmergencyPhone(String emergencyPhone) {
        this.emergencyPhone = emergencyPhone;
    }

}
