package com.sucerity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
    @GetMapping("/")
    public String getAllForAllEmployee() {
        return "view_for_all_employees";
    }
}
