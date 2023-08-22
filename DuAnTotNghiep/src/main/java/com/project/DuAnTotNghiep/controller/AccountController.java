package com.project.DuAnTotNghiep.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

public class AccountController {

    @RequestMapping("home")
    public String getAll(Model model) {
        model.addAttribute("data", "Hello Would !");
        model.addAttribute("main", "index");
        return "main";
    }
}
