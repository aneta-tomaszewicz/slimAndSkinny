package com.example.slimandskinny.controller;
import com.example.slimandskinny.entity.User;
import com.example.slimandskinny.repository.MealRepository;
import com.example.slimandskinny.repository.UserRepository;
import com.example.slimandskinny.service.CurrentUser;
import lombok.AllArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@Controller
public class UserController {
    private final UserRepository userRepository;
    private final BCryptPasswordEncoder passwordEncoder;
    private final MealRepository mealRepository;



    @GetMapping("/register")
    public String addUser(Model model) {
        model.addAttribute("user", new User());
        return "user/register";
    }

    @PostMapping("/register")
    public String saveUser(@ModelAttribute User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);
        return "/user/userAccountCreated";
    }

    @GetMapping("/hello")
    @ResponseBody
    public String hello(@AuthenticationPrincipal CurrentUser customUser) {
        User entityUser = customUser.getUser();
        return "Witaj " + entityUser.getFirstName();
    }
    @GetMapping("/home")
    public String goHome(Model model) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        User user = ((CurrentUser) auth.getPrincipal()).getUser();
        user = userRepository.getById(user.getId());
        model.addAttribute("user", user);
        model.addAttribute("meal", mealRepository.findAllByUser(user));
        return "/user/home";
    }
}








