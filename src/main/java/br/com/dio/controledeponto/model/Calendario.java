package br.com.dio.controledeponto.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Calendario {

	@Id
	private Long id;
	
	@ManyToOne
	private TipoData tipo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public TipoData getTipo() {
		return tipo;
	}

	public void setTipo(TipoData tipo) {
		this.tipo = tipo;
	}
	
}
