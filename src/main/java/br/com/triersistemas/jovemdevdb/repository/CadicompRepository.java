package br.com.triersistemas.jovemdevdb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.triersistemas.jovemdevdb.entity.CadicompEntity;
import br.com.triersistemas.jovemdevdb.entity.CadicompId;

@Repository
public interface CadicompRepository extends JpaRepository<CadicompEntity, CadicompId>{
	
	@Query("SELECT p FROM CadicompEntity p WHERE p.cadccompEntity.id.codRede = :codRede "
			+ 	"AND p.cadccompEntity.id.codFilial = :codFilial AND p.cadccompEntity.id.codFornecedor = :codigoFornecedor "
			+ 	"AND p.cadccompEntity.id.numNota = :numNota AND p.cadccompEntity.id.numSeqNota = :numSeqNota")
	List<CadicompEntity> buscarPorCodigoCompra(Long codRede, Long codFilial, Long codigoFornecedor, Long numNota, Long numSeqNota);
	
	
}
