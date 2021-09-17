package br.com.triersistemas.jovemdevdb.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
@Embeddable
public class CadivendId implements Serializable {
	
	@Column(name = "cod_rede")
	private Long codRede;
	@Column(name = "cod_filial")
	private Long codFilial;
	@Column(name = "num_nota")
	private Long numNota;
	@Column(name = "num_sequencial")
	private Long numSquencial;
	
	public CadivendId(Long codRede, Long codFilial, Long numNota, Long numSquencial) {
		super();
		this.codRede = codRede;
		this.codFilial = codFilial;
		this.numNota = numNota;
		this.numSquencial = numSquencial;
	}
}
