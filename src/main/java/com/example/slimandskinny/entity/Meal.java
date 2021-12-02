package com.example.slimandskinny.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "meals")
public class Meal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String date;
    private Integer breakfast = 0;
    private Integer elevenses= 0;
    private Integer lunch= 0;
    private Integer tea= 0;
    private Integer supper= 0;

    @ManyToOne
    private User user;


}
