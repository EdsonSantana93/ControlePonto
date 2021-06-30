package br.com.dio.controledeponto.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Usuario {
	
	@Id
	private Long id;
	private String nome;
	private BigDecimal tolerancia;
	private LocalDate inicioJornada;
	private LocalDate finalJornada;

	@ManyToOne
	private CategoriaUsuario categoriaUsuario;

	@ManyToOne
	private Empresa empresa;

	@ManyToOne
	private NivelAcesso nivelAcesso;

	@ManyToOne
	private JornadaTrabalho jornadaTrabalho;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getTolerancia() {
		return tolerancia;
	}

	public void setTolerancia(BigDecimal tolerancia) {
		this.tolerancia = tolerancia;
	}

	public LocalDate getInicioJornada() {
		return inicioJornada;
	}

	public void setInicioJornada(LocalDate inicioJornada) {
		this.inicioJornada = inicioJornada;
	}

	public LocalDate getFinalJornada() {
		return finalJornada;
	}

	public void setFinalJornada(LocalDate finalJornada) {
		this.finalJornada = finalJornada;
	}

	public CategoriaUsuario getCategoriaUsuario() {
		return categoriaUsuario;
	}

	public void setCategoriaUsuario(CategoriaUsuario categoriaUsuario) {
		this.categoriaUsuario = categoriaUsuario;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public NivelAcesso getNivelAcesso() {
		return nivelAcesso;
	}

	public void setNivelAcesso(NivelAcesso nivelAcesso) {
		this.nivelAcesso = nivelAcesso;
	}

	public JornadaTrabalho getJornadaTrabalho() {
		return jornadaTrabalho;
	}

	public void setJornadaTrabalho(JornadaTrabalho jornadaTrabalho) {
		this.jornadaTrabalho = jornadaTrabalho;
	}

}
