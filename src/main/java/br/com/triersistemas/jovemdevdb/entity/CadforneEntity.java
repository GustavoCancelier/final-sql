package br.com.triersistemas.jovemdevdb.entity;

import java.time.LocalDate;
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
@Table(name = "cadforne")
@NoArgsConstructor
@Getter
public class CadforneEntity {
	@EmbeddedId
	private CadforneId id;
	
	@Column(name = "nom_fornec")
	private String nome;
	
	@OneToMany(mappedBy = "cadforneEntity", fetch = FetchType.EAGER)
	List<CadccompEntity> cabecalhoDeItens;

	public CadforneEntity(CadforneId id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}
}
