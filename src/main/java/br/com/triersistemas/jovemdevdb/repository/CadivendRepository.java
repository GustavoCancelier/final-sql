package br.com.triersistemas.jovemdevdb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.triersistemas.jovemdevdb.entity.CadcvendEntity;
import br.com.triersistemas.jovemdevdb.entity.CadicompEntity;
import br.com.triersistemas.jovemdevdb.entity.CadivendEntity;
import br.com.triersistemas.jovemdevdb.entity.CadivendId;

@Repository
public interface CadivendRepository extends JpaRepository<CadivendEntity, CadivendId>{
	@Query("SELECT c FROM CadivendEntity c WHERE c.cadusuarEntity.id.codRede = :codigoRede AND"
			+ " c.cadusuarEntity.id.codUsuario = :codigoUsuario")
	List<CadivendEntity> buscarPorCodigoVendedor(Long codigoRede, Long codigoUsuario);
	
	@Query("SELECT p FROM CadivendEntity p WHERE p.cadcvendEntity.id.codRede = :codRede "
			+ 	"AND p.cadcvendEntity.id.codFilial = :codFilial AND p.cadcvendEntity.id.numNota = :numNota AND p.flgExcluido <> 'S'")
	List<CadivendEntity> buscarPorCodigoVenda(Long codRede, Long codFilial, Long numNota);
}
