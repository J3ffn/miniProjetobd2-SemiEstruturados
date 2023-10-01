package io.miniprojeto.bdestruturados;

import io.miniprojeto.bdestruturados.model.Municipio;
import io.miniprojeto.bdestruturados.service.XmlService;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.IOException;

@SpringBootApplication
public class BdEstruturadosApplication {

	private static final XmlService<Municipio> xmlService = new XmlService<>();

	public static void main(String[] args) throws IOException {
//		xmlService.xmlToEntity("resources.bd.PNATEAlunosAtendidos.xml", Municipio.class);

		File file = new File("src/main/resources/bd/PNATEAlunosAtendidos.xml");

		System.out.println(file.exists());

	}

}
