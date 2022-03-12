package br.com.bruno.carros.ControllerRest;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.bruno.carros.ControllerRest.Dto.CarrosDto;
import br.com.bruno.carros.Model.Carros;
import br.com.bruno.carros.Repository.CarrosRepository;

@RestController
@RequestMapping("/carros")
public class CarrosController {

	@Autowired
	private CarrosRepository carrosRepository;
	

	@PostMapping(path = "salvar")
	public Carros salvar(@RequestBody Carros carros) {

		return carrosRepository.save(carros);

	}
	


	@GetMapping(path = "consulta/todos")
	public List<CarrosDto> consultartodos() {
		List<Carros> carros = carrosRepository.findAll();
		return CarrosDto.converter(carros);
	

	}
	
	@GetMapping(path = "consulta/modelo/{codigo}")
	public ResponseEntity<List<CarrosDto>> consultarPorModelo(@PathVariable("codigo") Integer codigo)  {
		List<Carros> carros = carrosRepository.finfByModelo_Id(codigo);
		
		
		if (carros == null) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok(CarrosDto.converter(carros));
	

	}
	


	@GetMapping(path = "consulta/{codigo}")
	public ResponseEntity consultar(@PathVariable("codigo") Integer codigo) {
		return carrosRepository.findById(codigo).map(record -> ResponseEntity.ok().body(record))
				.orElse(ResponseEntity.notFound().build());
	}

	@PutMapping(path = "atualiza/{id}")
	public ResponseEntity atualiza(@PathVariable("id") Integer id, @RequestBody Carros carros) {
		Carros existentis = carrosRepository.findOne(id);

		if (existentis == null) {
			return ResponseEntity.notFound().build();
		}
		BeanUtils.copyProperties(carros, existentis, "id");
		existentis = carrosRepository.save(existentis);
		return ResponseEntity.ok("Este carro foi atualizado com sucesso");

	}
	
	@DeleteMapping(path = "deletar/{id}")
	public ResponseEntity deletar(@PathVariable("id") Integer id){
		Carros carros = carrosRepository.findOne(id);
		
		if(carros == null) {
			
			return ResponseEntity.notFound().build();
		}
		
		
		carrosRepository.deleteById(id);
		return ResponseEntity.ok("Você deletou o Carro de Modelo: "+
		          carros.getModelo().getNomeDoModelo());
	}

}
