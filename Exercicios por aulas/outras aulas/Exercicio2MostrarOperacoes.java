package exerciciosFinalDeSemana;

import java.util.Scanner;

/* 02 - Escrever um Programa que receba dois valores númericos e ao final mostre a soma, subtração, multiplicação e a 
divisão dos valores lidos.
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
			System.out.println("Por favor, não digite zero");
			System.out.println("Digite o segundo valor novamente: ");
			valor2 = sist.nextInt();
		}
		
		System.out.printf("Mostrando a SOMA dos valores digitados: %.2f + %.2f = %.2f ",valor1, valor2, valor1 + valor2);
		System.out.printf("\nMostrando a SUBTRAÇÃO dos valores digitados: %.2f - %.2f = %.2f ",valor1, valor2, valor1 - valor2);
		System.out.printf("\nMostrando a MULTIPLICAÇÃO dos valores digitados: %.2f * %.2f = %.2f ",valor1, valor2, valor1 * valor2);
		System.out.printf("\nMostrando a DIVISÃO dos valores digitados: %.2f / %.2f = %.2f ",valor1, valor2, valor1 / valor2);
		
		sist.close();
	}

}
