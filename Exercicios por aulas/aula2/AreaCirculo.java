package aula2;

import java.util.Scanner;

public class AreaCirculo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double raio;
		final double PI = 3.14159;
		
		System.out.println("Digite o raio: ");
		raio = sc.nextDouble();
		double area = PI *(raio*2);
		System.out.println("O valor da área é: " + area);
		
		
		
	}

}
