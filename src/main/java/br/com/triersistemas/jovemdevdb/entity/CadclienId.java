package br.com.triersistemas.jovemdevdb.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
@Embeddable
public class CadclienId implements Serializable {
	
	@Column(name = "cod_rede")
	private Long codRede;
	@Column(name = "cod_cliente")
	private Long codReduzido;
	
	public CadclienId(Long codRede, Long codReduzido) {
		super();
		this.codRede = codRede;
		this.codReduzido = codReduzido;
	}
}
