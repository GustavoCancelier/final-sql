package br.com.triersistemas.jovemdevdb.entity;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "cadusuar")
@NoArgsConstructor
@Getter
public class CadusuarEntity {
	
	@EmbeddedId
	private CadusuarId id;
	@Column(name = "nom_usuario")
	private String nome;
	
	@OneToMany(mappedBy = "cadusuarEntity", fetch = FetchType.EAGER)
	List<CadivendEntity> usuarios;

	public CadusuarEntity(CadusuarId id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}
}
