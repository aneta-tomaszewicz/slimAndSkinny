package com.example.slimandskinny.controller;
import com.example.slimandskinny.entity.User;
import com.example.slimandskinny.repository.UserRepository;
//import com.example.slimandskinny.service.CurrentUser;
import com.example.slimandskinny.service.CurrentUser;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
/*@RequestMapping("/user/form")*/
public class UserController {
    private final UserRepository userRepository;
    private final BCryptPasswordEncoder passwordEncoder;

    public UserController(UserRepository userRepository, BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = bCryptPasswordEncoder;
    }



/*    @GetMapping("/create-user")
    @ResponseBody
    public String createUser() {
        User user = new User();
        user.setEmail("admin@admin.pl");
        user.setPassword("admin");
        userService.saveUser(user);
        return "admin";
    }*/

    /*@GetMapping("/hello")
    @ResponseBody
    public String admin(@AuthenticationPrincipal CurrentUser customUser) {
        User entityUser = customUser.getUser();
        return "Witaj " + entityUser.getFirstName();
    }*/

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

 /* @GetMapping("/currentUser")
    @ResponseBody
    public String userInfo(@AuthenticationPrincipal UserDetails customUser) {
        logger.info("customUser class {} ", customUser.getClass());
        return "You are logged as " + customUser;
    }*/
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
        return "/user/home";
    }
}











  /*  private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    *//*@GetMapping("/all")
    public String findAllUsers(Model model){
        model.addAttribute("users", userRepository.findAll());
        return "/user/listOfUsers";
    }*/






