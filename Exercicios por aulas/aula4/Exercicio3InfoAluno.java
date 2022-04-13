package aula4;

import java.util.Scanner;

public class Exercicio3InfoAluno {
	public static void main(String[] args) {
		Scanner sist = new Scanner (System.in);
		String opcao = "s";
		String nome= "";
		int idade=0;
		int somaIdades=0;
		String maiorNome=""; // Nome do aluno com maior idade.
		int maiorIdade=0;
		int contadorAluno=0;
		double mediaIdades=0;
		
		while (opcao.equals("s") || opcao.equals("S") ) {
			System.out.println("Deseja cadastrar aluno? (s) ou (n) ");
			opcao = sist.next();
			
			
			if(opcao.equals("s") || opcao.equals("S")) {
				System.out.println("Informe o nome do aluno: ");
				nome = sist.next();
				System.out.println("Informe a idade do aluno: " );
				idade = sist.nextInt();	 
				contadorAluno ++;
				somaIdades += idade;
				mediaIdades = somaIdades / contadorAluno;
				
				if(idade > maiorIdade) {
					maiorIdade = idade;
					maiorNome = nome;
				}
				
			} else if (!((opcao.equals("s") || opcao.equals("S")) || (opcao.equals("n") || opcao.equals("N")))) {
				System.out.println("Você precisa informar uma opção válida.");
				opcao = "s";
			}
			
		}
		
		System.out.println("Programa finalizado.");
		
		if (!nome.equals("") && idade != 0 ) {
		System.out.println("***********************************");
		System.out.println("            Resultados");
		System.out.println("***********************************");
		System.out.printf("O nome do aluno(a) com maior idade é %s e tem %d anos.", maiorNome, maiorIdade);
		System.out.println("\nA soma de todas as idades digitadas é: "+ somaIdades);
		System.out.println("A média das idades informadas é: "+ mediaIdades);
		}
		
		
	}

}
