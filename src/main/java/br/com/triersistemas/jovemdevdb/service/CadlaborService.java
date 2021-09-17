package br.com.triersistemas.jovemdevdb.service;

import org.springframework.stereotype.Service;

import br.com.triersistemas.jovemdevdb.dto.CadlaborDto;
import br.com.triersistemas.jovemdevdb.entity.CadlaborId;

@Service
public interface CadlaborService {
	CadlaborDto findById(CadlaborId id);
}
