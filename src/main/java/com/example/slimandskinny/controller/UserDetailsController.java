package com.example.slimandskinny.controller;

import com.example.slimandskinny.entity.UserDetails;
import com.example.slimandskinny.repository.UserDetailsRepository;
import com.example.slimandskinny.repository.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@Controller
public class UserDetailsController {

    private final UserDetailsRepository userDetailsRepository;

    public UserDetailsController(UserDetailsRepository userDetailsRepository) {
        this.userDetailsRepository = userDetailsRepository;
    }

    @GetMapping("/calculator")
    public String calculateData() {
        return "/user/caloriesCalculator";

    }

    @PostMapping("/calculator")
    @ResponseBody
    public String calculateCalories(@RequestParam int gender, @RequestParam int age, @RequestParam double weight, @RequestParam int height, @RequestParam double activity, @RequestParam int purpose){
        UserDetails userDetails = new UserDetails();
        userDetails.setAge(age);
        userDetails.setWeight(weight);
        userDetails.setHeight(height);
        userDetails.setGender(gender);
        userDetails.setActivity(activity);
        userDetails.setPurpose(purpose);
        userDetailsRepository.save(userDetails);
        return "/caloricDemand";
    }

    @GetMapping("/caloricDemand")
    @ResponseBody
    public String calculateCalories(){
        double caloricDemand;
        UserDetails userDetails = new UserDetails();

        if (userDetails.getGender()==655){
            caloricDemand = 655+(9.6 * userDetails.getWeight())+(1.8*userDetails.getHeight())-(4.7*userDetails.getAge())+userDetails.getPurpose();
        return  "Zapotrzebowanie kaloryczne wynosi " + caloricDemand;
    }
        caloricDemand =66+(13.7 * userDetails.getWeight())+(5*userDetails.getHeight())-(4.7*userDetails.getAge())+userDetails.getPurpose();
        return "Zapotrzebowanie kaloryczne wynosi " + caloricDemand;
    }

    /*@MOdelAtrtribute do kalkulatora
    @PostMapping("/calculator")
    @ResponseBody
    public String saveCalculateData(@ModelAttribute("userDetails") UserDetails userDetails1){
        userDetailsRepository.save(userDetails1);
        return "Dane zostały zapisane";
    }


    @ModelAttribute("activities")
    public List<String> activities(){
        return Arrays.asList("Brak aktywności zawodowej, chory, leżący",
                "Pracownik biurowy, którego aktywność związana jest wyłącznie z obowiązkami domowymi",
                "Pracownik biurowy, trenujący 2-3 razy w tygodniu przez minimum godzinę",
                "Pracownik biurowy, trenujący 3-4 razy w tygodniu przez minimum godzinę",
                "Zawodowy sportowiec, trenujący minimum 6 godzin tygodniowo lub osoba ciężko pracująca fizycznie"
                );
    }
    @ModelAttribute("purposes")
    public List<String> purposes(){
        return Arrays.asList("chcę schudnąć", "chcę utrzymać wagę", "chcę przytyć");
    }
*/




}
