package aula5;

import java.util.Scanner;

/*		4 - CRIAR UM ARRAY DE INTEIROS QUE O USUARIO INFORMA O 
TAMANHO E INSERE VALOR NELE, AO FINAL MOSTRAR O VALORES E O 
MENOR VALOR NO ARRAY E SOMA DO TOTAL:
EX:
TAMANHO DO VETOR: 4
VALORES DO ARRAY: 8,3,9,5 
MENOR NUMERO É: 3, INDICE 1 DO ARRAY
SOMA TOTAL DO VETOR: 25
*/

public class Exercicio4ArraysInfo {

	public static void main(String[] args) {
		Scanner sist = new Scanner(System.in);
		int numero=0;
		int menorNumero=0;
		int menorIndice=0;
		int soma=0;
		
		while(numero==0) {
		System.out.println("Digite quantas posições teremos no array:");
		numero = sist.nextInt();
		}
		
		int [] valores = new int [numero];
		
		for (int i = 0; i< valores.length; i++) {
			System.out.printf("Digite o valor %d: ", i+1);
			valores[i] = sist.nextInt();
			soma+= valores[i];
			
			
			if (valores[i] < menorNumero || menorNumero ==0) {
				menorNumero = valores[i];
				menorIndice = i;
			}
		
		}
		System.out.println("O tamanho do vetor é: "+ numero);
		
		System.out.print("Valores do Array: ");
		for (int j=0; j<valores.length; j++) {
			System.out.print(valores[j]+" ");
		}
		
		System.out.printf("\nO menor número é %d, e seu índice é o %d.\n", menorNumero, menorIndice );
		System.out.println("A soma total do vetor é: " + soma);
			
	}
}
