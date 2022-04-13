package aula4;

import java.util.Scanner;

public class Exercicio2AlunoComFor {
	public static void main(String[] args) {
		Scanner sist = new Scanner (System.in);
		String nome;
		double nota;
		System.out.println("Digite o nome do aluno: ");
		nome = sist.next();
		double containerNotas=0;
		double mediaNotas=0;
		
		for (int i = 1 ; i < 3; i++) {
			System.out.println("Digite a nota "+ i);
			nota = sist.nextInt();
			containerNotas += + nota;
		}
		mediaNotas = containerNotas/2;
		System.out.printf("A média de notas de %s é %.2f \n",nome,mediaNotas);
		
		if (mediaNotas >=7) {
			System.out.println("Estudante passou!");
		} else if(mediaNotas >=4 && mediaNotas < 7) {
			System.out.println("Estudante está de recuperação.");
		} else {
			System.out.println("Estudante está reprovado.");
		}
		
	
	}
	

}
