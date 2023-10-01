package com.bd2.ocorrenciasAeronauticas.startup;

import com.bd2.ocorrenciasAeronauticas.model.Ocorrencia;
import com.bd2.ocorrenciasAeronauticas.model.OcorrenciaTeste;
import com.google.gson.*;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Startup {


    private final static String ocorrenciasPath = "ocorrenciasAeronauticas/src/main/resourcesocorrencias.json";

    /**
     * Start
     */
    public static void start() {

        try (FileWriter writer = new FileWriter("dados.json")) {

            getAlgumasOcorrencias();

        } catch (IOException exception) {
            System.out.println("Deum ruim");

        }

    }
    /**
     * Apenas pega as 50 ocorencias do arquivo oroginal(possui mais de 500 mil registros)
     * @return
     */
    private static List<Ocorrencia> getAlgumasOcorrencias(){

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        List<OcorrenciaTeste> ocorrencias = new ArrayList<>();

        try(
                FileReader reader = new FileReader("message.json");
                FileWriter writer = new FileWriter("dados.json");
        )
        {

            JsonArray jsonArray = (JsonArray) JsonParser.parseReader(reader);
            int c = 0;
            for(JsonElement jsonElement : jsonArray) {

                OcorrenciaTeste ocorrencia = gson.fromJson(jsonElement, OcorrenciaTeste.class);

                ocorrencias.add(ocorrencia);


                c++;
                if(c == 50)
                    break;


            }

            ocorrencias.forEach(System.out::println);

        }
        catch (IOException exception){

            System.out.println(exception.getMessage());

        }

        return null;

    }



}
