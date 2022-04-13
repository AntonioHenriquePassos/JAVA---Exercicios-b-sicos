package exerciciosFinalDeSemana;

import java.util.Scanner;

/* 07 - Ler uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. A fórmula de conversão é: 
F=(9*C+160) / 5, sendo F a temperatura em Fahrenheit e C a temperatura em Celsius. Use o While para o Exercicio
*/

public class Exercicio7Fahrenheit {
	public static void main(String[] args) {
		Scanner sist = new Scanner (System.in);
		String converter = "s";
		double celsius;
		double convFahrenheit;
		
		while (converter.equals("s")) {
			System.out.println("Digite a temperatura em Celsius que será convertida para Fahrenheit: ");
			celsius = sist.nextDouble();
			
			convFahrenheit = ((9*celsius+160)/5);
			
			System.out.printf("A temperatura celsius informada correnponde a %.2f Fahrenheit.\n\n", convFahrenheit);
			System.out.println("Deseja continuar convertendo? ");
			converter = sist.next();
			
					
		}
		System.out.println("Programa finalizado.");
		sist.close();
	}

}
