package com.matias.exercise_routine_gym_api.api_gym.model_gym;

import java.util.List;

public class Exercise {

    private Long id;

    private String photo; // este string va a tener que hacer referencia a la url de una foto asi aunq
                          // hayan 50 ejercicios iguales de biceps, solo se guarda en la db la referencia
                          // a la foto

    private Muscle muscle;

    private Integer sets;

    private List<Integer> reps;

    private boolean toFailure;

    private String consideration;

    public Exercise() {
    }

    public Exercise(String photo, Muscle muscle, Integer sets, List<Integer> reps, boolean toFailure,
            String consideration) {

        this.photo = photo;
        this.muscle = muscle;
        this.sets = sets;
        this.reps = reps;
        this.toFailure = toFailure;
        this.consideration = consideration;
    }

    public Exercise(Long id, String photo, Muscle muscle, Integer sets, List<Integer> reps, boolean toFailure,
            String consideration) {
        this.id = id;
        this.photo = photo;
        this.muscle = muscle;
        this.sets = sets;
        this.reps = reps;
        this.toFailure = toFailure;
        this.consideration = consideration;
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

    public Integer getSets() {
        return sets;
    }

    public void setSets(Integer sets) {
        this.sets = sets;
    }

    public List<Integer> getReps() {
        return reps;
    }

    public void setReps(List<Integer> reps) {
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

    public Long getId() {
        return id;
    }

}
