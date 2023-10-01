package io.miniprojeto.bdestruturados.service;

import java.util.List;
import java.util.Optional;

import io.miniprojeto.bdestruturados.model.Municipio;
import io.miniprojeto.bdestruturados.repository.MunicipioRepository;

public class MunicipioService {
	private MunicipioRepository municipioRepository;
	
	public MunicipioService(MunicipioRepository municipioRepository) {
		this.municipioRepository = municipioRepository;
	}
	
	public void adicionarMunicipio(Municipio municipio) {
		this.municipioRepository.save(municipio);
	}
	
	public void remover(Integer id) {
		this.municipioRepository.deleteById(id);
	}
	
	public Optional<Municipio> buscarMunicipioPeloId(Integer id) {
		return this.municipioRepository.findById(id);
	}
	
	public List<Municipio> listar(){
		return this.municipioRepository.findAll();
	}
}
