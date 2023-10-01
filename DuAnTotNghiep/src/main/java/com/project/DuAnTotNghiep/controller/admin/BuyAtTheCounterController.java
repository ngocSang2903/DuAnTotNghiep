package com.project.DuAnTotNghiep.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BuyAtTheCounterController {

    @GetMapping("getBuyHome")
    public String getIndex(Model model) {
        return "admin/BuyAtTheCounter";
    }
}
