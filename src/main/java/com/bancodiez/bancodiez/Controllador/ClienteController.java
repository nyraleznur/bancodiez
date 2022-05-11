/*package com.bancodiez.bancodiez.Controllador;

import com.bancodiez.bancodiez.Repositorio.ClienteRepositorio;
import com.bancodiez.bancodiez.servicio.ClienteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClienteController {
   @Autowired
   private ClienteServicio servicio;
   @GetMapping({"/clientes","/"})
  // @GetMapping({"/"})
    public String listarclientes(Model modelo){
       modelo.addAttribute("clientes",servicio.listartodoslosclientes());
       return "clientes";//nos retorba al archivo clienetes
   }



}*/
