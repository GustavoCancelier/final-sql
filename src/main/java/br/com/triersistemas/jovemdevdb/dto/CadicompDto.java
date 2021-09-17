package br.com.triersistemas.jovemdevdb.dto;

import java.sql.Date;

import br.com.triersistemas.jovemdevdb.entity.CadicompEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class CadicompDto {
	private Long codRede;
	private Long codFilial;
	private Long codFornec;
	private Long numNota;
	private Long numSeqNota;
	private Long numSequencial;
	private Date dataEntrada;
	private Long qtdProduto;
	
	public CadicompDto(CadicompEntity entity) {
		super();
		this.codRede = entity.getId().getCodRede();
		this.codFilial = entity.getId().getCodFilial();
		this.codFornec = entity.getId().getCodFornecedor();
		this.numNota = entity.getId().getNumNota();
		this.numSeqNota = entity.getId().getNumSeqNota();
		this.numSequencial = entity.getId().getNumSequencial();
		this.dataEntrada = entity.getDataEntrada();
		this.qtdProduto = entity.getQtdProduto();
	}
	
}
