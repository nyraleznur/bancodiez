package com.bancodiez.bancodiez;

import com.bancodiez.bancodiez.Repositorio.ClienteRepositorio;
import com.bancodiez.bancodiez.Repositorio.UusuarioRepositorio;
import com.bancodiez.bancodiez.entidad.Cliente;
import com.bancodiez.bancodiez.entidad.Uusraio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BancodiezApplication  implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(BancodiezApplication.class, args);
	}
    @Autowired
	private ClienteRepositorio  repositorio;
	private UusuarioRepositorio repositoriou;
	@Override
	public void run(String... args) throws Exception {

		//Uusraio usu= new Uusraio(8878L,"pepe","robles","mmm45");
		//repositoriou.save(usu);
		Cliente cliente1= new Cliente(58885L,"jose","lopez","eeeeeeee");
		repositorio.save(cliente1);

	}


}
