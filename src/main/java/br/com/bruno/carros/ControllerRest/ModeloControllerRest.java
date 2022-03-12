package br.com.bruno.carros.ControllerRest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.bruno.carros.Model.Modelo;
import br.com.bruno.carros.Repository.ModeloRepository;


@RestController
@RequestMapping("/modelo")
public class ModeloControllerRest {
    
	

	@Autowired
	private ModeloRepository modeloRepository;
	
	 @GetMapping(path = "consulta/{codigo}")
	    public ResponseEntity consultar(@PathVariable("codigo") Integer codigo) {
	        return modeloRepository.findById(codigo)
	                .map(record -> ResponseEntity.ok().body(record))
	                .orElse(ResponseEntity.notFound().build());
	    }
	 
	 @PostMapping(path = "salvar")
	    public Modelo salvar(@RequestBody Modelo modelo) {
	        return modeloRepository.save(modelo);
        		
                
	 }
	
	
	
}
