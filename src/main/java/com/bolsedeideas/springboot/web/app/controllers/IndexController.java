package com.bolsedeideas.springboot.web.app.controllers;

import com.bolsedeideas.springboot.web.app.models.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/app")
public class IndexController {
    @GetMapping({"/index", "/", "/home"})
    public String index(Model model){
        model.addAttribute("titulo", "hola Spring Framework con Model");
        return "index";
    }

    @RequestMapping("/perfil")
    public String perfil(Model model) {

        Usuario usuario = new Usuario();
        usuario.setNombre("Felipe");
        usuario.setApellido("Herrera");
        usuario.setEmail("felipe@gmail.com");

        model.addAttribute("usuario", usuario);
        model.addAttribute("titulo", "Perfil usuario ".concat(usuario.getNombre()));
        return "perfil";
    }

    @RequestMapping("/listar")
    public String listar (Model model){
        List<Usuario> usuarios = new ArrayList<>();
        model.addAttribute("titulo", "Listado de usuarios ");
        model.addAttribute("usuarios", usuarios);
        return "listar";
    }


}
