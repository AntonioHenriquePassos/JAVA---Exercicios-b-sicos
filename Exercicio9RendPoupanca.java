package exerciciosFinalDeSemana;

import java.util.Scanner;

/* 09 - Fa�a um Programa que receba um valor que foi depositado e exiba o valor com rendimento ap�s um m�s. 
Considere fixo o juro da poupan�a em 0,70% a. a.

*/

// Para fazer com juros compostos, seria necess�rio usar formulas que n�o foram abordadas em classe.

public class Exercicio9RendPoupanca {
	public static void main(String[] args) {
		Scanner sist = new Scanner(System.in);
		double valorDeposito;
		int tempoAplicado = 1;
		double taxaMensal = 0.70 / 12;
		double valorFinal;
		
		
		System.out.println("Informe o valor do dep�sito: ");
		valorDeposito = sist.nextDouble();
		valorFinal = (valorDeposito*taxaMensal)+valorDeposito;
		
	
		System.out.printf("O valor depositado, ap�s %d m�s sob a taxa %.2f, rendeu: %.2f, o valor final � %.2f. ", tempoAplicado, taxaMensal, valorDeposito *taxaMensal, valorFinal );
		
	
		
		
		
	}

	
}
