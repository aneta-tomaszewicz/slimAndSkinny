package com.example.slimandskinny.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
public class UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    private int age;
    @NotNull
    private double weight;
    @NotNull
    private int height;
    @NotNull
    private int gender;
    @NotNull
    private double activity;
    @NotNull
    private int purpose;
    private int caloriesDemand;


}