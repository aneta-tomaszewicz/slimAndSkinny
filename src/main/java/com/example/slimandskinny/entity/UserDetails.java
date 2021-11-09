package com.example.slimandskinny.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.HashMap;
import java.util.Map;


@Entity
public class UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int age;
    private double weight;
    private int height;
    private String gender;
    private String activity;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public Map<Double, String> getMap() {
        Map<Double, String> physicalActivity = new HashMap<>();
        physicalActivity.put(1.2, "Extremely inactive");
        physicalActivity.put(1.3, "Sedentary");
        physicalActivity.put(1.5, "Moderately active");
        physicalActivity.put(1.7, "Vigorously active");
        physicalActivity.put(2.0, "Extremely active");
        return physicalActivity;

    }
}




