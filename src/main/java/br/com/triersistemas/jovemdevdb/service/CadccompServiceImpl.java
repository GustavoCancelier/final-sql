package br.com.triersistemas.jovemdevdb.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.triersistemas.jovemdevdb.dto.CadccompDto;
import br.com.triersistemas.jovemdevdb.dto.CadproduDto;
import br.com.triersistemas.jovemdevdb.entity.CadccompEntity;
import br.com.triersistemas.jovemdevdb.entity.CadccompId;
import br.com.triersistemas.jovemdevdb.repository.CadccompRepository;

@Service
public class CadccompServiceImpl implements CadccompService {

	@Autowired
	private CadccompRepository repository;

	@Override
	public CadccompDto findById(CadccompId id) {
		Optional<CadccompEntity> opt = repository.findById(id);
		return Objects.nonNull(opt.get()) ? new CadccompDto(opt.get()) : null;
	}

	@Override
	public List<CadccompDto> findAll() {
		return repository.findAll().stream().map(CadccompDto::new).collect(Collectors.toList());
	}

	@Override
	public List<CadccompDto> buscarPorCodigoFornecedor(Long codigoFornecedor) {
		return  repository.buscarPorCodigoFornecedor(codigoFornecedor).stream().map(CadccompDto::new).collect(Collectors.toList());
	}
}
