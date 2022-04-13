package exerciciosFinalDeSemana;

import java.util.Scanner;

/* 09 - Faça um Programa que receba um valor que foi depositado e exiba o valor com rendimento após um mês. 
Considere fixo o juro da poupança em 0,70% a. a.

*/

// Para fazer com juros compostos, seria necessário usar formulas que não foram abordadas em classe.

public class Exercicio9RendPoupanca {
	public static void main(String[] args) {
		Scanner sist = new Scanner(System.in);
		double valorDeposito;
		int tempoAplicado = 1;
		double taxaMensal = 0.70 / 12;
		double valorFinal;
		
		
		System.out.println("Informe o valor do depósito: ");
		valorDeposito = sist.nextDouble();
		valorFinal = (valorDeposito*taxaMensal)+valorDeposito;
		
	
		System.out.printf("O valor depositado, após %d mês sob a taxa %.2f, rendeu: %.2f, o valor final é %.2f. ", tempoAplicado, taxaMensal, valorDeposito *taxaMensal, valorFinal );
		
	
		
		
		
	}

	
}
