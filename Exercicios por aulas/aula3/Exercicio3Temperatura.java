package aula3;

import java.util.Scanner;

public class Exercicio3Temperatura {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String regiao;
		int temperatura;
		
		System.out.println("Digite uma região (Sul, Sudeste, Norte, Nordeste e Centro-Oeste).");
		regiao = sc.next();
		System.out.println("Digite uma temperatura:");
		temperatura= sc.nextInt();
		
		if ((temperatura >= 0) && (temperatura <= 15)) {
			System.out.println("Muito frio na região "+ regiao);
		} else if ((temperatura > 15) && (temperatura <=20)){
			System.out.println("Frio moderado na região "+ regiao);
		} else if ((temperatura >20) && (temperatura <= 25)){
			System.out.println("Clima moderado na região" + regiao);
		} else if ((temperatura > 25) && (temperatura <=35)) {
			System.out.println("Clima quente na região" + regiao);
		} else {
			System.out.println("CLima muito quente na % "+ regiao);
		}
	}
	
	
}
