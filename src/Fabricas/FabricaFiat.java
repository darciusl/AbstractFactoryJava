package Fabricas;

import Carros.Palio;
import Carros.Siena;
import Interfaces.CarroPopular;
import Interfaces.CarroSedan;
import Interfaces.FabricaDeCarro;

public class FabricaFiat implements FabricaDeCarro {

	@Override
	public CarroSedan criarCarroSedan() {
		return  new Siena();
	}

	@Override
	public CarroPopular criarCarroPopular() {
		return new Palio();
	}

}
