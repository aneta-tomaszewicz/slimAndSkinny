package com.example.slimandskinny.repository;

import com.example.slimandskinny.entity.Meal;
import com.example.slimandskinny.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MealRepository extends JpaRepository<Meal, Long> {
    Meal findMealByUserId(User user);
}
