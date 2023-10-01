package com.bd2.ocorrenciasAeronauticas.startup;

import com.bd2.ocorrenciasAeronauticas.model.Ocorrencia;
import com.google.gson.*;
import org.springframework.stereotype.Component;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe que fica o codigo de conversao
 */
@Component
public class Startup {

    /**
     * Start
     */
    public static void start() {

        Documento doc = new Documento();
        doc.selecionarQuantiaRegistros(1);

        //...
    }

}
