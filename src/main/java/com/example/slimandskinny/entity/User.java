package com.example.slimandskinny.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, unique = true)
    private String email;
    private String password;
    private String firstName;
    private String role = "user";

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="userDetailsId")
    private UserDetails userDetails;


    @ManyToMany
    private List<Meal> meals = new ArrayList<>();





}


