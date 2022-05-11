package com.bancodiez.bancodiez.Repositorio;

import com.bancodiez.bancodiez.entidad.Uusraio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface UusuarioRepositorio extends JpaRepository<Uusraio,Long> {
}
