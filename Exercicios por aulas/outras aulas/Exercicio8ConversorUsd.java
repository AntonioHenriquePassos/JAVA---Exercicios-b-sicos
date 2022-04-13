package exerciciosFinalDeSemana;

import java.util.Scanner;

/* 08 - Elaborar um Programa que efetue a apresentação do valor da conversão em real (R$) de um valor lido em dólar 
(US$). O Programa deverá solicitar o valor da cotação do dólar e também a quantidade de dólares disponíveis com o 
usuário. Use o do-while
*/

public class Exercicio8ConversorUsd {
	public static void main(String[] args) {
		Scanner sist = new Scanner (System.in);
		double valorUsd;
		double convParaReal;
		double taxaUsdBrl;
		String continuar;
		
		
	
		do {
			
			System.out.println("Informe a cotação de USD para BRL:");
			taxaUsdBrl = sist.nextDouble();
			System.out.println("Agora informe o valor em USD que será convertido para BRL:");
			valorUsd = sist.nextDouble();
			
			convParaReal = valorUsd * taxaUsdBrl;
			System.out.println("O valor da conversão é R$:\n" + convParaReal + ", que equivale a USD: "+ valorUsd);
		
			
			System.out.println("\nDeseja continuar? (s) ou (n) ");
			continuar = sist.next();
			
		} while (continuar.equals("s"));
		
		System.out.println("Programa finalizado.");
		sist.close();
	}
}
