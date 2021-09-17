package br.com.triersistemas.jovemdevdb.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.triersistemas.jovemdevdb.dto.CadcvendDto;
import br.com.triersistemas.jovemdevdb.entity.CadcvendEntity;
import br.com.triersistemas.jovemdevdb.entity.CadcvendId;

@Service
public interface CadcvendService {
	List<CadcvendDto> buscarPorNomeAndStatus();
	CadcvendDto findById(CadcvendId id);
}
