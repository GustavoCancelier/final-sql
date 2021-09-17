package br.com.triersistemas.jovemdevdb.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.triersistemas.jovemdevdb.dto.CadivendDto;
import br.com.triersistemas.jovemdevdb.entity.CadicompEntity;
import br.com.triersistemas.jovemdevdb.entity.CadivendId;

@Service
public interface CadivendService {
	List<CadivendDto> buscarPorCodigoVendedor(Long codigoRede, Long codigoUsuario);
	List<CadivendDto> buscarPorCodigoVenda(Long codRede, Long codFilial, Long numNota);
	CadivendDto findById(CadivendId id);
}
