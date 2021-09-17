package br.com.triersistemas.jovemdevdb.entity;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "cadccomp")
@NoArgsConstructor
@Getter
public class CadccompEntity {
	
	@EmbeddedId
	private CadccompId id;
	@Column(name = "dat_entrada")
	private Date dataEntrada;
	
	@OneToMany(mappedBy = "cadccompEntity", fetch = FetchType.LAZY)
	List<CadicompEntity> cabecalhoDeCompras;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns ({
		@JoinColumn(name = "cod_rede", referencedColumnName = "cod_rede", insertable = false, updatable = false),
		@JoinColumn(name = "cod_fornec", referencedColumnName = "cod_fornec", insertable = false, updatable = false)
	})
	private CadforneEntity cadforneEntity; 
	
	public CadccompEntity(CadccompId id, Date dataEntrada, List<CadproduEntity> produtos) {
		super();
		this.id = id;
		this.dataEntrada = dataEntrada;
	}
}
