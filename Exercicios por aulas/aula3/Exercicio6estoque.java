package aula3;

import java.util.Scanner;

public class Exercicio6estoque {
	public static void main(String[] args) {
		Scanner sist = new Scanner (System.in);
		int qdeAtual;
		int qdeMaxima;
		int qdeMinima;
		
		System.out.println("Digite a quantidade atual do protudo no estoque: ");
		qdeAtual = sist.nextInt();
		System.out.println("Digite a quantidade m�xima do protudo no estoque: ");
		qdeMaxima = sist.nextInt();
		System.out.println("Digite a quantidade M�nima do protudo no estoque: ");
		qdeMinima = sist.nextInt();
		
		int qdeMedia =  (qdeMaxima + qdeMinima) / 2;
		System.out.println("A quantidade m�dia desse produto �: " + qdeMedia );
		
		if (qdeAtual>= qdeMedia) {
			System.out.println("N�o efetuar compra.");
		} else {
			System.out.println("Por favor, efetue compra.");
		}
		
	}
}
