package com.project.DuAnTotNghiep.controller.user;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("gethome")
    public String gethome(Model model) {
        return "user/home-03";
    }

}
