package exerciciosFinalDeSemana;

import java.util.Scanner;

/*05 - Escrever um Programa que leia 10 alunos nome e matricula do aluno e as notas das 4 provas que ele obteve no 
semestre. No final informar matricula,o nome do aluno da media (PASSOU, REPROVADO) mais alta e matricula,o nome 
do aluno da media (PASSOU, REPROVADO) mais baixa da lista cadastrada.Calculo da média (aritmética) e informar se ele 
passou(media >=7), ficou de recuperação(media >=4 ou < 7) ou reprovou (media < 4), 
*/

public class Exercicio5Aluno {
	public static void main(String[] args) {
		Scanner sist = new Scanner (System.in);
		String nome="";
		int matricula=0;
		double [] nota = new double [4];
		int contador=1;
		double somaNotas=0;
		double mediaNotas=0;
		String nomeMaiorMedia="";
		int matMaiorMedia=0;
		double maiorMedia = 0;
		String nomeMenorMedia="";
		int matMenorMedia=0;
		double menorMedia = 0;
		String status="";
		String maiorStatus="";
		String menorStatus="";
		
		while (contador <=10) {
			
			somaNotas = 0;
			mediaNotas = 0;
			
			System.out.printf("\nDigite o nome do aluno %d: " , contador);
			nome = sist.next();
			System.out.println("Digite a matricula: ");
			matricula= sist.nextInt();
			for(int i = 0; i<4; i++) {
				
				System.out.printf("Digite a nota %d do aluno: ", i + 1);
				nota[i] = sist.nextDouble();
				somaNotas = somaNotas + nota[i];

			}
			
			mediaNotas = somaNotas/4;
			
			if (mediaNotas>=7) {
				status = "aprovado!";
			} else if( mediaNotas >=4 && mediaNotas<7) {
				status = "de recuperação";
				
			} else {
				status = "reprovado";
			}
			
			if ( mediaNotas > maiorMedia) {
				maiorMedia = mediaNotas;
				nomeMaiorMedia = nome;
				matMaiorMedia = matricula;
				maiorStatus = status;
			}
			
			if ( mediaNotas < menorMedia || menorMedia == 0) {
				menorMedia = mediaNotas;
				nomeMenorMedia = nome;
				matMenorMedia = matricula;
				menorStatus = status;
			}

			contador ++;
		}
		

		System.out.printf("O aluno %s, matrícula %d,  teve a maior média: %.2f e está %s.\n", nomeMaiorMedia,
				matMaiorMedia, maiorMedia, maiorStatus);
		
		System.out.printf("O aluno %s, matrícula %d,  teve a menor média: %.2f e está %s.", nomeMenorMedia,
				matMenorMedia, menorMedia, menorStatus);
	}

}
