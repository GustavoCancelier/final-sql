package br.com.triersistemas.jovemdevdb.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
@Embeddable
public class CadcvendId implements Serializable {

	@Column(name = "cod_rede")
	private Long codRede;
	@Column(name = "cod_filial")
	private Long codFilial;
	@Column(name = "num_nota")
	private Long numNota;
	
	public CadcvendId(Long codRede, Long codFilial, Long numNota) {
		super();
		this.codRede = codRede;
		this.codFilial = codFilial;
		this.numNota = numNota;
	}
}
