package com.bancodiez.bancodiez;

import com.bancodiez.bancodiez.Repositorio.UusuarioRepositorio;
import com.bancodiez.bancodiez.entidad.Uusraio;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class UsuarioRepositorioTest {


    @Autowired
    private UusuarioRepositorio repositorio;
    @Test
    public void testcrearcliente(){
        Uusraio usuarioguardar=repositorio.save(new Uusraio(100L,"pepe","123","cliente"));
        Assertions.assertThat(usuarioguardar.getId()).isGreaterThan(0);
    }
}
