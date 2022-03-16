package Collections;

import java.util.ArrayList;

/*Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, o
programa deverá atender as seguintes funcionalidades:
Armazenar dados da List
Remover dados da list;
Atualizar dados da list.
Apresentar todos os dados da list.*/
public class Collections {

		public static void main(String[] args) {
			String carro1 = "Fiat";
			String carro2 = "Chevrolet";
			String carro3 = "Hyundai";
			String carro4 = "Volkswagem";
			
			ArrayList<String> estoque = new ArrayList<>();
			estoque.add(carro1);
			estoque.add(carro2);
			estoque.add(carro3);
			estoque.add(carro4);

			System.out.println(estoque);

			estoque.remove(0);
			System.out.println(estoque);

			for(String i: estoque) {
				System.out.println();
				System.out.println("Temos os carros: " + i);
			}
		}
}
