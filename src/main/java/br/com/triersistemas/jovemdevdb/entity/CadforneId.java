package br.com.triersistemas.jovemdevdb.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
@Embeddable
public class CadforneId implements Serializable{
	@Column(name = "cod_rede")
	private Long codReduzido;
	@Column(name = "cod_fornec")
	private Long codFornecedor;
	
	public CadforneId(Long codReduzido, Long codFornecedor) {
		super();
		this.codReduzido = codReduzido;
		this.codFornecedor = codFornecedor;
	}
}
