package br.com.triersistemas.jovemdevdb.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@NoArgsConstructor
@Getter
public class CadlaborId implements Serializable{
	@Column(name = "cod_rede")
	private Long codRede;
	
	@Column(name = "cod_laborat")
	private Long codLaborat;

	public CadlaborId(Long codRede, Long codLaborat) {
		super();
		this.codRede = codRede;
		this.codLaborat = codLaborat;
	}
	
	
}
