package br.com.bruno.carros.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.bruno.carros.Model.Carros;
import br.com.bruno.carros.Model.Vendas;

@Repository
public interface VendasRespository extends JpaRepository<Vendas, Integer>{

	@Query("SELECT t FROM  Vendas t WHERE t.id = :codigo")
	List<Vendas> findOne(Integer codigo);
	
	@Query("SELECT t FROM  Vendas t WHERE t.vendedores.id = :codigo")
	List<Vendas> finfByVendedor(Integer codigo);

}
