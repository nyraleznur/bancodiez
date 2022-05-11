package com.bancodiez.bancodiez.servicio;

import com.bancodiez.bancodiez.Repositorio.ClienteRepositorio;
import com.bancodiez.bancodiez.entidad.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServicioIMP implements  ClienteServicio{
    @Autowired
    private ClienteRepositorio repositorio;

    @Override
    public List<Cliente> listartodoslosclientes() {
        return repositorio.findAll();
    }
}
