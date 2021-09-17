package br.com.triersistemas.jovemdevdb.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "cadcdbar")
@NoArgsConstructor
@Getter
public class CadcdbarEntity {
	
	@EmbeddedId
	private CadcdbarId id;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumns({
		@JoinColumn(name = "cod_rede", referencedColumnName = "cod_rede", insertable = false, updatable = false),
		@JoinColumn(name = "cod_reduzido", referencedColumnName = "cod_reduzido", insertable = false, updatable = false)
	})
	private CadproduEntity cadproduEntity;

	public CadcdbarEntity(CadcdbarId id, CadproduEntity cadproduEntity) {
		super();
		this.id = id;
		this.cadproduEntity = cadproduEntity;
	}
	
	
}
