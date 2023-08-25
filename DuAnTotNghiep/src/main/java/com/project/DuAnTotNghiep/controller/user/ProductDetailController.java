package com.project.DuAnTotNghiep.controller.user;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductDetailController {

    @GetMapping("getproductdetail")
    public String getProductDetail(Model model) {
        model.addAttribute("layoutUser", "user/product-detail");
        return "user/layout";
    }
}
