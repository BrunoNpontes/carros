package br.com.bruno.carros.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.bruno.carros.Model.Vendedor;

public interface VendedorRespository extends JpaRepository<Vendedor, Integer>{

}
