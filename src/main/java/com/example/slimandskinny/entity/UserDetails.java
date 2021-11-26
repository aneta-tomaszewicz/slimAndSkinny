package com.example.slimandskinny.entity;

import javax.persistence.*;


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

    public User getUser(long id) {
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

    public UserDetails setAge(int age) {
        this.age = age;
        return null;

    }

    public double getWeight() {
        return weight;
    }

    public UserDetails setWeight(double weight) {
        this.weight = weight;
        return null;
    }

    public int getHeight() {
        return height;
    }

    public UserDetails setHeight(int height) {
        this.height = height;
        return null;
    }

    public int getGender() {
        return gender;
    }

    public UserDetails setGender(int gender) {
        this.gender = gender;
        return null;
    }

    public double getActivity() {
        return activity;
    }

    public UserDetails setActivity(double activity) {
        this.activity = activity;
        return null;
    }

    public int getPurpose() {
        return purpose;
    }

    public UserDetails setPurpose(int purpose) {
        this.purpose = purpose;
        return null;
    }


}




