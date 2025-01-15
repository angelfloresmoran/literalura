package com.angelodev.literalura;

import com.angelodev.literalura.principal.Principal;
import com.angelodev.literalura.repository.IAutorRepository;
import com.angelodev.literalura.repository.ILibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LiteraluraApplication implements CommandLineRunner {

	@Autowired
	private IAutorRepository autorRepositorio;
	@Autowired
	private ILibroRepository libroRepositorio;

	public static void main(String[] args) {
		SpringApplication.run(LiteraluraApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal ejecucionPrograma = new Principal(autorRepositorio, libroRepositorio);
		ejecucionPrograma.muestraMenu();
	}
}
