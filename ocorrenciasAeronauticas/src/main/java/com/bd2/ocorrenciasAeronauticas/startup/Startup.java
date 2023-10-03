package com.bd2.ocorrenciasAeronauticas.startup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Classe que fica o codigo de conversao
 */
@Component
public class Startup {

    /**
     * Start
     */
    @Autowired
    private Documento documento;

    public void start() {

        documento.selecionarQuantiaRegistros(3);

        //...
    }

}
