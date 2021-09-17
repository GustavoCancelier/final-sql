package br.com.triersistemas.jovemdevdb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.triersistemas.jovemdevdb.entity.CadcvendEntity;
import br.com.triersistemas.jovemdevdb.entity.CadcvendId;

@Repository
public interface CadcvendRepository extends JpaRepository<CadcvendEntity, CadcvendId> {
	@Query("SELECT c FROM CadcvendEntity c WHERE c.flgExcluido <> 'S'")
	List<CadcvendEntity> buscarPorNomeAndStatus();
}
