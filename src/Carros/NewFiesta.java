package Carros;

import Interfaces.CarroSedan;

public class NewFiesta implements CarroSedan {

	@Override
	public void exibirInfoSedan() {
		System.out.println("Modelo: New Fiesta\nF�brica: Ford\nCategoria:Sedan");
	}

}
