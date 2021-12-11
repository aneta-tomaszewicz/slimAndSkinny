package com.example.slimandskinny.controller;
import com.example.slimandskinny.entity.UserDetails;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import java.awt.print.Book;
import java.util.Set;

@AllArgsConstructor
@Controller
public class ValidationController {

    private final Validator validator;


    @GetMapping("/validate")
    @ResponseBody
    public String validate() {
        UserDetails userDetails = new UserDetails();

        Set<ConstraintViolation<UserDetails>> validationResult = validator.validate(userDetails);
        if (!validationResult.isEmpty()) {
            for(ConstraintViolation<UserDetails> singleError : validationResult) {
                System.out.println("BLAD!!!! " + singleError.getPropertyPath() + " : " + singleError.getMessage());
            }
            return "Encja jest nie poprawna";
        } else {
            return "Encja jest poprawna";
        }
    }
}