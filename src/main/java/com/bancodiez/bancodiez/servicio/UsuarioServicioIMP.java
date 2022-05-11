package com.bancodiez.bancodiez.servicio;

import com.bancodiez.bancodiez.Repositorio.UusuarioRepositorio;
import com.bancodiez.bancodiez.entidad.Uusraio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServicioIMP implements UsuarioServicio {

    @Autowired

    private UusuarioRepositorio repositorio;

    @Override
    public List<Uusraio> listarusuarios() {
        return repositorio.findAll();
    }
}
