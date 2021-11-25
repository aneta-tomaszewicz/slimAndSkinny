package com.example.slimandskinny.service;



import org.springframework.security.core.userdetails.*;
import com.example.slimandskinny.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.Collections;


public class SpringDataUserDetailsService implements UserDetailsService {

    private UserRepository userRepository;



    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public UserDetails loadUserByUsername(String email)throws UsernameNotFoundException  {
        com.example.slimandskinny.entity.User user = userRepository.findUserByEmail(email);
        if (user == null) {
            throw new UsernameNotFoundException(email);
        }
       GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(user.getRole());
        /*return new User(user.getEmail(), user.getPassword(), Collections.emptyList());*/
        return CurrentUser(user.getEmail(),user.getPassword(),
                grantedAuthorities, user);


    }

}


