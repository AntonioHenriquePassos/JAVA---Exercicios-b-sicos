package exerciciosFinalDeSemana;

import java.util.Scanner;

/* 08 - Elaborar um Programa que efetue a apresenta��o do valor da convers�o em real (R$) de um valor lido em d�lar 
(US$). O Programa dever� solicitar o valor da cota��o do d�lar e tamb�m a quantidade de d�lares dispon�veis com o 
usu�rio. Use o do-while
*/

public class Exercicio8ConversorUsd {
	public static void main(String[] args) {
		Scanner sist = new Scanner (System.in);
		double valorUsd;
		double convParaReal;
		double taxaUsdBrl;
		String continuar;
		
		
	
		do {
			
			System.out.println("Informe a cota��o de USD para BRL:");
			taxaUsdBrl = sist.nextDouble();
			System.out.println("Agora informe o valor em USD que ser� convertido para BRL:");
			valorUsd = sist.nextDouble();
			
			convParaReal = valorUsd * taxaUsdBrl;
			System.out.println("O valor da convers�o � R$:\n" + convParaReal + ", que equivale a USD: "+ valorUsd);
		
			
			System.out.println("\nDeseja continuar? (s) ou (n) ");
			continuar = sist.next();
			
		} while (continuar.equals("s"));
		
		System.out.println("Programa finalizado.");
		sist.close();
	}
}
