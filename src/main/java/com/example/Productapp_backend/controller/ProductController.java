package com.example.Productapp_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ProductController {
    @PostMapping("/")
    public String Homepage(){
        return "Homepage";
    }

    @PostMapping("/add")
    public String add(){
        return "Add product Page";
    }

    @PostMapping("/search")
    public String search(){
        return "Search product page";
    }
    @PostMapping("/edit")
    public String edit(){
        return "Edit product page";
    }
    @GetMapping("/viewall")
    public String viewall(){
        return "View all product page";
    }
    @PostMapping("/delete")
    public String delete(){
        return "delete product page";
    }
}
