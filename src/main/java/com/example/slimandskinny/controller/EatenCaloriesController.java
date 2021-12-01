package com.example.slimandskinny.controller;

import com.example.slimandskinny.entity.Meal;
import com.example.slimandskinny.entity.User;
import com.example.slimandskinny.repository.MealRepository;
import com.example.slimandskinny.service.CurrentUser;
import lombok.AllArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;

@Controller
@AllArgsConstructor
public class EatenCaloriesController {

    private final MealRepository mealRepository;

    @GetMapping("/eatenCalories")
    public String addEatenCalories(Model model) {
        model.addAttribute("meal", new Meal());
        return "user/eatenCalories";
    }

    @PostMapping("/eatenCalories")
    public String saveDateAndBreakfast (@RequestParam String date,@RequestParam (required = false) Integer breakfast){
       Meal meal = new Meal();
       meal.setDate(date);
       meal.setBreakfast(breakfast);
        mealRepository.save(meal);
        return "/user/eatenCalories2";
    }

}
