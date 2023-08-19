package com.asistencia.asistencia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.asistencia.asistencia.repositorio.EmpleadoRepositorio;

@SpringBootApplication
public class AsistenciaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(AsistenciaApplication.class, args);
	}

	@Autowired
	private EmpleadoRepositorio repositorio;

	@Override
	public void run(String... args) throws Exception {
		// Empleado empleado1 = new Empleado("Alonso", "Novoa", "71274113", "aisaacnsoto@gmail.com");
		// repositorio.save(empleado1);

		// Empleado empleado2 = new Empleado("Anita", "Soto", "77777777", "anitasoto@gmail.com");
		// repositorio.save(empleado2);
	}

}
