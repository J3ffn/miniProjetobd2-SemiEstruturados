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
import java.lang.reflect.Field;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
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
        String chaveElemento = null;
        String valorElemento = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        int contador = 0;
        boolean consistente = true;

        while (reader.hasNext()) {
            int event = reader.next();

            switch (event) {
                case XMLStreamConstants.START_ELEMENT -> {
                    chaveElemento = reader.getLocalName();
                    if ("properties".equals(chaveElemento)) {
                        properties = new Properties();
                    }
                }
                case XMLStreamConstants.CHARACTERS -> valorElemento = reader.getText().trim();
                case XMLStreamConstants.END_ELEMENT -> {
                    if ("properties".equals(chaveElemento)) {
                        properties = null;
                    } else if (properties != null && chaveElemento != null && valorElemento != null) {
                        System.out.println(chaveElemento);
                        switch (chaveElemento) {
                            case "Uf" -> properties.setUf(valorElemento);
                            case "Municipio" -> properties.setMunicipio(valorElemento);
                            case "EntidadeExecutora" -> properties.setEntidadeExecutora(valorElemento);
                            case "Cnpj" -> properties.setCnpj(valorElemento);
                            case "QtdAlunosAtendidos" -> {
                                if (valorElemento != null && !valorElemento.equals("")) {
                                    properties.setQtdAlunosAtendidos(Integer.parseInt(valorElemento));
                                }
                            }
                            case "updated" -> {
                                sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
                                properties.setUpdated(sdf.parse(valorElemento));

                            }
                        }
                        if (valorElemento != null) {
                            if (chaveElemento.equals("updated") && consistente){
                                propertiesList.add(properties);
                            }
                        } else {
                            consistente = false;
                            contador++;
                        }

                    }
                    chaveElemento = null;
                    valorElemento = null;
                }
            }
        }
        System.out.println(contador);
        return propertiesList;
    }

}
