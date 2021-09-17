package br.com.triersistemas.jovemdevdb.entity;

import java.util.List;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import br.com.triersistemas.jovemdevdb.dto.CadproduDto;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "cadprodu")
@NoArgsConstructor
@Getter
public class CadproduEntity {
	
	@EmbeddedId
	private CadproduId id;
	
	@Column(name = "nom_produto")
	private String nomeProduto;
	
	@Column(name = "flg_ativo")
	private String flgAtivo;
	
	@Column(name = "cod_laborat")
	private Long codLaborat;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumns ({
		@JoinColumn(name = "cod_rede", referencedColumnName = "cod_rede", insertable = false, updatable = false),
		@JoinColumn(name = "cod_laborat", referencedColumnName = "cod_laborat", insertable = false, updatable = false)
	})
	private CadlaborEntity laboratorio;
	
	@OneToMany(mappedBy = "cadproduEntity", fetch = FetchType.EAGER)
	List<CadcdbarEntity> codigosBarras;
	
	@OneToMany(mappedBy = "cadproduEntity", fetch = FetchType.EAGER)
	Set<CadicompEntity> itens;
	
	@OneToMany(mappedBy = "cadproduEntity", fetch = FetchType.EAGER)
	Set<CadivendEntity> itensVenda;

	public CadproduEntity(CadproduId id, String nomeProduto, String flgAtivo) {
		super();
		this.id = id;
		this.nomeProduto = nomeProduto;
		this.flgAtivo = flgAtivo;
	}

	public CadproduEntity(CadproduDto dto) {
		super();
		this.id = new CadproduId(dto.getCodRede(), dto.getCodReduzido());
		this.nomeProduto = dto.getNomeProduto();
		this.flgAtivo = dto.getFlgAtivo();
		if (Objects.nonNull(dto.getLaboratorio())) {
			this.laboratorio = new CadlaborEntity(dto.getLaboratorio());
			this.codLaborat = dto.getLaboratorio().getCodLaboratorio();
		}
		
	}
	
	public CadproduEntity atualizaCadprodu(CadproduDto dto) {
		this.nomeProduto = dto.getNomeProduto();
		this.flgAtivo = dto.getFlgAtivo();
		if (Objects.nonNull(dto.getLaboratorio())) {
			this.laboratorio = new CadlaborEntity(dto.getLaboratorio());
			this.codLaborat = dto.getLaboratorio().getCodLaboratorio();
		}
		
		return this;
	}
	
}
