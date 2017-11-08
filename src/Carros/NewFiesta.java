package Carros;

import Interfaces.CarroSedan;

public class NewFiesta implements CarroSedan {

	@Override
	public void exibirInfoSedan() {
		System.out.println("Modelo: New Fiesta\nFábrica: Ford\nCategoria:Sedan");
	}

}
