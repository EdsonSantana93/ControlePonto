package br.com.dio.controledeponto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.dio.controledeponto.model.JornadaTrabalho;
import br.com.dio.controledeponto.repository.JornadaTrabalhoRepository;

@Service
public class JornadaTrabalhoService implements IJornadaTrabalhoService{
	
	@Autowired
	private JornadaTrabalhoRepository repository;
	
	public JornadaTrabalho criarJornada(JornadaTrabalho jornada) {
		return repository.save(jornada);
	}
}
