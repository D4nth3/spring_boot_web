package com.eamapp.springweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/cliente")
public class ControllerCliente {
    @GetMapping({"/","","/cliente"})
    public String indexCliente(Model model){
        model.addAttribute("titulo", "Pagina clientes");
        return "cliente/index";
    }

}
