package com.matias.exercise_routine_gym_api.api_gym.model_gym;

import java.util.List;

public class User {

    private String dni;

    private String password;

    private List<Role> role;

    public User(String dni, String password, List<Role> role) {
        this.dni = dni;
        this.password = password;
        this.role = role;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Role> getRole() {
        return role;
    }

    public void setRole(List<Role> role) {
        this.role = role;
    }

}
