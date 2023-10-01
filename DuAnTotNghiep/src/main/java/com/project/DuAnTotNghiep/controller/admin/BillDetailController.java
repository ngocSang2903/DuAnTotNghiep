package com.project.DuAnTotNghiep.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BillDetailController {
    @GetMapping("/getBill")
    public String getIndex(Model model) {
        model.addAttribute("layoutAdmin", "admin/BillDetail");
        return "admin-layout";
    }
}
