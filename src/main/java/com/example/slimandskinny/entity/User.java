package com.example.slimandskinny.entity;

import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import java.util.Collection;
import java.util.Set;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, unique = true)
    private String email;
    private String password;
    private String firstName;
   /* private int enabled;*/
   /* @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))*/
    private String role = "user";

    @OneToOne(cascade = CascadeType.ALL)
    private UserDetails userDetails;



    public User(String email, String password, Collection<? extends GrantedAuthority> authorities) {

    }

    public User(long id, String email, String password, String firstName, /*String role*/ UserDetails userDetails) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.firstName = firstName;
      /*  this.role = role;*/
        this.userDetails = userDetails;
    }

    public User() {

    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
/*  public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;*/
  //  }

    public UserDetails getUserDetails() {
        return userDetails;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public void setUserDetails(UserDetails userDetails) {
        this.userDetails = userDetails;
    }
}


