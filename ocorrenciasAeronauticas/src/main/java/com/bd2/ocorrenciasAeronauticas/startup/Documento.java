package com.bd2.ocorrenciasAeronauticas.startup;

import com.bd2.ocorrenciasAeronauticas.model.Ocorrencia;
import com.bd2.ocorrenciasAeronauticas.service.OcorrenciaService;
import com.google.gson.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Essa classe intenciona selecionar alguns registros do documento message.json
 */
@Component
public class Documento {

    private OcorrenciaService service;

    private static final String registrosSelecionadosPath = "dados.json";
    private static final String baseDadosJsonPath = "message.json";
    private final Gson gson;

    public Documento() {
        gson = new GsonBuilder().setPrettyPrinting().create();
        service = new OcorrenciaService();
    }

    /**
     * Selecionar o número de registros, partindo do primeiro, para popular o banco de dados.
     * @param numeroRegistros
     */
    public void selecionarQuantiaRegistros(int numeroRegistros){

        try(
                FileWriter writer = new FileWriter("dados.json");
                FileReader reader = new FileReader("message.json");
        ){
            List<Ocorrencia> ocorrencias = new ArrayList<>();

            JsonArray jsonOcorrenciasArray = (JsonArray) JsonParser.parseReader(reader);
            for (JsonElement jsonElement : jsonOcorrenciasArray){

                Ocorrencia novaOcorrencia = gson.fromJson(jsonElement, Ocorrencia.class);
                ocorrencias.add(novaOcorrencia);


                numeroRegistros --;
                if(numeroRegistros == 0)
                    break;

            }

            // inserir ocorrencias em outro arquivo .json
            String stringJsonOcorrencias = gson.toJson(ocorrencias);

            writer.write(stringJsonOcorrencias);
            writer.flush();
            writer.close();

            System.out.println(ocorrencias.size()); // tamanho

            popularBanco(ocorrencias);
        }
        catch (IOException exception){
            System.out.println(exception.getMessage());

        }


    }

    private void popularBanco(List<Ocorrencia> ocorrencias){

        this.service.registrarNovasOcorrencias(ocorrencias);

    }


}
