package io.miniprojeto.bdestruturados;

import io.miniprojeto.bdestruturados.model.Properties;
import io.miniprojeto.bdestruturados.repository.PropertiesRepository;
import io.miniprojeto.bdestruturados.service.PropertiesService;
import io.miniprojeto.bdestruturados.service.XmlService;
import lombok.extern.log4j.Log4j2;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import javax.xml.stream.XMLStreamException;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.List;

@SpringBootApplication
@Log4j2
public class BdEstruturadosApplication {

    public static void main(String[] args) throws IOException, XMLStreamException, ParseException {
        ApplicationContext context = SpringApplication.run(BdEstruturadosApplication.class, args);

        XmlService xmlService = context.getBean(XmlService.class);
        PropertiesService propertiesService = context.getBean(PropertiesService.class);

        String caminhoXml = "src/main/resources/bd/PNATEAlunosAtendidos.xml";
        List<Properties> propertiesList = XmlService.obterEntidade(caminhoXml);

        // Utiliza essa linha de baixo quando a persistência estiver correta!
        propertiesList.forEach(propertiesService::save);

        SpringApplication.exit(context);
    }


}
