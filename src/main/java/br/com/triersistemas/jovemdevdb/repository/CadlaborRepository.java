package br.com.triersistemas.jovemdevdb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.triersistemas.jovemdevdb.entity.CadlaborEntity;
import br.com.triersistemas.jovemdevdb.entity.CadlaborId;

@Repository
public interface CadlaborRepository extends JpaRepository<CadlaborEntity, CadlaborId>{

}
