package com.example.slimandskinny.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
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
    private int caloriesDemand;

    @OneToOne(cascade = CascadeType.ALL)
    private User user;

}