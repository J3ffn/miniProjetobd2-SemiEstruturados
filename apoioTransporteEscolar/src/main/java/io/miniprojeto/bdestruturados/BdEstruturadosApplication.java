package io.miniprojeto.bdestruturados;

import io.miniprojeto.bdestruturados.model.Municipio;
import io.miniprojeto.bdestruturados.service.XmlService;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;

@SpringBootApplication
public class BdEstruturadosApplication {

	private static final XmlService<Municipio> xmlService = new XmlService<>();

	public static void main(String[] args) {
//		xmlService.xmlToEntity("resources.bd.PNATEAlunosAtendidos.xml", Municipio.class);

		File file = new File("resources.bd.PNATEAlunosAtendidos.xml");
		System.out.println(file.getName());

	}

}
