package com.example.demo.controller;


import com.example.demo.model.Veterinaria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Index {

    @Autowired


    @GetMapping({"/", "/index"})

    public String index(){
       return "index";
    }

    @GetMapping({ "/administrador"})
    public String admin() {
        return "administrador";
    }



}




