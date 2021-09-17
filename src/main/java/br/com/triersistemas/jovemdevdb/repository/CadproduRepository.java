package br.com.triersistemas.jovemdevdb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.triersistemas.jovemdevdb.entity.CadproduEntity;
import br.com.triersistemas.jovemdevdb.entity.CadproduId;

@Repository
public interface CadproduRepository extends JpaRepository<CadproduEntity, CadproduId>  {
	List<CadproduEntity> findByNomeProdutoContaining(String nome);
	List<CadproduEntity> findByNomeProdutoContainingIgnoreCase(String nome);
	List<CadproduEntity> findByNomeProdutoContainingIgnoreCaseAndFlgAtivoIs(String nome, String flg_ativo);
	
	@Query("SELECT p FROM CadproduEntity p WHERE UPPER(p.nomeProduto) LIKE UPPER(concat('%', ?1, '%')) AND p.flgAtivo = ?2")
	List<CadproduEntity> buscarPorNomeAndStatus(String nome, String flg_ativo);
	
	@Query("SELECT p FROM CadproduEntity p WHERE p.laboratorio.id.codLaborat = :codigoLaboratorio")
	List<CadproduEntity> buscarPorCodigoLaboratorio(Long codigoLaboratorio);
	
	@Query("SELECT p FROM CadproduEntity p JOIN p.codigosBarras c WHERE c.id.codBarra = ?1")
	List<CadproduEntity> buscarPorCodigoBarras(Long codigoBarras);
	
	@Query("SELECT max(p.id.codReduzido) + 1 FROM CadproduEntity p")
	Long getNextCodReduzido();
}
