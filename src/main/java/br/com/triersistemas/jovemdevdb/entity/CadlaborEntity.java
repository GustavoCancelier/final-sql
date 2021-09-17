package br.com.triersistemas.jovemdevdb.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import br.com.triersistemas.jovemdevdb.dto.CadlaborDto;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "cadlabor")
@NoArgsConstructor
@Getter
public class CadlaborEntity {
	
	@EmbeddedId
	private CadlaborId id;
	
	@Column(name = "nom_laborat")
	private String nomLaboratorio;
	
	@OneToMany(mappedBy = "laboratorio")
	private List<CadproduEntity> produtos;

	public CadlaborEntity(CadlaborId id, String nomLaboratorio) {
		super();
		this.id = id;
		this.nomLaboratorio = nomLaboratorio;
	}
	
	public CadlaborEntity(CadlaborDto dto) {
		this.id = new CadlaborId(dto.getCodRede(), dto.getCodLaboratorio());
		this.nomLaboratorio = dto.getNomeLaboratorio();
	}
}
