package aula5;

import java.util.Scanner;

/* 1- CADASTRAR ALUNO ENQUANTO “S” ou “s”
SOLICITAR O NOME DO ALUNO E CRIAR UM ARRAY DE REAL QUE O 
USUARIO INFORME 4 NOTAS E ARMAZENE NO ARRAY , AO FINAL DEVE 
DIVIDIR O VALOR TOTAL DO ARRAY POR 4 PARA ENCONTRAR A MEDIA E 
INFORMAR O NOME E MEDIA DO ALUNO */


public class Exercicio1ArrayAluno {
	public static void main(String[] args) {
		String cadastrar = "s";
		Scanner sist = new Scanner (System.in);
		int qtdeNotas = 4; 
		double [] notas = new double [qtdeNotas];
		String nome= "";
		double somaNotas = 0;
		double media = 0;
		
			do {
							
				somaNotas = 0;
				System.out.println("Digite o nome do aluno: ");
				nome = sist.next();
				 for (int j = 0; j < notas.length; j++) {
				 	System.out.printf("Digite a nota %d: \n", j+1);
				 	notas[j] = sist.nextDouble();
				 	somaNotas += notas[j];
				 	media = somaNotas / qtdeNotas;
				 	
				 }
				 
				 System.out.println("******************************************");
				 System.out.printf(" Aluno (a) %s, tem média %.2f.\n", nome,media);
				 System.out.println("******************************************");
				 System.out.println("Deseja cadastrar novo aluno?: (s) ou (n)");
				 cadastrar = sist.next();
								
					 
		
				
	} 	while (cadastrar.equals("S") || cadastrar.equals("s") )	;
			System.out.println("Programa finalizado.");
}	
}