package aula3;

import java.util.Scanner;

public class Exercicio5conta {
	public static void main(String[] args) {
		Scanner sist = new Scanner (System.in);
		int conta;
		double saldo = 100.0;
		double debito;
		double credito;
		
		
		
		System.out.println("Digite sua conta: ");
		conta = sist.nextInt();
		System.out.println("Digite o valor do D�bito: ");
		debito = sist.nextDouble();
		if (saldo < debito ) {
			System.out.println("Voc� n�o tem saldo suficiente.");
		} else {
			saldo+= - debito;
			System.out.println("Opera��o realizada com sucesso!");
		}
		System.out.println("Digite o valor do Cr�dito: ");
		credito = sist.nextDouble();
		
		
		double saldoAtual = saldo + credito;
		
		System.out.println("Seu saldo atual �: "+ saldoAtual);
		if ((double) saldoAtual >=0 ) {
			System.out.println("Conta: " + conta + ", est� com saldo positivo.");
		} else {
			System.out.println("Conta: " + conta + ", est� com saldo negativo.");
		}
		
		
		
	}

}
