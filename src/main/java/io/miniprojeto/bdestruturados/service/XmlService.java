package io.miniprojeto.bdestruturados.service;

import lombok.extern.log4j.Log4j2;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import javax.xml.transform.stream.StreamSource;
import java.io.StringReader;

@Log4j2
public class XmlService<K> {

    private final Jaxb2Marshaller marshaller;

    public XmlService() {
        marshaller = new Jaxb2Marshaller();
        // Local onde estão as entidades que serão desmarcadas do XMl
        marshaller.setPackagesToScan("io.miniprojeto.bdestruturados.model");
    }

    public K xmlToEntity(String xml, Class<K> returnTipo) {
        StreamSource source = new StreamSource(new StringReader(xml));
        Object objectoDesmarcado = marshaller.unmarshal(source);
        if (returnTipo.isInstance(objectoDesmarcado)) {
            K cast = returnTipo.cast(objectoDesmarcado);
            log.info(returnTipo.getName() + " convertido :: {}", cast);
            return cast;
        } else {
            throw new RuntimeException("O objeto desmarcado não é do tipo esperado.");
        }
    }

}
