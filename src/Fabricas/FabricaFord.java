package Fabricas;

import Carros.Ka;
import Carros.NewFiesta;
import Interfaces.CarroPopular;
import Interfaces.CarroSedan;
import Interfaces.FabricaDeCarro;

public class FabricaFord implements FabricaDeCarro {

	@Override
	public CarroSedan criarCarroSedan() {
		return new NewFiesta();
	}

	@Override
	public CarroPopular criarCarroPopular() {
		// TODO Auto-generated method stub
		return new Ka();
	}

}
