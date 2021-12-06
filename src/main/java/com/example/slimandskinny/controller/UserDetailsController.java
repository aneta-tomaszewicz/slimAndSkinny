package com.example.slimandskinny.controller;

import com.example.slimandskinny.entity.User;
import com.example.slimandskinny.entity.UserDetails;
import com.example.slimandskinny.repository.UserDetailsRepository;
import com.example.slimandskinny.repository.UserRepository;
import com.example.slimandskinny.service.CurrentUser;
import org.hibernate.Hibernate;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
public class UserDetailsController {

    private final UserDetailsRepository userDetailsRepository;
    private final UserRepository userRepository;


    public UserDetailsController(UserDetailsRepository userDetailsRepository, UserRepository userRepository) {
        this.userDetailsRepository = userDetailsRepository;
        this.userRepository = userRepository;
    }

    @GetMapping("/calculator")
    public String calculateData() {
        return "/user/caloriesCalculator";

    }

    @PostMapping("/calculator")

    public String calculateCalories(@RequestParam int gender, @RequestParam int age, @RequestParam double weight, @RequestParam int height, @RequestParam double activity, @RequestParam int purpose){
        UserDetails userDetails = new UserDetails();
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        User user =((CurrentUser)auth.getPrincipal()).getUser();
        user = userRepository.getById(user.getId());
      // userDetails.setUser(user);
        user.setUserDetails(userDetails);
        userDetails.setAge(age);
        userDetails.setWeight(weight);
        userDetails.setHeight(height);
        userDetails.setGender(gender);
        userDetails.setActivity(activity);
        userDetails.setPurpose(purpose);

        userDetailsRepository.save(userDetails);

        return "redirect:/caloricDemand";

    }

    @GetMapping("/caloricDemand")

    public String calculateCalories() {

        double caloricDemandFormula;
        int caloricDemand;

        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        User user =((CurrentUser)auth.getPrincipal()).getUser();
        User user1 = userRepository.getById(user.getId());
        //serDetails userDetails =

        //user1.setUserDetails(userDetails);

      UserDetails userDetails = user1.getUserDetails();
     //UserDetails userDetails = userDetailsRepository.findUserDetailsByUserId(user1.getId());



        if (userDetails.getGender()==655){
            caloricDemandFormula = (userDetails.getGender()+(9.6 * userDetails.getWeight())+(1.8*userDetails.getHeight())-(4.7*userDetails.getAge()))*userDetails.getActivity()+userDetails.getPurpose();
            caloricDemand = Math.toIntExact(Math.round(caloricDemandFormula));
            userDetails.setCaloriesDemand(caloricDemand);
            userDetailsRepository.save(userDetails);

            return  "redirect:/all";
    }
        caloricDemandFormula = (userDetails.getGender()+(13.7 * userDetails.getWeight())+(5*userDetails.getHeight())-(4.7*userDetails.getAge()))*userDetails.getActivity()+userDetails.getPurpose();
        caloricDemand = Math.toIntExact(Math.round(caloricDemandFormula));
        userDetails.setCaloriesDemand(caloricDemand);
        userDetailsRepository.save(userDetails);
        return "redirect:/all";
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
