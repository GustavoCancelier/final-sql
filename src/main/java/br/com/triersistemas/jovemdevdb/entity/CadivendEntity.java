package br.com.triersistemas.jovemdevdb.entity;

import java.sql.Date;

import javax.persistence.Column;
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
@Table(name = "cadivend")
@NoArgsConstructor
@Getter
public class CadivendEntity {
	
	@EmbeddedId
	private CadivendId id;
	@Column(name = "dat_emissao")
	private Date dataEmissao;
	@Column(name = "qtd_produto")
	private Long qtdProduto;
	@Column(name = "flg_excluido")
	private String flgExcluido;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns ({
		@JoinColumn(name = "cod_rede", referencedColumnName = "cod_rede", insertable = false, updatable = false),
		@JoinColumn(name = "cod_filial", referencedColumnName = "cod_filial", insertable = false, updatable = false),
		@JoinColumn(name = "num_nota", referencedColumnName = "num_nota", insertable = false, updatable = false)
	})
	private CadcvendEntity cadcvendEntity; 
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns ({
		@JoinColumn(name = "cod_rede", referencedColumnName = "cod_rede", insertable = false, updatable = false),
		@JoinColumn(name = "cod_reduzido", referencedColumnName = "cod_reduzido", insertable = false, updatable = false)
	})
	private CadproduEntity cadproduEntity; 
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns ({
		@JoinColumn(name = "cod_rede", referencedColumnName = "cod_rede", insertable = false, updatable = false),
		@JoinColumn(name = "cod_vendedor", referencedColumnName = "cod_usuario", insertable = false, updatable = false)
	})
	private CadusuarEntity cadusuarEntity; 
	
	public CadivendEntity(CadivendId id, Date dataEmissao, Long qtdProduto, String flgExcluido) {
		super();
		this.id = id;
		this.dataEmissao = dataEmissao;
		this.qtdProduto = qtdProduto;
		this.flgExcluido = flgExcluido;
	}
}
