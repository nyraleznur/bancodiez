package com.bancodiez.bancodiez.Controllador;

import com.bancodiez.bancodiez.Repositorio.UusuarioRepositorio;
import com.bancodiez.bancodiez.entidad.Cliente;
import com.bancodiez.bancodiez.entidad.Uusraio;
import com.bancodiez.bancodiez.servicio.UsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UsuarioClinetes {

    @Autowired
    private UsuarioServicio servicio;

    @GetMapping("/usuario")
    public String listarusuario(Model modelo) {
        modelo.addAttribute("usuario", servicio.listarusuarios());
        return "usuario";
    }

    @GetMapping("/usuario/nuevo")
    public String mostrarformularioparainsertarusuario(Model modelo) {
        modelo.addAttribute("usuarioinsertar", new Uusraio());
        return "usuariofrm";
    }

    @Autowired
    private UusuarioRepositorio repositorio;

    @PostMapping("usuario/guardar")

    public String guardausuario(Uusraio usuario) {
        Uusraio usuarioguardar = repositorio.save(new Uusraio(300L, usuario.getUsuario(), "123", "cliente"));
        return "redirect:/usuario";
    }

    @GetMapping("/cliente/nuevo")
    public String mostrarformularioparainsertarclinete(Model modelo) {
        modelo.addAttribute("clienteinsertar", new Cliente());
        return "clientesfrm";

    }
    @PostMapping('cliente/guardar')
    public String guardarcliente(Cliente cliente){
        Cliente guardarcliente=repositorio.save(new Cliente(cliente.getId(),cliente.getNombre(),cliente.getApellido(),cliente.getEmail()));

    }


}