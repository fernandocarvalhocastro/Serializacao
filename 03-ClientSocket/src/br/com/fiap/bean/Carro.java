package br.com.fiap.bean;

import java.io.Serializable;

public class Carro implements Serializable{

	private static final long serialVersionUID = -1972611482162028226L;
	private String placa;
	private String cor;
	
	public Carro(String placa, String cor) {
		super();
		this.placa = placa;
		this.cor = cor;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
