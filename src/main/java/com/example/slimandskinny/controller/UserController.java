package com.example.slimandskinny.controller;
import com.example.slimandskinny.entity.User;
import com.example.slimandskinny.entity.UserDetails;
import com.example.slimandskinny.repository.UserRepository;
import com.example.slimandskinny.service.CurrentUser;
import com.example.slimandskinny.service.UserService;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;



@Controller
@RequestMapping("/user/form")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping("/create-user")
    @ResponseBody
    public String createUser() {
        User user = new User();
        user.setEmail("admin@admin.pl");
        user.setPassword("admin");
        userService.saveUser(user);
        return "admin";
    }

    @GetMapping("/admin")
    @ResponseBody
    public String admin(@AuthenticationPrincipal CurrentUser customUser) {
        User entityUser = customUser.getUser();
        return "Witaj " + entityUser.getFirstName();
    }

    @GetMapping("/add")
    public String addUser(Model model) {
        model.addAttribute("user", new User());
        return "user/userForm";
    }

    @PostMapping("/add")
    public String saveUser(@ModelAttribute("user") User user) {
        userService.saveUser(user);
        return "/user/userAccountCreated";
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



