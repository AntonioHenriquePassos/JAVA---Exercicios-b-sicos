package exerciciosFinalDeSemana;

import java.util.Scanner;

/*03 - Escrever um Programa para determinar o consumo m�dio de um autom�vel sendo fornecida a dist�ncia total 
percorrida pelo autom�vel e o total de combust�vel gasto.
*/

public class Exercicio3ConsumoMedio {
	public static void main(String[] args) {
		Scanner sist = new Scanner (System.in);
		double distanciaTotal;
		double combustivelGasto;
		
		System.out.println("Digite a dist�ncia total percorrida em km: ");
		distanciaTotal = sist.nextInt();
		System.out.println("Digite o combust�vel total gasto em litros: ");
		combustivelGasto = sist.nextInt();
		
		System.out.println("O consumo m�dio desse auto-m�vel �: "+ distanciaTotal/combustivelGasto + " km/l.");
		
		sist.close();
		
	}
	

}
