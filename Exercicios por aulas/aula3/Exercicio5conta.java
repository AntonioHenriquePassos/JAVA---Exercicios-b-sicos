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
		System.out.println("Digite o valor do Débito: ");
		debito = sist.nextDouble();
		if (saldo < debito ) {
			System.out.println("Você não tem saldo suficiente.");
		} else {
			saldo+= - debito;
			System.out.println("Operação realizada com sucesso!");
		}
		System.out.println("Digite o valor do Crédito: ");
		credito = sist.nextDouble();
		
		
		double saldoAtual = saldo + credito;
		
		System.out.println("Seu saldo atual é: "+ saldoAtual);
		if ((double) saldoAtual >=0 ) {
			System.out.println("Conta: " + conta + ", está com saldo positivo.");
		} else {
			System.out.println("Conta: " + conta + ", está com saldo negativo.");
		}
		
		
		
	}

}
