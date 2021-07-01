package br.com.dio.controledeponto.service;

import java.util.List;

import br.com.dio.controledeponto.model.JornadaTrabalho;

public interface IJornadaTrabalhoService {
	public JornadaTrabalho criarJornada(JornadaTrabalho jornada);
	
	public List<JornadaTrabalho> buscarTodas();
	
	public JornadaTrabalho buscarPorId(Long id);
	
	public JornadaTrabalho editarJornada(JornadaTrabalho jornada);
	
	public void deletarJornada(Long id);
}
