package aula3;

import java.util.Scanner;

public class Exercicio1Habilitacao {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String nome;
		int idade;
		String habilitado;
		
		System.out.println("Digite o nome");
		nome = sc.next();
		System.out.println("Digite sua idade");
		idade= sc.nextInt();
		sc.nextLine();
		System.out.println("Se for Habilitado digite sim, se n�o for, digite n�o");
		habilitado= sc.next();
		
		if (idade>=18 && habilitado.equals("sim")) {
			System.out.println("Libera��o realizada para "+ nome);
			
		} else {
			System.out.println(nome + " n�o atende a todos os requisitos obrigat�rios.");
		}
		
		
	}
}
