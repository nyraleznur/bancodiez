package com.bancodiez.bancodiez.Controllador;

import com.bancodiez.bancodiez.Repositorio.ClienteRepositorio;
import com.bancodiez.bancodiez.entidad.Cliente;
import com.bancodiez.bancodiez.servicio.ClienteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ClienteController {
    @Autowired
    private ClienteServicio clienteServicio;
    @GetMapping("/clientes")
    public String listarusuario(Model modelo) {
        modelo.addAttribute("clientes", clienteServicio.listartodoslosclientes());
        return "clientes";
    }

    @Autowired
    private ClienteRepositorio clienetereposotirio;
    @GetMapping("/cliente/nuevo")
    public String mostrarfrmclientes(Model modelo){
        modelo.addAttribute("clienteins",new Cliente());
        return "clientesfrm";


    }

    @PostMapping("cliente/guardar")
    public String guardarcliente (Cliente clie){
        clienetereposotirio.save(new Cliente(clie.getId(),clie.getNombre(),clie.getApellido(),clie.getEmail()));
        return "redirect:/";
    }

}
