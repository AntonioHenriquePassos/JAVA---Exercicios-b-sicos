package aula13Exercicio2;

import java.util.Scanner;

public class RodarProgramaLivro {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int escolha;
		

		System.out.println("BEM-VINDO(A) A SUA BIBLIOTECA");
		System.out.println();
		do {
			Livro livro = new Livro();
			Servicos.exibeMenu();
			escolha=sc.nextInt();
			
			while (escolha!=1 && escolha!=2 && escolha!=0) {
				System.out.println("Opção inválida, tente novamente.");
				Servicos.exibeMenu();
				escolha=sc.nextInt();
			}
			
			switch (escolha) {
			
			case 1:
				Servicos.cadastrarLivro(livro);
				break;		
			case 2:
				Servicos.pesquisarLivro(livro.getBiblioteca());
				break;
			}
			
			
		} while (escolha!=0);
		
		System.out.println("Programa finalizado.");
		sc.close();


	}

}
