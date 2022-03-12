package br.com.bruno.carros.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.bruno.carros.Model.Caracteristicas;
@Repository
public interface CaracteristicasRepository extends CrudRepository<Caracteristicas, Integer>{

	
}
