package com.matias.exercise_routine_gym_api.api_gym.model_gym;

public class Client {

    private Long id;

    private String name;

    private String dni;

    private String phone;

    private String emergencyPhone;

    private String email;

    public Client() {
    }

    public Client(String name, String dni, String phone, String emergencyPhone, String email) {
        this.name = name;
        this.dni = dni;
        this.phone = phone;
        this.emergencyPhone = emergencyPhone;
        this.email = email;
    }

    public Client(Long id, String name, String dni, String phone, String emergencyPhone, String email) {
        this.id = id;
        this.name = name;
        this.dni = dni;
        this.phone = phone;
        this.emergencyPhone = emergencyPhone;
        this.email = email;
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

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEmergencyPhone() {
        return emergencyPhone;
    }

    public void setEmergencyPhone(String emergencyPhone) {
        this.emergencyPhone = emergencyPhone;
    }

    public Long getId() {
        return id;
    }

}
