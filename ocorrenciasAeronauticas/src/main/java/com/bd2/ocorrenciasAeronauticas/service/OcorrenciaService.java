package com.bd2.ocorrenciasAeronauticas.service;

import com.bd2.ocorrenciasAeronauticas.model.Ocorrencia;
import com.bd2.ocorrenciasAeronauticas.repository.OcorrenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OcorrenciaService {

    @Autowired
    private OcorrenciaRepository ocorrenciaRepository;

    /**
     * Salvar uma única ocorrência
     * @param novaOcorrencia
     */
    public void registrarOcorrencia(Ocorrencia novaOcorrencia){

        this.ocorrenciaRepository.save(novaOcorrencia);

    }

    /**
     * Método para salvar uma lista de ocorrencias
     * @param ocorrencias
     */
    public void registrarOcorrencias(List<Ocorrencia> ocorrencias){

    }

    /**
     * Retornar todas as ocorrencias com paginacao
     * @param numeroPagina
     * @param tamanhoPagina
     * @return
     */
    public List<Ocorrencia> verOcorrencias(int numeroPagina, int tamanhoPagina){

        Pageable paginacao = PageRequest.of(numeroPagina, tamanhoPagina);
        Page<Ocorrencia> pagina = this.ocorrenciaRepository.findAll(paginacao);
        return pagina.getContent();
    }

    public void deletarTodasOcorrencias(){
        this.ocorrenciaRepository.deleteAll();
    }




}
