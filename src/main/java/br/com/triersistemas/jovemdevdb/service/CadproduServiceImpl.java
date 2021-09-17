package br.com.triersistemas.jovemdevdb.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.triersistemas.jovemdevdb.dto.CadproduDto;
import br.com.triersistemas.jovemdevdb.entity.CadproduEntity;
import br.com.triersistemas.jovemdevdb.entity.CadproduId;
import br.com.triersistemas.jovemdevdb.repository.CadproduRepository;

@Service
public class CadproduServiceImpl implements CadproduService {
	
	@Autowired
	private CadproduRepository repository;
	
	@Override
	public List<CadproduDto> findAll() {
		return repository.findAll().stream().map(CadproduDto::new).collect(Collectors.toList());
	}

	@Override
	public CadproduDto findById(CadproduId id) {
		Optional<CadproduEntity> opt = repository.findById(id);
		return Objects.nonNull(opt.get()) ? new CadproduDto(opt.get()) : null;
	}

	@Override
	public List<CadproduDto> findByNomeProdutoContaining(String nome) {
		return repository.findByNomeProdutoContaining(nome).stream().map(CadproduDto::new).collect(Collectors.toList());
	}

	@Override
	public List<CadproduDto> findByNomeProdutoContainingIgnoreCase(String nome) {
		return repository.findByNomeProdutoContainingIgnoreCase(nome).stream().map(CadproduDto::new).collect(Collectors.toList());
	}

	@Override
	public List<CadproduDto> findByNomeProdutoContainingIgnoreCaseAndFlgAtivoIs(String nome, String flg_ativo) {
		return repository.findByNomeProdutoContainingIgnoreCaseAndFlgAtivoIs(nome, flg_ativo).stream().map(CadproduDto::new).collect(Collectors.toList());
	}

	@Override
	public List<CadproduDto> buscarPorNomeAndStatus(String nome, String flg_ativo) {
		return repository.buscarPorNomeAndStatus(nome, flg_ativo).stream().map(CadproduDto::new).collect(Collectors.toList());
	}

	@Override
	public List<CadproduDto> buscarPorCodigoLaboratorio(Long codigoLaboratorio) {
		return repository.buscarPorCodigoLaboratorio(codigoLaboratorio).stream().map(CadproduDto::new).collect(Collectors.toList());
	}

	@Override
	public List<CadproduDto> buscarPorCodigoBarras(Long codigoBarras) {
		return repository.buscarPorCodigoBarras(codigoBarras).stream().map(CadproduDto::new).collect(Collectors.toList());
	}

	@Override
	public CadproduDto salvar(CadproduDto dto) {
		Optional<CadproduEntity> opt = repository.findById(new CadproduId(dto.getCodRede(), dto.getCodReduzido()));
		return opt.isEmpty() ? new CadproduDto(repository.save(new CadproduEntity(dto))) :  
			new CadproduDto(repository.save(opt.get().atualizaCadprodu(dto)));
	}

	@Override
	public Long getNextCodReduzido() {
		return repository.getNextCodReduzido();
	}

}
