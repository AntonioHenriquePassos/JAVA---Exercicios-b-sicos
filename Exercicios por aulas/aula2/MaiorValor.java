package aula2;

import java.util.Scanner;

public class MaiorValor {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numero1;
		int numero2;
		
		System.out.println("Entre com o primeiro n�mero: ");
		numero1 = sc.nextInt();
		
		System.out.println("Entre com o segundo n�mero");
		numero2 = sc.nextInt();
		
		if (numero1 > numero2) {
			System.out.println("VERDADEIRO");
		} else {
			System.out.println("FALSO");
		}
		
	}

}
