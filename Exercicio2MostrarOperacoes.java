package exerciciosFinalDeSemana;

import java.util.Scanner;

/* 02 - Escrever um Programa que receba dois valores n�mericos e ao final mostre a soma, subtra��o, multiplica��o e a 
divis�o dos valores lidos.
*/

public class Exercicio2MostrarOperacoes {
	public static void main(String[] args) {
		Scanner sist = new Scanner (System.in);
		double valor1;
		double valor2;
		
		System.out.println("Digite o primeiro valor: ");
		valor1 = sist.nextInt();
		System.out.println("Digite o segundo valor: ");
		valor2 = sist.nextInt();
		
		if(valor2==0) {
			System.out.println("Por favor, n�o digite zero");
			System.out.println("Digite o segundo valor novamente: ");
			valor2 = sist.nextInt();
		}
		
		System.out.printf("Mostrando a SOMA dos valores digitados: %.2f + %.2f = %.2f ",valor1, valor2, valor1 + valor2);
		System.out.printf("\nMostrando a SUBTRA��O dos valores digitados: %.2f - %.2f = %.2f ",valor1, valor2, valor1 - valor2);
		System.out.printf("\nMostrando a MULTIPLICA��O dos valores digitados: %.2f * %.2f = %.2f ",valor1, valor2, valor1 * valor2);
		System.out.printf("\nMostrando a DIVIS�O dos valores digitados: %.2f / %.2f = %.2f ",valor1, valor2, valor1 / valor2);
		
		sist.close();
	}

}
