package aula3;

import java.util.Scanner;

public class exercicio9aposentadoria {
	public static void main(String[] args) {
		Scanner sist = new Scanner(System.in);
		String genero;
		int idade;
		int tempoTrabalhado;
		
		System.out.println("Digite seu g�nero (M) ou (F): ");
		genero = sist.next();
		System.out.println("Digite sua idade: ");
		idade = sist.nextInt();
		System.out.println("Digite o tempo trabalhado: ");
		tempoTrabalhado = sist.nextInt();
		
		
		if(genero.equals("M") && idade >=65 && tempoTrabalhado >=30 ) {
			System.out.println("Voc� est� apto a aposentar-se.");
		
		} else if (genero.equals("M")) {
			System.out.println("Voc� n�o est� apto a aposentar-se.");
		}	
		
		if(genero.equals("F") && idade >=60 && tempoTrabalhado >=25 ) {
			System.out.println("Voc� est� apta a aposentar-se.");
		
		} else if (genero.equals("F")){
			System.out.println("Voc� n�o est� apto a aposentar-se.");
		}
	}
}
