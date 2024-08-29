package com.matias.exercise_routine_gym_api.api_gym.model_gym;

public class User {

    private String dni;

    private String password;

    public enum role {

        ADMIN,
        TRAINER,
        CLIENT
    }

    public User(String dni, String password) {
        this.dni = dni;
        this.password = password;
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
    };

}
