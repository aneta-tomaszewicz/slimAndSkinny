package com.example.slimandskinny.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
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
    private String date;
    private Integer breakfast;
    private Integer elevenses;
    private Integer lunch;
    private Integer tea;
    private Integer supper;
    private Integer sum;
    private Integer dayBalance;
    private Integer mealDemand;

    @ManyToOne
    private User user;


}
