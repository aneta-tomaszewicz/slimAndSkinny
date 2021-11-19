package com.example.slimandskinny.entity;

import javax.persistence.*;
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
    private int gender;
    private double activity;
    private int purpose;

    @OneToOne(cascade = CascadeType.ALL)
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

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

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public double getActivity() {
        return activity;
    }

    public void setActivity(double activity) {
        this.activity = activity;
    }

    public int getPurpose() {
        return purpose;
    }

    public void setPurpose(int purpose) {
        this.purpose = purpose;
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




