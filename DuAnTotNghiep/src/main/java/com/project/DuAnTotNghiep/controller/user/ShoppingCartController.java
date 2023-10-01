package com.project.DuAnTotNghiep.controller.user;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShoppingCartController {

    @GetMapping("getshop")
    public String getShop(Model model) {
        model.addAttribute("layoutUser", "user/shoping-cart");
        return "user/layout-user";    }
}
