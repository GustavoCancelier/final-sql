package br.com.triersistemas.jovemdevdb.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import br.com.triersistemas.jovemdevdb.entity.CadcdbarEntity;
import br.com.triersistemas.jovemdevdb.entity.CadproduEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class CadproduDto {
	private Long codRede;
	private Long codReduzido;
	private String nomeProduto;
	private String flgAtivo;
	private CadlaborDto laboratorio;
	private List<Long> codigoBarras;
	
	public CadproduDto (CadproduEntity entity) {
		this.codRede = entity.getId().getCodRede();
		this.codReduzido = entity.getId().getCodReduzido();
		this.nomeProduto = entity.getNomeProduto();
		this.flgAtivo = entity.getFlgAtivo();
		
		if(Objects.nonNull(entity.getLaboratorio())) {
			this.laboratorio = new CadlaborDto(entity.getLaboratorio());
		}
		
		if(Objects.nonNull(entity.getCodigosBarras())) {
			this.codigoBarras = new ArrayList<Long>();
			for(CadcdbarEntity cadcdBar : entity.getCodigosBarras()) {
				this.codigoBarras.add(cadcdBar.getId().getCodBarra());
			}
		}
	}

	public CadproduDto(Long codRede, Long codReduzido, String nomeProduto, String flgAtivo, CadlaborDto laboratorio) {
		super();
		this.codRede = codRede;
		this.codReduzido = codReduzido;
		this.nomeProduto = nomeProduto;
		this.flgAtivo = flgAtivo;
		this.laboratorio = laboratorio;
	}
	
	public void alterarNome(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	
	public void alterarLaboratorio(CadlaborDto laboratorio) {
		this.laboratorio = laboratorio;
	}
}
