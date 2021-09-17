package br.com.triersistemas.jovemdevdb.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
@Embeddable
public class CadccompId implements Serializable{
	
	@Column(name = "cod_rede")
	private Long codRede;
	@Column(name = "cod_filial")
	private Long codFilial;
	@Column(name = "cod_fornec")
	private Long codFornecedor;
	@Column(name = "num_nota")
	private Long numNota;
	@Column(name = "num_seqnota")
	private Long numSeqNota;
	
	public CadccompId(Long codRede, Long codFilial, Long codFornecedor, Long numNota, Long numSeqNota) {
		super();
		this.codRede = codRede;
		this.codFilial = codFilial;
		this.codFornecedor = codFornecedor;
		this.numNota = numNota;
		this.numSeqNota = numSeqNota;
	}
}
