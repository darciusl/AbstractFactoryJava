package App;

import Fabricas.FabricaFiat;
import Fabricas.FabricaFord;
import Interfaces.CarroPopular;
import Interfaces.CarroSedan;
import Interfaces.FabricaDeCarro;

public class Teste {
	
	public static void main(String[] args) {
		
		//EXEMPLO DE USO ABSTRACT FACTORY
		
		//Crio a Fábrica abstrata
		 FabricaDeCarro fabrica = new FabricaFiat();
		 
		    CarroSedan sedan = fabrica.criarCarroSedan();
		    CarroPopular popular = fabrica.criarCarroPopular();
		    sedan.exibirInfoSedan();
		    System.out.println();
		    popular.exibirInfoPopular();
		    System.out.println();
		 
		    
		    fabrica = new FabricaFord();
		    
		    sedan = fabrica.criarCarroSedan();
		    popular = fabrica.criarCarroPopular();
		    sedan.exibirInfoSedan();
		    System.out.println();
		    popular.exibirInfoPopular();
	}
	
	
}
