package exerciciosFinalDeSemana;

import java.util.Scanner;

/* 04 - Escrever um Programa que leia o nome de um vendedor, o seu sal�rio fixo e o total de vendas efetuadas por ele no 
m�s (em dinheiro). Sabendo que este vendedor ganha 15% de comiss�o sobre suas vendas efetuadas, informar o seu 
nome, o sal�rio fixo e sal�rio no final do m�s
*/

public class Exercicio4VendedorSalario {
	public static void main(String[] args) {
		Scanner sist = new Scanner (System.in);
		String nomeVendedor;
		double salarioFixo;
		int vendasEfetuadasMes;
		double comissao=0.15;
		
		
		System.out.println("Digite o nome do vendedor: ");
		nomeVendedor = sist.next();
		System.out.println("Digite o sal�rio fixo do vendedor: ");
		salarioFixo = sist.nextDouble();
		System.out.println("Digite o total de vendas mensal do vendedor: ");
		vendasEfetuadasMes = sist.nextInt();
		
		double comissaoVendas=vendasEfetuadasMes * comissao;
		double salarioTotal=salarioFixo + vendasEfetuadasMes+ comissaoVendas;
		
		System.out.printf("O vendedor %s, de sal�rio fixo %.2f, ir� receber um sal�rio total (incluindo as comiss�es por vendas)\nno"
				+ " valor de %.2f. ", nomeVendedor, salarioFixo, salarioTotal);
		
		
		sist.close();
		
		
		
	}
	

}
