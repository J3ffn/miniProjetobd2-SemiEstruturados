package io.miniprojeto.bdestruturados;

import io.miniprojeto.bdestruturados.model.Municipio;
import io.miniprojeto.bdestruturados.service.XmlService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@SpringBootApplication
public class BdEstruturadosApplication {

	public static void main(String[] args) {
		XmlService<Municipio> xmlService = new XmlService<>();

	}

}
