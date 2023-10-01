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
public class Properties {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idProperties;

    private String uf;

    private String municipio;

    private String entidadeExecutora;

    private String cnpj;

    private int qtdAlunosAtendidos;

    private Date updated;

}
