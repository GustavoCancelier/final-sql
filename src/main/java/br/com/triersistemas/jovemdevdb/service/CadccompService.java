package br.com.triersistemas.jovemdevdb.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.triersistemas.jovemdevdb.dto.CadccompDto;
import br.com.triersistemas.jovemdevdb.dto.CadproduDto;
import br.com.triersistemas.jovemdevdb.entity.CadccompId;

@Service
public interface CadccompService {
	List<CadccompDto> findAll();
	CadccompDto findById(CadccompId id);
	List<CadccompDto> buscarPorCodigoFornecedor(Long codigoFornecedor);
}
