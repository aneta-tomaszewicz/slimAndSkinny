package com.example.slimandskinny.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;


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
    @DateTimeFormat(pattern="dd/MM/yyyy")
    private String date;
    private Integer breakfast;
    private Integer elevenses;
    private Integer lunch;
    private Integer tea;
    private Integer supper;
    private Integer sum;
    private Integer dayBalance;


    @ManyToOne
    private User user;


}
