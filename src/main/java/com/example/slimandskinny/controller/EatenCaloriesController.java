package com.example.slimandskinny.controller;

import com.example.slimandskinny.entity.Meal;
import com.example.slimandskinny.entity.User;
import com.example.slimandskinny.entity.UserDetails;
import com.example.slimandskinny.repository.MealRepository;
import com.example.slimandskinny.repository.UserRepository;
import com.example.slimandskinny.service.CurrentUser;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
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
    private final UserRepository userRepository;

    @GetMapping("/eatenCalories")
    public String addEatenCalories(Model model) {
        model.addAttribute("meal", new Meal());
        return "/eatenCalories/eatenCalories";
    }

    @PostMapping("/eatenCalories")
    public String saveDateAndBreakfast (@ModelAttribute("meals") Meal meal){
      /* Meal meal = new Meal();*/
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        User user =((CurrentUser)auth.getPrincipal()).getUser();
        user = userRepository.getById(user.getId());
        meal.setUser(user);
    /*    meal.setDate(date);
        meal.setBreakfast(breakfast);
        mealRepository.save(meal);*/
        return "/eatenCalories/breakfast";
    }

}
