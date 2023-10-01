package io.miniprojeto.bdestruturados.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class Municipio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMunicipio;

    private String title;

    private String summary;

    private Date updated;

    private String author;

    private String category;

    private String uf;

    private String municipio;

    private String entidadeExecutora;

    private String cnpj;

    private int qtdAlunosAtendidos;

}
