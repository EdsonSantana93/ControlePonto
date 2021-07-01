package br.com.dio.controledeponto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.dio.controledeponto.model.JornadaTrabalho;
import br.com.dio.controledeponto.repository.JornadaTrabalhoRepository;

@Service
public class JornadaTrabalhoService implements IJornadaTrabalhoService{
	
	@Autowired
	private JornadaTrabalhoRepository repository;
	
	@Override
	public JornadaTrabalho criarJornada(JornadaTrabalho jornada) {
		return repository.save(jornada);
	}

	@Override
	public List<JornadaTrabalho> buscarTodas() {
		return (List<JornadaTrabalho>) repository.findAll();
	}

	@Override
	public JornadaTrabalho buscarPorId(Long id) {
		return repository.findById(id).get();
	}

	@Override
	public JornadaTrabalho editarJornada(JornadaTrabalho jornada) {
		return repository.save(jornada);
	}

	@Override
	public void deletarJornada(Long id) {
		repository.deleteById(id);		
	}
}
