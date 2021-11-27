package com.example.slimandskinny.service;
import com.example.slimandskinny.entity.User;
import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

public class CurrentUser extends org.springframework.security.core.userdetails.User {
    private final User user;


    public CurrentUser(String email, String password,
                       Collection<? extends GrantedAuthority> authorities,
                       com.example.slimandskinny.entity.User user) {
        super(email, password, authorities);
        this.user = user;
    }

    public com.example.slimandskinny.entity.User getUser() {
        return user;}
}
