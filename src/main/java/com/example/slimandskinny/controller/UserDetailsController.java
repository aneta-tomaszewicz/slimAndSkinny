package com.example.slimandskinny.controller;

import com.example.slimandskinny.entity.User;
import com.example.slimandskinny.entity.UserDetails;
import com.example.slimandskinny.repository.UserDetailsRepository;
import com.example.slimandskinny.repository.UserRepository;
import com.example.slimandskinny.service.CurrentUser;
import lombok.AllArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import javax.validation.Validator;

@AllArgsConstructor
@Controller
public class UserDetailsController {

    private final UserDetailsRepository userDetailsRepository;
    private final UserRepository userRepository;
    private final Validator validator;


    @GetMapping("/calculator")
    public String calculateData() {
        return "/user/caloriesCalculator";

    }

    @PostMapping("/calculator")

    public String calculateCalories(@RequestParam (required = false) Integer age, @RequestParam(required = false) Double weight, @RequestParam(required = false) Integer height,@RequestParam(required = false) Integer gender, @RequestParam(required = false)  Double activity, @RequestParam(required = false)  Integer purpose) {

        if ((age == null) || (weight == null) || (height == null) || (gender == null) || (activity == null) || (purpose == null)) {

            return "redirect:/calculator";
        }

        UserDetails userDetails = new UserDetails();
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        User user = ((CurrentUser) auth.getPrincipal()).getUser();
        user = userRepository.getById(user.getId());
        user.setUserDetails(userDetails);
        userDetails.setAge(age);
        userDetails.setWeight(weight);
        userDetails.setHeight(height);
        userDetails.setGender(gender);
        userDetails.setActivity(activity);
        userDetails.setPurpose(purpose);
        userDetails.setCaloriesDemand(0);
        userDetailsRepository.save(userDetails);

        return "redirect:/caloricDemand";
    }

        @GetMapping("/caloricDemand")

        public String calculateCalories() {

            double caloricDemandFormula;
            int caloricDemand;

            Authentication auth = SecurityContextHolder.getContext().getAuthentication();
            User user = ((CurrentUser) auth.getPrincipal()).getUser();
            User user1 = userRepository.getById(user.getId());

            UserDetails userDetails = user1.getUserDetails();


            if (userDetails.getGender() == 655) {
                caloricDemandFormula = (userDetails.getGender() + (9.6 * userDetails.getWeight()) + (1.8 * userDetails.getHeight()) - (4.7 * userDetails.getAge())) * userDetails.getActivity() + userDetails.getPurpose();
                caloricDemand = Math.toIntExact(Math.round(caloricDemandFormula));
                userDetails.setCaloriesDemand(caloricDemand);
                userDetailsRepository.save(userDetails);

                return "redirect:/all";
            }
            caloricDemandFormula = (userDetails.getGender() + (13.7 * userDetails.getWeight()) + (5 * userDetails.getHeight()) - (4.7 * userDetails.getAge())) * userDetails.getActivity() + userDetails.getPurpose();
            caloricDemand = Math.toIntExact(Math.round(caloricDemandFormula));
            userDetails.setCaloriesDemand(caloricDemand);
            userDetailsRepository.save(userDetails);
            return "redirect:/all";
        }
    }