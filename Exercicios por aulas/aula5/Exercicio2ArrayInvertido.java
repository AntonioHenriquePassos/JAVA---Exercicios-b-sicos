package aula5;
/* 2- CRIAR UM ARRAY DE INTEIRO QUE O USUARIO INFORMA O 
TAMANHO E INSERE VALOR NELE, AO FINAL MOSTRAR O VALOR 
INVERTIDO
EX:
VETOR DE 4 POSICOES: 5,4,7,2 
VETOR COM 4 POSIÇÕES INVERTIDO: 2,7,4,5
*/

import java.util.Scanner;

public class Exercicio2ArrayInvertido {
	public static void main(String[] args) {
		Scanner sist = new Scanner(System.in);
		int numero=0;
		while(numero==0) {
		System.out.println("Digite quantas posições teremos no array:");
		numero = sist.nextInt();
		}
		
		int [] valores = new int [numero];
		
		for (int i = 0; i< valores.length; i++) {
			System.out.printf("Digite o valor %d: ", i+1);
			valores[i] = sist.nextInt();
		}
		
		System.out.println("valores invertidos: ");
		for (int j=valores.length-1; j>=0; j--) {
	
			System.out.println(valores[j]);
		}
			
	}

}
