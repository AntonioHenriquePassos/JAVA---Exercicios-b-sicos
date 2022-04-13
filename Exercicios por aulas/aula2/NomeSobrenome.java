package aula2;

import java.util.Scanner;

public class NomeSobrenome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nome;
		String sobrenome;
		
		System.out.println("Digite seu nome e sobrenome: ");
		nome = sc.nextLine();
		
		System.out.println("Digite seu sobrenome: ");
		sobrenome = sc.next();
		
		System.out.println("Bem-vindo, "+ nome + " " + sobrenome + "!!");
		
		
	}

}
