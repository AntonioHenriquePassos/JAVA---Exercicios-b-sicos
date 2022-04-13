package aula5;

import java.util.Scanner;

/*5 - CRIAR UM PROGRAMA JAVA QUE LEIA UMA MATRIZES 3X3. EM
SEGUIDA, EXIBA A SOMA DOS ELEMENTOS DE CADA UMA
DAS LINHAS. EX:
|2,3,5| | 10
|4,6,6| | 16 
|3,4,2| | 9

*/

public class Exercicio5LerMatriz {
	public static void main(String[] args) {
		Scanner sist = new Scanner(System.in);
		int [][] matriz = new int [3][3];
		int soma = 0;
		for (int i = 0; i< matriz.length; i++) {
			System.out.println("Rodada "+ (i+1));
			for(int j= 0; j< matriz.length; j++) {
				System.out.println("\nDigite um número:");
				matriz[i] [j] = sist.nextInt();
			}
			
		}
		System.out.println("***************************");
		System.out.println("Resultados: ");
		for(int k=0; k < matriz.length; k++){
			soma = 0;
			for(int l=0; l< matriz.length; l++) {
			System.out.print(matriz[k] [l] +" ");
			soma += matriz[k] [l];
			} 
			System.out.print(" | "+ soma + "\n");
		}	
			 
			
		
	}
}
