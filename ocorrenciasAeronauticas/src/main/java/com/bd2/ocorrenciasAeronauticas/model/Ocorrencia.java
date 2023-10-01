package com.bd2.ocorrenciasAeronauticas.model;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString


@Entity
@Table
public class Ocorrencia implements Serializable {


    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Você pode adicionar um ID se desejar

    @Column(name = "Numero_da_Ocorrencia")
    private String numeroDaOcorrencia;


    @Column(name = "Numero_da_Ficha")
    private String numeroDaFicha;

    @Column(name = "Operador_Padronizado")
    private String operadorPadronizado;

    @Column(name = "Classificacao_da_Ocorrencia")
    private String classificacaoDaOcorrencia;

//    @Temporal(TemporalType.DATE)
    @Column(name = "Data_da_Ocorrencia")
    private String dataDaOcorrencia;

    @Column(name = "Hora_da_Ocorrencia")
    private String horaDaOcorrencia;

    @Column(name = "Municipio")
    private String municipio;

    @Column(name = "UF")
    private String uf;

    @Column(name = "Regiao")
    private String regiao;

    @Column(name = "Descricao_do_Tipo")
    private String descricaoDoTipo;

    @Column(name = "ICAO")
    private String icao;

    @Column(name = "Latitude")
    private String latitude;

    @Column(name = "Longitude")
    private String longitude;

    @Column(name = "Tipo_de_Aerodromo")
    private String tipoDeAerodromo;

    @Column(name = "Historico", length = 4000) // Defina o tamanho máximo adequado para o campo de histórico
    private String historico;

    @Column(name = "Matricula")
    private String matricula;

    @Column(name = "Categoria_da_Aeronave")
    private String categoriaDaAeronave;

    @Column(name = "Operador")
    private String operador;

    @Column(name = "Tipo_de_Ocorrencia")
    private String tipoDeOcorrencia;

    @Column(name = "Fase_da_Operacao")
    private String faseDaOperacao;

    @Column(name = "Operacao")
    private String operacao;

    @Column(name = "Danos_a_Aeronave")
    private String danosAAeronave;

    @Column(name = "Aerodromo_de_Destino")
    private String aerodromoDeDestino;

    @Column(name = "Aerodromo_de_Origem")
    private String aerodromoDeOrigem;

    @Column(name = "Lesoes_Fatais_Tripulantes")
    private String lesoesFataisTripulantes;

    @Column(name = "Lesoes_Fatais_Passageiros")
    private String lesoesFataisPassageiros;

    @Column(name = "Lesoes_Fatais_Terceiros")
    private String lesoesFataisTerceiros;

    @Column(name = "Lesoes_Graves_Tripulantes")
    private String lesoesGravesTripulantes;

    @Column(name = "Lesoes_Graves_Passageiros")
    private String lesoesGravesPassageiros;

    @Column(name = "Lesoes_Graves_Terceiros")
    private String lesoesGravesTerceiros;

    @Column(name = "Lesoes_Leves_Tripulantes")
    private String lesoesLevesTripulantes;

    @Column(name = "Lesoes_Leves_Passageiros")
    private String lesoesLevesPassageiros;

    @Column(name = "Lesoes_Leves_Terceiros")
    private String lesoesLevesTerceiros;

    @Column(name = "Ilesos_Tripulantes")
    private String ilesosTripulantes;

    @Column(name = "Ilesos_Passageiros")
    private String ilesosPassageiros;

    @Column(name = "Lesoes_Desconhecidas_Tripulantes")
    private String lesoesDesconhecidasTripulantes;

    @Column(name = "Lesoes_Desconhecidas_Passageiros")
    private String lesoesDesconhecidasPassageiros;

    @Column(name = "Lesoes_Desconhecidas_Terceiros")
    private String lesoesDesconhecidasTerceiros;

    @Column(name = "Modelo")
    private String modelo;

    @Column(name = "CLS")
    private String cls;

    @Column(name = "Tipo_ICAO")
    private String tipoIcao;

    @Column(name = "PMD")
    private String pmd;

    @Column(name = "Numero_de_Assentos")
    private String numeroDeAssentos;

    @Column(name = "Nome_do_Fabricante")
    private String nomeDoFabricante;

    @Column(name = "PSSO")
    private String psso;

    // Getters e setters aqui...

    // Construtores aqui...


}

