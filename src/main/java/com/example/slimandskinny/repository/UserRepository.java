package com.example.slimandskinny.repository;
import com.example.slimandskinny.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {

   User findUserByEmailAndAndPassword(String email, String password);
   User findUserByEmail(String email);


}
