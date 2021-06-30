package br.com.dio.controledeponto.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class BancoHoras {
	@Embeddable
	public class BancoHorasId implements Serializable {
		private static final long serialVersionUID = 1L;
		
		private Long idBancoHoras;
		private Long idMovimento;
		private Long idUsuario;

		public Long getIdBancoHoras() {
			return idBancoHoras;
		}

		public void setIdBancoHoras(Long idBancoHoras) {
			this.idBancoHoras = idBancoHoras;
		}

		public Long getIdMovimento() {
			return idMovimento;
		}

		public void setIdMovimento(Long idMovimento) {
			this.idMovimento = idMovimento;
		}

		public Long getIdUsuario() {
			return idUsuario;
		}

		public void setIdUsuario(Long idUsuario) {
			this.idUsuario = idUsuario;
		}

	}

	@EmbeddedId
	private BancoHorasId id;
	private LocalDateTime dataTrabalhada;
	private BigDecimal quantidadeHoras;
	private BigDecimal saldoHoras;

	public BancoHorasId getId() {
		return id;
	}

	public void setId(BancoHorasId id) {
		this.id = id;
	}

	public LocalDateTime getDataTrabalhada() {
		return dataTrabalhada;
	}

	public void setDataTrabalhada(LocalDateTime dataTrabalhada) {
		this.dataTrabalhada = dataTrabalhada;
	}

	public BigDecimal getQuantidadeHoras() {
		return quantidadeHoras;
	}

	public void setQuantidadeHoras(BigDecimal quantidadeHoras) {
		this.quantidadeHoras = quantidadeHoras;
	}

	public BigDecimal getSaldoHoras() {
		return saldoHoras;
	}

	public void setSaldoHoras(BigDecimal saldoHoras) {
		this.saldoHoras = saldoHoras;
	}

}
