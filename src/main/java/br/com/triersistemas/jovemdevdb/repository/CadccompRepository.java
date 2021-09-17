package br.com.triersistemas.jovemdevdb.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.triersistemas.jovemdevdb.entity.CadccompEntity;
import br.com.triersistemas.jovemdevdb.entity.CadccompId;
import br.com.triersistemas.jovemdevdb.entity.CadproduEntity;

@Repository
public interface CadccompRepository extends JpaRepository<CadccompEntity, CadccompId>{

	@Query("SELECT p FROM CadccompEntity p WHERE p.cadforneEntity.id.codFornecedor = :codigoFornecedor")
	List<CadccompEntity> buscarPorCodigoFornecedor(Long codigoFornecedor);
}
