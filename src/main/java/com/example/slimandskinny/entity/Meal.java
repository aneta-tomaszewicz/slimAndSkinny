package com.example.slimandskinny.entity;

import javax.persistence.*;

@Entity
@Table(name = "meals")
public class Meal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String breakfast;
    private String elevenses;
    private String lunch;
    private String tea;
    private String supper;

    public Meal(long id, String breakfast, String elevenses, String lunch, String tea, String supper) {
        this.id = id;
        this.breakfast = breakfast;
        this.elevenses = elevenses;
        this.lunch = lunch;
        this.tea = tea;
        this.supper = supper;
    }

    public Meal() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBreakfast() {
        return breakfast;
    }

    public void setBreakfast(String breakfast) {
        this.breakfast = breakfast;
    }

    public String getElevenses() {
        return elevenses;
    }

    public void setElevenses(String elevenses) {
        this.elevenses = elevenses;
    }

    public String getLunch() {
        return lunch;
    }

    public void setLunch(String lunch) {
        this.lunch = lunch;
    }

    public String getTea() {
        return tea;
    }

    public void setTea(String tea) {
        this.tea = tea;
    }

    public String getSupper() {
        return supper;
    }

    public void setSupper(String supper) {
        this.supper = supper;
    }
}
