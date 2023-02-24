package com.eamapp.springweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexController {
    @GetMapping({"/","","/index"})
    public String index(Model model){
        model.addAttribute("titulo", "hola spring boot");
        return "index";
    }

    @GetMapping("/contactenos")
    public String contactenos(Model model){
        model.addAttribute("mensaje", "78979789");
        return "contactenos";
    }
}
