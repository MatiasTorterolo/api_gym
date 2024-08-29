package com.matias.exercise_routine_gym_api.api_gym.model_gym;

public class Exercise {

    private String name;

    private String photo; // este string va a tener que hacer referencia a la url de una foto asi aunq
                          // hayan 50 ejercicios iguales de biceps, solo se guarda en la db la referencia
                          // a la foto

    private Muscle muscle;

    private int sets;

    private int reps;

    private boolean toFailure;

    private String consideration;

    public Exercise(String name, String photo, Muscle muscle, int sets, int reps, boolean toFailure,
            String consideration) {
        this.name = name;
        this.photo = photo;
        this.muscle = muscle;
        this.sets = sets;
        this.reps = reps;
        this.toFailure = toFailure;
        this.consideration = consideration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Muscle getMuscle() {
        return muscle;
    }

    public void setMuscle(Muscle muscle) {
        this.muscle = muscle;
    }

    public int getSets() {
        return sets;
    }

    public void setSets(int sets) {
        this.sets = sets;
    }

    public int getReps() {
        return reps;
    }

    public void setReps(int reps) {
        this.reps = reps;
    }

    public boolean isToFailure() {
        return toFailure;
    }

    public void setToFailure(boolean toFailure) {
        this.toFailure = toFailure;
    }

    public String getConsideration() {
        return consideration;
    }

    public void setConsideration(String consideration) {
        this.consideration = consideration;
    }

}
