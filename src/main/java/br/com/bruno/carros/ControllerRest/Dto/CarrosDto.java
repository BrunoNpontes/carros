package br.com.bruno.carros.ControllerRest.Dto;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import br.com.bruno.carros.Model.Carros;

public class CarrosDto {
	private Integer id;
	private String modelo;
	private double valor;
	private Integer quilometragem;
	private String cor;
	private List<CaracteristicasDto> caracteristica;

	public CarrosDto(Carros carros) {

		this.id = carros.getId();
		this.modelo = carros.getModelo().getNomeDoModelo();
		this.valor = carros.getValor();
		this.quilometragem = carros.getQuilometragem();
		this.cor = carros.getCor();
		this.caracteristica = new ArrayList<>();
		this.caracteristica
				.addAll(carros.getCaracteristicas().stream().map(CaracteristicasDto::new).collect(Collectors.toList()));
	}

	public List<CaracteristicasDto> getCaracteristica() {
		return caracteristica;
	}

	public Integer getId() {
		return id;
	}

	public String getModelo() {
		return modelo;
	}

	public double getValor() {
		return valor;
	}

	public Integer getQuilometragem() {
		return quilometragem;
	}

	public String getCor() {
		return cor;
	}

	public static List<CarrosDto> converter(List<Carros> carros) {
		return carros.stream().map(CarrosDto::new).collect(Collectors.toList());
	}
	
	

}
