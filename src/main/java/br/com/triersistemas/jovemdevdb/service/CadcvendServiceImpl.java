package br.com.triersistemas.jovemdevdb.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.triersistemas.jovemdevdb.dto.CadcvendDto;
import br.com.triersistemas.jovemdevdb.entity.CadcvendEntity;
import br.com.triersistemas.jovemdevdb.entity.CadcvendId;
import br.com.triersistemas.jovemdevdb.repository.CadcvendRepository;

@Service
public class CadcvendServiceImpl implements CadcvendService{
	
	@Autowired
	private CadcvendRepository repository;

	@Override
	public List<CadcvendDto> buscarPorNomeAndStatus() {
		return repository.buscarPorNomeAndStatus().stream().map(CadcvendDto::new).collect(Collectors.toList());
	}

	@Override
	public CadcvendDto findById(CadcvendId id) {
		Optional<CadcvendEntity> opt = repository.findById(id);
		return Objects.nonNull(opt.get()) ? new CadcvendDto(opt.get()) : null;
	}
}
