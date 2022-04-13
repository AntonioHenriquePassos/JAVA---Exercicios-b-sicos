package aula5;
/*3 - CRIAR UM ARRAY DE INTEIRO QUE O USUARIO INFORMA O 
TAMANHO E INSERE VALOR NELE, AO FINAL MOSTRAR O VALOR EM 
DOBRO DA POSIÇÃO
EX:
VETOR DE 4 POSICOES: 4,3,6,10 
VETOR COM 4 POSIÇÕES EM DOBRO: 8,6,12,20 */

import java.util.Scanner;

public class Exercicio3ArrayDobro {
	
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
		System.out.println("valores dobrados: ");
		for (int j=0; j<valores.length; j++) {
			System.out.println(valores[j]*2);
		}
			
	}


}
