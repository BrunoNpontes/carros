package br.com.bruno.carros.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.bruno.carros.Model.Modelo;
@Repository
public interface ModeloRepository extends JpaRepository<Modelo, Integer>{

}
