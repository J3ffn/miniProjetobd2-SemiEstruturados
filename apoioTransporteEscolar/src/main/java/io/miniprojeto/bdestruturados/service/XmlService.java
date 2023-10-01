package io.miniprojeto.bdestruturados.service;

import io.miniprojeto.bdestruturados.model.Properties;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;

@Log4j2
@Service
public class XmlService {

    public static List<Properties> obterEntidade(String xml) throws FileNotFoundException, XMLStreamException, ParseException {
        XMLInputFactory factory = XMLInputFactory.newInstance();
        XMLStreamReader reader = factory.createXMLStreamReader(new FileReader(xml));

        List<Properties> propertiesList = new ArrayList<>();
        Properties properties = null;
        String currentElement = null;
        String elementValue = null;

        while (reader.hasNext()) {
            int event = reader.next();

            switch (event) {
                case XMLStreamConstants.START_ELEMENT -> {
                    currentElement = reader.getLocalName();
                    if ("properties".equals(currentElement)) {
                        properties = new Properties();
                    }
                }
                case XMLStreamConstants.CHARACTERS -> elementValue = reader.getText().trim();
                case XMLStreamConstants.END_ELEMENT -> {
                    if ("properties".equals(currentElement)) {
                        properties = null;
                    } else if (properties != null && currentElement != null) {
                        System.out.println(currentElement);
                        switch (currentElement) {
                            case "Uf" -> properties.setUf(elementValue);
                            case "Municipio" -> properties.setMunicipio(elementValue);
                            case "EntidadeExecutora" -> properties.setEntidadeExecutora(elementValue);
                            case "Cnpj" -> properties.setCnpj(elementValue);
                            case "QtdAlunosAtendidos" -> {
                                if (elementValue != null && !elementValue.equals("")) {
                                    properties.setQtdAlunosAtendidos(Integer.parseInt(elementValue));
                                }
                            }
                            case "updated" -> {
                                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
                                sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
                                properties.setUpdated(sdf.parse(elementValue));
                                propertiesList.add(properties);
                            }

                        }
                    }
                    currentElement = null;
                    elementValue = null;
                }
            }
        }
        return propertiesList;
    }

}
