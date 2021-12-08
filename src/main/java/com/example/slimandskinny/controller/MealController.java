package com.example.slimandskinny.controller;

import com.example.slimandskinny.entity.Meal;
import com.example.slimandskinny.entity.User;
import com.example.slimandskinny.entity.UserDetails;
import com.example.slimandskinny.repository.MealRepository;
import com.example.slimandskinny.repository.UserDetailsRepository;
import com.example.slimandskinny.repository.UserRepository;
import com.example.slimandskinny.service.CurrentUser;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.apache.catalina.LifecycleState;
import org.springframework.data.domain.Sort;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@Controller
@AllArgsConstructor

public class MealController {

    private final MealRepository mealRepository;
    private final UserRepository userRepository;



    @GetMapping("/add")
    public String addEatenCalories(Model model) {
        model.addAttribute("meal", new Meal());
        return "/calories/caloriesForm";
    }

    @PostMapping("/add")
    public String saveDateAndMeals(@ModelAttribute("meal") Meal meal) {

        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        User user = ((CurrentUser) auth.getPrincipal()).getUser();
        user = userRepository.getById(user.getId());
        meal.setUser(user);

        int sum;
        sum = meal.getBreakfast() + meal.getElevenses() + meal.getLunch() + meal.getTea() + meal.getSupper();
        meal.setSum(sum);

        User user1 = userRepository.getById(user.getId());
        UserDetails userDetails = user1.getUserDetails();

        int dayBalance;
        dayBalance = meal.getSum() -userDetails.getCaloriesDemand();
        meal.setDayBalance(dayBalance);


        mealRepository.save(meal);
        return "redirect:/all";
    }


    @GetMapping("/all")
    public String showAllCalories(Model model, Meal meal) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        User user = ((CurrentUser) auth.getPrincipal()).getUser();
        User user1 = userRepository.getById(user.getId());
        model.addAttribute("user", user1);
       // model.addAttribute("meal", mealRepository.findAll(Sort.by(Sort.Direction.DESC, "date")));
        model.addAttribute("meal", mealRepository.findAllByUser(user1));

        return "/calories/caloriesList";

    }

    @GetMapping("/edit")
    public String prepareEdit(@RequestParam long idToEdit, Model model) {
        model.addAttribute("meal", mealRepository.getById(idToEdit));
        return "/calories/caloriesForm";
    }


    @PostMapping("/edit")
    public String merge(@ModelAttribute("meal") Meal meal, long idToEdit) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        User user = ((CurrentUser) auth.getPrincipal()).getUser();
        user = userRepository.getById(user.getId());
        meal.setUser(user);
        int sum;
        sum = meal.getBreakfast() + meal.getElevenses() + meal.getLunch() + meal.getTea() + meal.getSupper();
        meal.setSum(sum);
        User user1 = userRepository.getById(user.getId());
        UserDetails userDetails = user1.getUserDetails();

        int dayBalance;
        dayBalance = meal.getSum() -userDetails.getCaloriesDemand();
        meal.setDayBalance(dayBalance);
        mealRepository.save(meal);
        return "redirect:/all";
    }

    @GetMapping("/remove")
    public String prepareRemove(@RequestParam long idToRemove, Model model) {
        model.addAttribute("meal", mealRepository.getById(idToRemove));
        return "calories/remove";
    }

    @PostMapping("/remove")
    public String remove(@RequestParam String confirmed, @RequestParam long idToRemove) {
        if ("yes".equals(confirmed)) {
            mealRepository.deleteById(idToRemove);
        }
        return "redirect:/all";
    }





}
