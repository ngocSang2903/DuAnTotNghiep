package com.project.DuAnTotNghiep.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("getindex")
    public String getIndex(Model model) {
        model.addAttribute("layoutAdmin", "admin/index");
        return "admin/layoutAdmin";
    }
}
