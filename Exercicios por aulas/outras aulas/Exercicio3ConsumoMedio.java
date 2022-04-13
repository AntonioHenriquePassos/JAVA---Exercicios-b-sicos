package exerciciosFinalDeSemana;

import java.util.Scanner;

/*03 - Escrever um Programa para determinar o consumo médio de um automóvel sendo fornecida a distância total 
percorrida pelo automóvel e o total de combustível gasto.
*/

public class Exercicio3ConsumoMedio {
	public static void main(String[] args) {
		Scanner sist = new Scanner (System.in);
		double distanciaTotal;
		double combustivelGasto;
		
		System.out.println("Digite a distância total percorrida em km: ");
		distanciaTotal = sist.nextInt();
		System.out.println("Digite o combustível total gasto em litros: ");
		combustivelGasto = sist.nextInt();
		
		System.out.println("O consumo médio desse auto-móvel é: "+ distanciaTotal/combustivelGasto + " km/l.");
		
		sist.close();
		
	}
	

}
