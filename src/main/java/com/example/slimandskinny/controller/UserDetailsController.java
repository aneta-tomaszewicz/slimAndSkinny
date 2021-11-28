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
 /*   @ResponseStatus(HttpStatus.MOVED_PERMANENTLY)*/
    public String calculateCalories(@RequestParam int gender, @RequestParam int age, @RequestParam double weight, @RequestParam int height, @RequestParam double activity, @RequestParam int purpose){
        UserDetails userDetails = new UserDetails();
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        User user =((CurrentUser)auth.getPrincipal()).getUser();
        user = userRepository.getById(user.getId());
        userDetails.setUser(user);
        userDetails.setAge(age);
        userDetails.setWeight(weight);
        userDetails.setHeight(height);
        userDetails.setGender(gender);
        userDetails.setActivity(activity);
        userDetails.setPurpose(purpose);
        userDetailsRepository.save(userDetails);
        return "redirect:/caloricDemand";

        /*   User user = new User();
        UserDetails userDetails = new UserDetails();
        user.setUserDetails(userDetails.setAge(age));
        user.setUserDetails(userDetails.setWeight(weight));
        user.setUserDetails(userDetails.setHeight(height));
        user.setUserDetails(userDetails.setGender(gender));
        user.setUserDetails(userDetails.setActivity(activity));
        user.setUserDetails(userDetails.setPurpose(purpose));
*/
        /*User user = new User();*/
       /* Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName();*/
       /* userDetails.setId(user.getId());*/
      /*  User entityUser = customUser.getUser();*/
      /*  userDetails.setAge(age);
        userDetails.setWeight(weight);
        userDetails.setHeight(height);
        userDetails.setGender(gender);
        userDetails.setActivity(activity);
        userDetails.setPurpose(purpose);
        userDetailsRepository.save(userDetails);*/
       /* return "/caloricDemand";*/
    }



    @GetMapping("/caloricDemand")
    @ResponseBody
    public String calculateCalories() {
       // User user = new User();
        double caloricDemand;
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        User user =((CurrentUser)auth.getPrincipal()).getUser();
        User user1 = userRepository.getById(user.getId());

     /*   return "zapotrzebiwanie" +userDetails.getUser();*/
        UserDetails userDetails = user1.getUserDetails();

        if (userDetails.getGender()==655){
            caloricDemand = 655+(9.6 * userDetails.getWeight())+(1.8*userDetails.getHeight())-(4.7*userDetails.getAge())+userDetails.getPurpose();
        return  "Dzienne zapotrzebowanie kaloryczne wynosi " + caloricDemand;
    }
        caloricDemand =66+(13.7 * userDetails.getWeight())+(5*userDetails.getHeight())-(4.7*userDetails.getAge())+userDetails.getPurpose();
        return "Dzienne zapotrzebowanie kaloryczne wynosi " + caloricDemand;
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
