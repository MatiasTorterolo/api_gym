package com.matias.exercise_routine_gym_api.api_gym.model_gym;

public class TrainingPlanType {

    // tipo de entrenamiento
    // Planes de entrenamientoTODO EL CUERPO ejercicios básicos
    // Planes de entrenamiento SPLIT (atención en push, pull, piernas, de distintas
    // partes del cuerpo)
    // Plan de entrenamiento de REHABILITACION (atención en la movilidad y la
    // regeneración después de lesiones)
    // Planes de entrenamiento de RESISTENCIA (atención en la resistencia básica o
    // el entrenamiento de intervalos)
    private String type;

    public TrainingPlanType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
