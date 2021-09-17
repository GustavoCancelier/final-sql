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
@Table(name = "cadicomp")
@NoArgsConstructor
@Getter
public class CadicompEntity {
	
	@EmbeddedId
	private CadicompId id;
	
	@Column(name = "dat_entrada")
	private Date dataEntrada;
	@Column(name = "qtd_produto")
	private Long qtdProduto;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns ({
		@JoinColumn(name = "cod_rede", referencedColumnName = "cod_rede", insertable = false, updatable = false),
		@JoinColumn(name = "cod_filial", referencedColumnName = "cod_filial", insertable = false, updatable = false),
		@JoinColumn(name = "cod_fornec", referencedColumnName = "cod_fornec", insertable = false, updatable = false),
		@JoinColumn(name = "num_nota", referencedColumnName = "num_nota", insertable = false, updatable = false),
		@JoinColumn(name = "num_seqnota", referencedColumnName = "num_seqnota", insertable = false, updatable = false)
	})
	private CadccompEntity cadccompEntity; 
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns ({
		@JoinColumn(name = "cod_rede", referencedColumnName = "cod_rede", insertable = false, updatable = false),
		@JoinColumn(name = "cod_reduzido", referencedColumnName = "cod_reduzido", insertable = false, updatable = false)
	})
	private CadproduEntity cadproduEntity; 
	
	public CadicompEntity(CadicompId id, Date dataEntrada, Long qtdProduto) {
		super();
		this.id = id;
		this.dataEntrada = dataEntrada;
		this.qtdProduto = qtdProduto;
	}
}
