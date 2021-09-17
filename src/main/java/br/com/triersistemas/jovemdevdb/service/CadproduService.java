package br.com.triersistemas.jovemdevdb.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.triersistemas.jovemdevdb.dto.CadproduDto;
import br.com.triersistemas.jovemdevdb.entity.CadproduEntity;
import br.com.triersistemas.jovemdevdb.entity.CadproduId;

@Service
public interface CadproduService {
	List<CadproduDto> findAll();
	CadproduDto findById(CadproduId id);
	List<CadproduDto> findByNomeProdutoContaining(String nome);
	List<CadproduDto> findByNomeProdutoContainingIgnoreCase(String nome);
	List<CadproduDto> findByNomeProdutoContainingIgnoreCaseAndFlgAtivoIs(String nome, String flg_ativo);
	List<CadproduDto> buscarPorNomeAndStatus(String nome, String flg_ativo);
	List<CadproduDto> buscarPorCodigoLaboratorio(Long codigoLaboratorio);
	List<CadproduDto> buscarPorCodigoBarras(Long codigoBarras);
	CadproduDto salvar(CadproduDto dto);
	Long getNextCodReduzido();
}
