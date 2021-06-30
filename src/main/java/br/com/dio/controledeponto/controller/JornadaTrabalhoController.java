package br.com.dio.controledeponto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.dio.controledeponto.model.JornadaTrabalho;
import br.com.dio.controledeponto.service.IJornadaTrabalhoService;

@RestController
@RequestMapping("/jornada")
public class JornadaTrabalhoController {
	
	@Autowired
	private IJornadaTrabalhoService service;
	
	
	@PostMapping("/criar")
	public ResponseEntity<JornadaTrabalho> criarJornada(@RequestBody JornadaTrabalho jornada){
		JornadaTrabalho resposta = service.criarJornada(jornada);
		
		if (jornada != null) {
			return ResponseEntity.status(201).body(resposta);
		}
		
		return ResponseEntity.badRequest().build();
	}
}
