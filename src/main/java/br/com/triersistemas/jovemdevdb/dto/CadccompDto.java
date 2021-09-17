package br.com.triersistemas.jovemdevdb.dto;

import java.sql.Date;
import java.util.List;
import java.util.Objects;

import br.com.triersistemas.jovemdevdb.entity.CadccompEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class CadccompDto {
	private Long codRede;
	private Long codFilial;
	private Long codFornec;
	private Long numNota;
	private Long numSeqNota;
	private Date dataEntrada;
	private String nomeFornecedor;
	
	public CadccompDto(CadccompEntity entity) {
		super();
		this.codRede = entity.getId().getCodRede();
		this.codFilial = entity.getId().getCodFilial();
		this.codFornec = entity.getId().getCodFornecedor();
		this.numNota = entity.getId().getNumNota();
		this.numSeqNota = entity.getId().getNumSeqNota();
		this.dataEntrada = entity.getDataEntrada();
		
		if(Objects.nonNull(entity.getCadforneEntity().getNome())) {
			this.nomeFornecedor = entity.getCadforneEntity().getNome();
		}
		
	}
	
	
	
}
