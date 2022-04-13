package exerciciosFinalDeSemana;

import java.util.Scanner;

/*06 - Escrever um Programa que vc informa o valor a ser gasto dentro de um supermercado, depois que leia valores dos 
produtos, o programa deve ir decrementando o valor saldo até não ter mais a possibilidade de compra, isso pode ser 
saindo do programa ou até não ter mais dinheiro suficiente para compra - mostrar o valor total e troco(resto do 
dinheiro), usar o While e outros operadores que achar necessario.
*/

public class Exercicio6SuperMercado {
	public static void main(String[] args) {
		Scanner sist = new Scanner (System.in);
		double saldo= 100;
		double valorProduto;
		
		while(saldo>0) {
			System.out.printf("Você tem %.2f para gastar no supermercado. Digite o valor do produto a ser comprado: ",saldo);
			valorProduto = sist.nextDouble();
			
			if (valorProduto<= saldo) {
				saldo+= - valorProduto;
				System.out.printf("Compra no valor de %.2f foi efetuada. Seu saldo agora é de %.2f.\n", valorProduto,saldo);
			} else {
				System.out.println("Saldo insuficiente, seu saldo é de: "+ saldo);				
			}
			
		}	if (saldo==0) {
			System.out.println("Seu dinheiro acabou!");
		}
		
		sist.close();
	}
}
