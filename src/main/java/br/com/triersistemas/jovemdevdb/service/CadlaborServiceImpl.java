package br.com.triersistemas.jovemdevdb.service;

import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.triersistemas.jovemdevdb.dto.CadlaborDto;
import br.com.triersistemas.jovemdevdb.dto.CadproduDto;
import br.com.triersistemas.jovemdevdb.entity.CadlaborEntity;
import br.com.triersistemas.jovemdevdb.entity.CadlaborId;
import br.com.triersistemas.jovemdevdb.repository.CadlaborRepository;

@Service
public class CadlaborServiceImpl implements CadlaborService{

	@Autowired
	private CadlaborRepository repository;
	
	@Override
	public CadlaborDto findById(CadlaborId id) {
		Optional<CadlaborEntity> opt = repository.findById(id);
		return Objects.nonNull(opt.get()) ? new CadlaborDto(opt.get()) : null;
	}
	
}
