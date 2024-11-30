package com.example.demo.controller;

import com.example.demo.model.Trabajador;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TrabajadorController {

    @GetMapping("/viewTrabajador")
    public String mostrarFormulario(Model modelo) {
        modelo.addAttribute("trabajador", new Trabajador());
        return "viewTrabajador";
    }

    @PostMapping("/successTrabajador")
    public String mostrarResultado(@ModelAttribute Trabajador trabajador, Model modelo) {
        trabajador.calcularSueldoTotal();
        modelo.addAttribute("trabajador", trabajador);
        return "successTrabajador";
    }
}
