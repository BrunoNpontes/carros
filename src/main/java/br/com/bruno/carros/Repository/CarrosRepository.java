package br.com.bruno.carros.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.bruno.carros.Model.Carros;

@Repository
public interface CarrosRepository extends JpaRepository<Carros, Integer>{

	
	
	@Query("SELECT t FROM  Carros t WHERE t.id = :id")
	Carros findOne(Integer id);
	
	@Query("SELECT t FROM  Carros t WHERE t.modelo.id = :codigo")
	List<Carros> finfByModelo_Id(Integer codigo);
	
	
	
	
}
