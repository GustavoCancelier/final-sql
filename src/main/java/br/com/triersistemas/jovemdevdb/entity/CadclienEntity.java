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
@Table(name = "cadclien")
@NoArgsConstructor
@Getter
public class CadclienEntity {
	
	@EmbeddedId
	private CadclienId id;
	@Column(name = "nom_cliente")
	private String nome;
	
	@OneToMany(mappedBy = "cadclienEntity", fetch = FetchType.EAGER)
	List<CadcvendEntity> clientes;

	public CadclienEntity(CadclienId id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}
}
