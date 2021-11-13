package com.example.slimandskinny.controller;

import com.example.slimandskinny.entity.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller

public class UserDetailsController {

    @GetMapping("/calculator")
    public String calculate(Model model) {
        model.addAttribute("userDetails", new UserDetails());
        return "/user/caloriesCalculator";
    }

    @PostMapping("/calculator")
    @ResponseBody
    public String calculateCalories(@RequestParam String gender, @RequestParam int age, @RequestParam double weight, @RequestParam int height, @RequestParam int activity, @RequestParam int purpose){
        double caloricDemand;

        if (gender.equals("F")){
            caloricDemand = 655+(9.6 * weight)+(1.8*height)-(4.7*age)+purpose;
        return  "Zapotrzebowanie kaloryczne wynosi " + caloricDemand;
    }
        caloricDemand =66+(13.7*weight)+(5*height)-(4.7*age)+purpose;
        return "Zapotrzebowanie kaloryczne wynosi " + caloricDemand;
    }


}
