package com.project.DuAnTotNghiep.controller.user;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShopProductController {


    @GetMapping("getproduct")
    public String getProduct(Model model) {
        model.addAttribute("layoutUser", "user/shop-product");
        return "user/layout-user";    }
}
