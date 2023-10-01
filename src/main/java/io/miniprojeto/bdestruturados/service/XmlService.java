package io.miniprojeto.bdestruturados.service;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
public class XmlService {

    private final Jaxb2Marshaller marshaller;



}
