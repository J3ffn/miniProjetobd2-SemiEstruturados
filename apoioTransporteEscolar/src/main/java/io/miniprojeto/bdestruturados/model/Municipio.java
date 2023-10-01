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
    
    @Column(name = "titulo", nullable = false)
    private String title;
    
    @Column(name = "sumario", nullable = false, lenght = 30)
    private String summary;
    
    @Column(name = "data_atualizacao", nullable = false)
    private Date updated;
    
    @Column(name = "autor", nullable = false)
    private String author;
    
    @Column(name = "categoria", nullable = false)
    private String category;

    @Column(name = "uf", nullable = false, length = 2)
    private String uf;

    @Column(name = "municipio", nullable = false )
    private String municipio;

    @Column(name = "entidade_executora", nullable = false)
    private String entidadeExecutora;

    @Column(name = "cnpj", nullable = false)
    private String cnpj;

    @Column(name = "quantidade_alunos_atendidos", nullable = false)
    private int qtdAlunosAtendidos;

}
