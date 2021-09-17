package br.com.triersistemas.jovemdevdb.dto;

import java.sql.Date;
import java.util.Objects;

import br.com.triersistemas.jovemdevdb.entity.CadivendEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class CadivendDto {
	private Long codRede;
	private Long codFilial;
	private Long numNota;
	private Long numSequencial;
	private Date dataEmissao;
	private Long qtdProduto;
	private String nomeVendedor;
	private String flgExcluido;
	
	public CadivendDto(CadivendEntity entity) {
		super();
		this.codRede = entity.getId().getCodRede();
		this.codFilial = entity.getId().getCodFilial();
		this.numNota = entity.getId().getNumNota();
		this.numSequencial = entity.getId().getNumSquencial();
		this.dataEmissao = entity.getDataEmissao();
		this.qtdProduto = entity.getQtdProduto();
		this.flgExcluido = entity.getFlgExcluido();
		
		if(Objects.nonNull(entity.getCadusuarEntity())) {
			this.nomeVendedor = entity.getCadusuarEntity().getNome();
		}
	}
	
	
}
