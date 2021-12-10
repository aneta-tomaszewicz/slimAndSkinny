package com.example.slimandskinny.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;


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
    @NotNull
    private String date;
    @NotNull
    private Integer breakfast;
    @NotNull
    private Integer elevenses;
    @NotNull
    private Integer lunch;
    @NotNull
    private Integer tea;
    @NotNull
    private Integer supper;
    private Integer sum;
    private Integer dayBalance;


    @ManyToOne
    private User user;


}
