package br.com.bruno.carros.ControllerRest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.bruno.carros.ControllerRest.Dto.VendasDto;
import br.com.bruno.carros.Model.Vendas;
import br.com.bruno.carros.Repository.VendasRespository;

@RestController
@RequestMapping("/vendas")
public class VendasController {

	@Autowired
	private VendasRespository vendasRespository;

	@PostMapping(path = "salvar")
	public ResponseEntity salvar(@RequestBody Vendas vendas) {

		vendasRespository.save(vendas);
		return ResponseEntity.ok("Venda Efetua Com sucesso!");

	}

	@GetMapping(path = "consulta/todos")
	public ResponseEntity<List<VendasDto>> consultartodos() {
		List<Vendas> vendas = vendasRespository.findAll();

		return ResponseEntity.ok(VendasDto.converter(vendas));

	}

	@GetMapping(path = "consulta/{codigo}")
	public ResponseEntity<List<VendasDto>> consultar(@PathVariable("codigo") Integer codigo) {
		List<Vendas> vendas = vendasRespository.findOne(codigo);

		if (vendas == null) {
			return ResponseEntity.notFound().build();
		}

		return ResponseEntity.ok(VendasDto.converter(vendas));

	}
	
	@GetMapping(path = "consulta/vendedor/{codigo}")
	public ResponseEntity<List<VendasDto>> consultarVendasPorVendador(@PathVariable("codigo") Integer codigo) {
		List<Vendas> vendas = vendasRespository.finfByVendedor(codigo);

		if (vendas == null) {
			return ResponseEntity.notFound().build();
		}

		return ResponseEntity.ok(VendasDto.converter(vendas));

	}

}
