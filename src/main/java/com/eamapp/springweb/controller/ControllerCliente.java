package com.eamapp.springweb.controller;

import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import com.eamapp.springweb.modelo.Cliente;
import com.eamapp.springweb.modelo.Vendedores;

@Controller
@RequestMapping("/cliente")
public class ControllerCliente {
    @GetMapping({ "/", "" })
    public String indexCliente(Model model) {
        Cliente cliente = new Cliente();
        model.addAttribute("titulo", "Perfil");
        model.addAttribute("cliente", cliente);
        cliente.setNombre("Juan Camilo");
        cliente.setApellido("Velez");
        cliente.setCorreo("juan.velez.7540@eam.edu.co");
        model.addAttribute("cuerpo", "perfil del cliente: ".concat(cliente.getNombre()));
        return "cliente/index";
    }

    @ModelAttribute("vendedores")
    public List<Vendedores> poblarVendedores(){
        List<Vendedores> vendedores = Arrays.asList(new Vendedores("Pepito","Perez","pepito@prueba.com"), new Vendedores("cosme","fulanito","cosme@prueba.com"));
        return vendedores;

    }

}
