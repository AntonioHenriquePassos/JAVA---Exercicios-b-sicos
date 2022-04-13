package aula3;

import java.util.Scanner;

public class Exercicio4calculadora {
	public static void main(String[] args) {
		Scanner sist = new Scanner(System.in);
		int numero1;
		int numero2;
		String operador;
		
		System.out.println("Digite um número maior que 0: ");
		numero1 = sist.nextInt();
		System.out.println("Digite um operador (*, /, +, - : ");
		operador = sist.next();
		System.out.println("Digite o segundo número maior que 0 :");
		numero2 = sist.nextInt();
		
		switch (operador){
		
			case "+":
				System.out.printf(" %d +  %d é igual a %d",  numero1, numero2, numero1+numero2);
				break;
			case "-":
				System.out.printf(" %d -  %d é igual a %d",  numero1, numero2, numero1-numero2);
				break;
			case "/":
				System.out.printf(" %d /  %d é igual a %d",  numero1, numero2, numero1/numero2);
				break;
			case "*":
				System.out.printf(" %d *  %d é igual a %d",  numero1, numero2, numero1*numero2);
				break;	
			default:
				System.out.println("Operador inválido!");
				
					
			
		
		}
		
	}

}
