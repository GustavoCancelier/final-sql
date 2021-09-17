package br.com.triersistemas.jovemdevdb.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.triersistemas.jovemdevdb.dto.CadccompDto;
import br.com.triersistemas.jovemdevdb.dto.CadicompDto;
import br.com.triersistemas.jovemdevdb.entity.CadccompEntity;
import br.com.triersistemas.jovemdevdb.entity.CadccompId;
import br.com.triersistemas.jovemdevdb.entity.CadicompEntity;
import br.com.triersistemas.jovemdevdb.entity.CadicompId;
import br.com.triersistemas.jovemdevdb.repository.CadicompRepository;

@Service
public class CadicompServiceImpl implements CadicompService {
	
	@Autowired
	private CadicompRepository repository;

	@Override
	public List<CadicompDto> buscarPorCodigoCompra(Long codRede, Long codFilial, Long codigoFornecedor,
			Long numNota, Long numSeqNota) {
		return repository.buscarPorCodigoCompra(codRede, codFilial, codigoFornecedor, numNota, numSeqNota).stream().map(CadicompDto::new).collect(Collectors.toList());
	}
	
	@Override
	public CadicompDto findById(CadicompId id) {
		Optional<CadicompEntity> opt = repository.findById(id);
		return Objects.nonNull(opt.get()) ? new CadicompDto(opt.get()) : null;
	}
}
