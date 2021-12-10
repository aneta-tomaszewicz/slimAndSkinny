package com.example.slimandskinny.controller;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Validator;

@AllArgsConstructor
@Controller
public class ValidationController {

    private final Validator validator;

/*
    @GetMapping("/validate")
    @ResponseBody
    public String validate() {

    }
}*/
}