package aula3;

import java.util.Scanner;

public class Exercicio2sobrenome {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String nome;
		String sobrenome;
		int rg;
		
		System.out.println("Digite o nome");
		nome = sc.next();
		System.out.println("Digite seu sobrenome");
		sobrenome= sc.next();
		System.out.println("Digite seu RG");
		rg= sc.nextInt();
		
		System.out.println("Bem-vindo "+ nome +" " + sobrenome);
		System.out.println("Você é portador do RG "+ rg);
		
		if(rg == 555) {
			System.out.println("Perfeito, boas compras");
		} else {
			System.out.println("Sinto muito, desconto não autorizado, mas pode ir às compras.");
			
		}
	}
}
		
		

