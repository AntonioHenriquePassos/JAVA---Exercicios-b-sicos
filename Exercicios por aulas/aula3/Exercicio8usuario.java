package aula3;

import java.util.Scanner;

public class exercicio8usuario {
	public static void main(String[] args) {
		Scanner sist = new Scanner (System.in);
		int login = 1234;
		int senha = 9999;
		int loginDigitado;
		int senhaDigitada;
		
		System.out.println("Digite seu login: ");
		loginDigitado = sist.nextInt();
		if (loginDigitado != login) {
			System.out.println("Usuário Inválido!");
			
		} else {
			System.out.println("Digite sua senha: ");
			senhaDigitada = sist.nextInt();
			if (senhaDigitada != senha) {
				System.out.println("Senha inválida!");
			} else {
				System.out.println("Acesso permitido.");
			}
		}
	}	

}
