package br.com.dio.controledeponto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.dio.controledeponto.model.JornadaTrabalho;
import br.com.dio.controledeponto.service.IJornadaTrabalhoService;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/jornada")
@CrossOrigin(origins = "*")
public class JornadaTrabalhoController {
	
	@Autowired
	private IJornadaTrabalhoService service;
	
	
	@PostMapping(produces = "application/json")
	@ApiOperation("Salva uma nova Jornada de trabalho")
	public ResponseEntity<JornadaTrabalho> criarJornada(@RequestBody JornadaTrabalho jornada){
		JornadaTrabalho resposta = service.criarJornada(jornada);
		
		if (jornada != null) {
			return ResponseEntity.status(201).body(resposta);
		}
		
		return ResponseEntity.badRequest().build();
	}
	
	@GetMapping
	@ApiOperation("Retorna uma lista de Jornadas")
	public ResponseEntity<List<JornadaTrabalho>> buscarTodas(){
		List<JornadaTrabalho> jornadas = service.buscarTodas();
		
		if (jornadas != null) {
			return ResponseEntity.ok(jornadas);
		}
		
		return ResponseEntity.notFound().build();
	}
	
	@GetMapping("/{id}")
	@ApiOperation("Retorna uma jornada pro Id")
	public ResponseEntity<JornadaTrabalho> buscarPorId(@PathVariable Long id){
		JornadaTrabalho resposta = service.buscarPorId(id);
		
		if (resposta != null) {
			return ResponseEntity.ok(resposta);
		}
		return ResponseEntity.notFound().build();
	}
	
	@PutMapping
	@ApiOperation("Atualiza uma jornada de trabalho")
	public ResponseEntity<JornadaTrabalho> editarJornada(@RequestBody JornadaTrabalho jornada){
		JornadaTrabalho resposta = service.editarJornada(jornada);
		
		if (resposta != null) {
			return ResponseEntity.ok(resposta);
		}
		
		return ResponseEntity.badRequest().build();
	}
	
	@DeleteMapping("/{id}")
	@ApiOperation("Deleta uma Jornada de trabalho")
	public ResponseEntity<Void> deletarJornada(@PathVariable Long id){
		service.deletarJornada(id);
		return ResponseEntity.noContent().build();
	}
}
