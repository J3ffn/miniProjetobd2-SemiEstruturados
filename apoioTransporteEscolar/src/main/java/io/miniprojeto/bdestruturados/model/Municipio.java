package io.miniprojeto.bdestruturados.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
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
    
    @Column
    private String title;
    
    @Column
    private String summary;
    
    @Column
    private Date updated;
    
    @Column
    private String author;
    
    @Column
    private String category;

    @Column
    private String uf;

    @Column
    private String municipio;

    @Column
    private String entidadeExecutora;

    @Column
    private String cnpj;

    @Column
    private int qtdAlunosAtendidos;

}
