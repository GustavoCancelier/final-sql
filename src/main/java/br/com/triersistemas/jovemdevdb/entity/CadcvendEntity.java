package br.com.triersistemas.jovemdevdb.entity;

import java.sql.Date;
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
@Table(name = "cadcvend")
@NoArgsConstructor
@Getter
public class CadcvendEntity {
	
	@EmbeddedId
	private CadcvendId id;
	@Column(name = "dat_emissao")
	private Date dataEmissao;
	@Column(name = "flg_excluido")
	private String flgExcluido;
	
	@OneToMany(mappedBy = "cadcvendEntity", fetch = FetchType.LAZY)
	List<CadivendEntity> cabecalhoDeVendas;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns ({
		@JoinColumn(name = "cod_rede", referencedColumnName = "cod_rede", insertable = false, updatable = false),
		@JoinColumn(name = "cod_cliente", referencedColumnName = "cod_cliente", insertable = false, updatable = false)
	})
	private CadclienEntity cadclienEntity; 

	public CadcvendEntity(CadcvendId id, Date dataEmissao) {
		super();
		this.id = id;
		this.dataEmissao = dataEmissao;
	}
}
