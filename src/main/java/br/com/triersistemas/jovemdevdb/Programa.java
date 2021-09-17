package br.com.triersistemas.jovemdevdb;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.triersistemas.jovemdevdb.dto.CadccompDto;
import br.com.triersistemas.jovemdevdb.dto.CadcvendDto;
import br.com.triersistemas.jovemdevdb.dto.CadicompDto;
import br.com.triersistemas.jovemdevdb.dto.CadivendDto;
import br.com.triersistemas.jovemdevdb.dto.CadlaborDto;
import br.com.triersistemas.jovemdevdb.dto.CadproduDto;
import br.com.triersistemas.jovemdevdb.entity.CadccompId;
import br.com.triersistemas.jovemdevdb.entity.CadcvendId;
import br.com.triersistemas.jovemdevdb.entity.CadicompId;
import br.com.triersistemas.jovemdevdb.entity.CadivendId;
import br.com.triersistemas.jovemdevdb.entity.CadlaborId;
import br.com.triersistemas.jovemdevdb.entity.CadproduEntity;
import br.com.triersistemas.jovemdevdb.entity.CadproduId;
import br.com.triersistemas.jovemdevdb.service.CadccompService;
import br.com.triersistemas.jovemdevdb.service.CadcvendService;
import br.com.triersistemas.jovemdevdb.service.CadicompService;
import br.com.triersistemas.jovemdevdb.service.CadivendService;
import br.com.triersistemas.jovemdevdb.service.CadlaborService;
import br.com.triersistemas.jovemdevdb.service.CadproduService;

@Component
public class Programa {
	
	@Autowired
	private CadproduService service;
	
	@Autowired
	private CadccompService serviceCcomp;
	
	@Autowired
	private CadicompService serviceCIcomp;
	
	@Autowired
	private CadcvendService serviceCvend;
	
	@Autowired
	private CadivendService serviceIvend;
	
	@Autowired
	private CadlaborService serviceLabor;
	
	@PostConstruct
	public void run() {
		
		//Cadprodu
		
		/*List<CadproduDto> listaTotal = service.findAll();
		
		CadproduDto produto = service.findById(new CadproduId(1L, 83982L));
		
		List<CadproduDto> listaNome = service.findByNomeProdutoContaining("RIVOTRIL");
		
		List<CadproduDto> listaNomeCase = service.findByNomeProdutoContainingIgnoreCase("rivotril");
		
		List<CadproduDto> listaNomeCaseFlg = 
				service.findByNomeProdutoContainingIgnoreCaseAndFlgAtivoIs("rivotril", "A");
		
		List<CadproduDto> listaNomeCaseFlgQuery = 
				service.buscarPorNomeAndStatus("RIVOTRIL", "A");
		
		List<CadproduDto> listaCodLab = 
				service.buscarPorCodigoLaboratorio(3540L);
		
		List<CadproduDto> listaCodBarras = 
				service.buscarPorCodigoBarras(7896226501239L);*/
		
		//Cadccomp
		
		/*List<CadccompDto> compras = serviceCcomp.findAll();
		
		CadccompDto compra = serviceCcomp.findById(new CadccompId(1L, 1L, 372L, 1L, 0L));
		
		List<CadccompDto> listaCodForne = serviceCcomp.buscarPorCodigoFornecedor(372L);*/
				
		//Cadicomp
		 
		//List<CadicompDto> listaItens = serviceCIcomp.buscarPorCodigoCompra(1L, 1L, 372L, 2L, 0L);
		
		//CadicompDto item = serviceCIcomp.findById(new CadicompId(1L, 1L, 372L, 1L, 0L, 498L));
		
		//Cadcvend
		/*List<CadcvendDto> itensNaoExcluidos = serviceCvend.buscarPorNomeAndStatus();
		
		CadcvendDto CabecalhoVenda = serviceCvend.findById(new CadcvendId(1L, 1L, 1L));*/
		
		//CadiVend
		
		/*List<CadivendDto> listaCodVendedor = serviceIvend.buscarPorCodigoVendedor(1L, 7L);
		
		List<CadivendDto> listaCodVenda = serviceIvend.buscarPorCodigoVenda(1L, 1L, 1L);
		
		CadivendDto venda = serviceIvend.findById(new CadivendId(1L, 2L, 1289L, 1L));*/
		
		//Long codReduzido = service.getNextCodReduzido();
		
		CadlaborDto cadLaborDto = serviceLabor.findById(new CadlaborId(1L, 347L));
		//CadproduDto cadproduDto = new CadproduDto(1L, codReduzido, "Produto teste JPA","A", cadLaborDto);
		
		CadproduDto cadproduDto = service.findById(new CadproduId(1L,78936511L));
		cadproduDto.alterarNome("UPDATE - Produto Teste JPA");
		cadproduDto.alterarLaboratorio(cadLaborDto);
		CadproduDto novoProduto = service.salvar(cadproduDto);
		
		
		System.out.println("Finalizou");
		
		
	}
}
