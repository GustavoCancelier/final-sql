package br.com.triersistemas.jovemdevdb.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
@Embeddable
public class CadusuarId implements Serializable {
	
	@Column(name = "cod_rede")
	private Long codRede;
	@Column(name = "cod_usuario")
	private Long codUsuario;
	
	public CadusuarId(Long codRede, Long codUsuario) {
		super();
		this.codRede = codRede;
		this.codUsuario = codUsuario;
	}
}
