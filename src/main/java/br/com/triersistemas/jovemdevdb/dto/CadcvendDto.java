package br.com.triersistemas.jovemdevdb.dto;

import java.sql.Date;

import br.com.triersistemas.jovemdevdb.entity.CadcvendEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class CadcvendDto {
	private Long codRede;
	private Long codFilial;
	private Long numNota;
	private Date dataEmissao;
	private String flgExcluido;
	
	public CadcvendDto(CadcvendEntity entity) {
		super();
		this.codRede = entity.getId().getCodRede();
		this.codFilial = entity.getId().getCodFilial();
		this.numNota = entity.getId().getNumNota();
		this.dataEmissao = entity.getDataEmissao();
		this.flgExcluido = entity.getFlgExcluido();
	}	
}
