package br.com.triersistemas.jovemdevdb.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.triersistemas.jovemdevdb.dto.CadccompDto;
import br.com.triersistemas.jovemdevdb.dto.CadicompDto;
import br.com.triersistemas.jovemdevdb.dto.CadivendDto;
import br.com.triersistemas.jovemdevdb.entity.CadccompEntity;
import br.com.triersistemas.jovemdevdb.entity.CadccompId;
import br.com.triersistemas.jovemdevdb.entity.CadivendEntity;
import br.com.triersistemas.jovemdevdb.entity.CadivendId;
import br.com.triersistemas.jovemdevdb.repository.CadivendRepository;

@Service
public class CadivendServiceImpl implements CadivendService{
	
	@Autowired
	private CadivendRepository repository;

	@Override
	public List<CadivendDto> buscarPorCodigoVendedor(Long codigoRede, Long codigoUsuario) {
		return repository.buscarPorCodigoVendedor(codigoRede, codigoUsuario).stream().map(CadivendDto::new).collect(Collectors.toList());
	}

	@Override
	public List<CadivendDto> buscarPorCodigoVenda(Long codRede, Long codFilial, Long numNota) {
		return repository.buscarPorCodigoVenda(codRede, codFilial, numNota).stream().map(CadivendDto::new).collect(Collectors.toList());
	}

	@Override
	public CadivendDto findById(CadivendId id) {
		Optional<CadivendEntity> opt = repository.findById(id);
		return Objects.nonNull(opt.get()) ? new CadivendDto(opt.get()) : null;
	}
}
