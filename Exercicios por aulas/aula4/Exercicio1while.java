package aula4;

import java.util.Scanner;

public class Exercicio1while {
	public static void main(String[] args) {
		Scanner sist = new Scanner (System.in);
		int numero;
		System.out.println("Digite um número: ");
		numero = sist.nextInt();
		int soma = 0;
		
		while (numero != 0) {
			soma = soma + numero;
			System.out.printf("o número digitado foi %d, e o total digitado é %d ", numero, soma );
			System.out.println(" \nDigite um número: ");
			numero = sist.nextInt();
		}
			
		
	}


}
