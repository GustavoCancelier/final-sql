package br.com.triersistemas.jovemdevdb.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@NoArgsConstructor
@Getter
public class CadproduId implements Serializable{
	
	@Column(name = "cod_rede")
	private Long codRede;
	
	@Column(name = "cod_reduzido")
	private Long codReduzido;

	public CadproduId(Long codRede, Long codReduzido) {
		this.codRede = codRede;
		this.codReduzido = codReduzido;
	}
	
	
}
