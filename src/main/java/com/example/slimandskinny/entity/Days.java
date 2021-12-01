package com.example.slimandskinny.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Days {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private int dayOfMonth;
    private int dayOfWeek;



}
