package br.com.triersistemas.jovemdevdb.dto;

import br.com.triersistemas.jovemdevdb.entity.CadlaborEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class CadlaborDto {
	private Long codRede;
	private Long codLaboratorio;
	private String nomeLaboratorio;
	
	public CadlaborDto(Long codRede, Long codLaboratorio, String nomeLaboratorio) {
		super();
		this.codRede = codRede;
		this.codLaboratorio = codLaboratorio;
		this.nomeLaboratorio = nomeLaboratorio;
	}

	public CadlaborDto(CadlaborEntity entity) {
		this.codRede = entity.getId().getCodRede();
		this.codLaboratorio = entity.getId().getCodLaborat();
		this.nomeLaboratorio = entity.getNomLaboratorio();
	}
}
