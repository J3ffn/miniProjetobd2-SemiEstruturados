package io.miniprojeto.bdestruturados.service;

import io.miniprojeto.bdestruturados.repository.PropertiesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor // Injeção de dependência
@Service
public class PropertiesService {

    private final PropertiesRepository propertiesRepository;


}
