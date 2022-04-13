package aula5;

/*6 - CRIAR UM PROGRAMA JAVA QUE LEIA UMA MATRIZ. EM
SEGUIDA, EXIBA O NOME COMPLETO TROCANDO A SEGUNDA COLUNA 
PELA TERCEIRA COLUNA.
DAS LINHAS. EX */

import java.util.Scanner;

public class Exercicio5MatrizTroca {
	public static void main(String[] args) {
		Scanner sist = new Scanner (System.in);
		String [][] nomes = new String [3][3];
		String [][] troca = new String [3][3];
		
		for(int i=0; i<nomes.length; i++) {
			System.out.println("********************************");
			System.out.println("Linha"+ (i+1));
			for(int j=0; j<nomes.length; j++) {
				System.out.println("Digite um nome: ");
				nomes [i][j]= sist.next();
				troca [i][j]= nomes [i][j];
			}
		} 
		System.out.println("Nomes na ordem digitada: \n");
		for(int o=0; o<nomes.length; o++) {
			System.out.println("| ");
			for(int p=0; p<nomes.length; p++) {
				System.out.print(nomes[o][p]+ " ");
				
			}
		}
		
		for(int k=0; k<nomes.length; k++) {
			for(int m=1; m <nomes.length-1; m ++) {
				troca [k][m]= nomes [k] [m+1];//recebeu o nome 3
				nomes[k][m+1] = nomes[k][m];
				nomes [k][m] = troca [k][m];		
			}
				
			
		}
		System.out.println("");
		System.out.println("\n*****************************");
		System.out.println("Nomes invertidos:");
		for(int o=0; o<nomes.length; o++) {
			System.out.println("| ");
			for(int p=0; p<nomes.length; p++) {
				System.out.print(nomes[o][p]+ " ");
				
			}
	}
	}
}
