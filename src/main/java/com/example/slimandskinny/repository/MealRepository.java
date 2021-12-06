package com.example.slimandskinny.repository;

import com.example.slimandskinny.entity.Meal;
import com.example.slimandskinny.entity.User;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MealRepository extends JpaRepository<Meal, Long> {
    Meal findMealByUserId(User user);

/*    List<Meal>findAllByDateOrderByDateDesc();

    @Override
    List<Meal> findAll(Sort sort);*/


    //Meal findAllByDateOrderByDateDesc();

 /*   @Query("select m from Meal m sort")
    List<Meal>methodToSortedByDate();*/



}
