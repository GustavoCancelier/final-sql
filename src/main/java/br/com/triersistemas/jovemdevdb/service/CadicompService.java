package br.com.triersistemas.jovemdevdb.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.triersistemas.jovemdevdb.dto.CadccompDto;
import br.com.triersistemas.jovemdevdb.dto.CadicompDto;
import br.com.triersistemas.jovemdevdb.entity.CadccompId;
import br.com.triersistemas.jovemdevdb.entity.CadicompId;

@Service
public interface CadicompService {
	List<CadicompDto> buscarPorCodigoCompra(Long codRede, Long codFilial, Long codigoFornecedor, Long numNota, Long numSeqNota);
	CadicompDto findById(CadicompId id);
}
