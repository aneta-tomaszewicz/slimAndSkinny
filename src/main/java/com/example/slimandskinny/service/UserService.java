package com.example.slimandskinny.service;

import com.example.slimandskinny.entity.User;

public interface UserService {


    User findByUserEmail(String email);
    void saveUser(User user);
}
