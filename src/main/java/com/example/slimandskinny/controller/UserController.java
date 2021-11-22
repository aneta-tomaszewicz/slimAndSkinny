package com.example.slimandskinny.controller;
import com.example.slimandskinny.entity.User;
import com.example.slimandskinny.repository.UserRepository;
//import com.example.slimandskinny.service.CurrentUser;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


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

/*    @GetMapping("/admin")
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

    @GetMapping("/login")
    public String login(){
        return "/user/login";
    }

    @GetMapping("/logout")
    public String logoutPage (HttpServletRequest request, HttpServletResponse response) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth != null){
            new SecurityContextLogoutHandler().logout(request, response, auth);
        }
        return "user/logoutInformation";
    }











  /*  private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    *//*@GetMapping("/all")
    public String findAllUsers(Model model){
        model.addAttribute("users", userRepository.findAll());
        return "/user/listOfUsers";
    }*//*

    @GetMapping("/add")
    public String addUser(Model model) {
        model.addAttribute("user", new User());
        return "user/userForm";
    }

    @PostMapping("/add")
    public String saveUser(@ModelAttribute("user") User user) {
*//*        List<User> user1 = userRepository.findUserByEmail(user.getEmail());

        if (!user1.isEmpty()) {
            return "Podany adres email jest już w naszej bazie. Przejdz do logowania ";

        } else {*//*

        userRepository.save(user);
        return "/user/userAccountCreated";

    }
    @GetMapping("/login")
    public String login(Model model) {
        model.addAttribute("user", new User());
        return "/user/login";
    }

    @PostMapping("/login")

    public String logIn(@RequestParam String email, @RequestParam String password){
        User user = userRepository.findUserByEmailAndAndPassword(email, password);
        if ((user.getEmail().equals(email)) && (user.getPassword().equals(password))){

        return "/user/home";
        }
        return "/user/login";
    }

*/


    }



