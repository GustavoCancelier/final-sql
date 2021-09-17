package br.com.triersistemas.jovemdevdb.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
@Embeddable
public class CadcdbarId implements Serializable{
	
	@Column(name = "cod_rede")
	private Long codRede;
	@Column(name = "cod_reduzido")
	private Long codReduzido;
	@Column(name = "cod_barra")
	private Long codBarra;
	
	public CadcdbarId(Long codRede, Long codReduzido, Long codBarra) {
		super();
		this.codRede = codRede;
		this.codReduzido = codReduzido;
		this.codBarra = codBarra;
	}
}
