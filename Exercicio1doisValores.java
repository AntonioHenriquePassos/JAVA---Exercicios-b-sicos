package exerciciosFinalDeSemana;

import java.util.Scanner;

/*01 - Escrever um Programa que receba dois valores númericos e exiba o maior entre os 2 numeros, use Scanner, validar 
caso os numeros forem iguais também.
*/

public class Exercicio1doisValores {
	public static void main(String[] args) {
		Scanner sist = new Scanner (System.in);
		int valor1;
		int valor2;
		
		System.out.println("Digite o primeiro valor: ");
		valor1 = sist.nextInt();
		System.out.println("Digite o segundo valor: ");
		valor2 = sist.nextInt();
			
		
		
		if(valor1 > valor2) {
			System.out.println("O maior valor, entre os dois digitados, é o: " + valor1);
			
		} else if (valor2 > valor1) {
			System.out.println("O maior valor, entre os dois digitados, é o: " + valor2);
		} else {
			System.out.println("Os valores digitados são iguais.");
		}
	
		sist.close();
	}
}
