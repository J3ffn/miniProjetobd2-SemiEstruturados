package com.bd2.ocorrenciasAeronauticas;

import com.bd2.ocorrenciasAeronauticas.startup.Startup;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OcorrenciasAeronauticasApplication {

	public static void main(String[] args) {
		SpringApplication.run(OcorrenciasAeronauticasApplication.class, args);

		Startup.start();
	}

}
