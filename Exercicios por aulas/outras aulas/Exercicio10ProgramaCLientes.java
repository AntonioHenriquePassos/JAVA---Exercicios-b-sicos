package exerciciosFinalDeSemana;

import java.util.Scanner;

/*10 - A Loja Quitanda do seu João mercado pequeno está vendendo seus produtos em até 5 (cinco) prestações sem 
juros. 
Faça um Programa que receba cadastros de clientes(codigo,nome, sobrenome, ), um valor de uma compra e escolha em 
até quantas prestações deve fazer e mostre o valor das prestações, exemplo o total deu 500,00 se o cliente solicitar 
fazer em 4 vezes o valor da prestação deve ser 125,00, se for em 5 vezes 105,00 (mais acrescimo de 5% do total da 
compra) se o funcionario quiser fazer em 6 vezes deve informar que a opção esta invalida, somente em até 5 vezes a 
compra deve ser parcelada.
No final pegar um cliente do array e mostrar o nome, sobrenome e o valor da parcela da compra realizada.
“Não usar orientação Objeto” pode ser( While, for, if-else,switch, array)
*/

//Cadastra 3 clientes e depois é possível solicitar dos dados de 1 deles.

public class Exercicio10ProgramaCLientes {
	public static void main(String[] args) {
		Scanner sist = new Scanner (System.in);
		String nome;
		String sobrenome;
		int codigo;
		String [] [] cliente = new String [3][4];
		String [] quesito = new String [4];
		quesito[0]= "nome";
		quesito[1]= "sobrenome";
		quesito[2]= "código";
		quesito[3]= "parcela R$";
		double valorCompra;
		int qtdeParcelas;
		double valorParcela;
		int escolhaCliente=0;
		
		
		for (int i = 0; i< 3; i++) {
			for (int j = 0; j<3; j++){
				System.out.println("\n**************************************************************");
				System.out.printf("\nPor favor, informe o %s:", quesito[j]);
				cliente [i][j]= sist.next();
			}
		
			for(int h=3; h<4; h++) {
				System.out.println("\nInforme o valor da compra: ");
				valorCompra = sist.nextDouble();
				System.out.println("Compra em quantas vezes? (até 5x, optando por 5x há acrescimo de 5%).");
				qtdeParcelas = sist.nextInt();
				
				if (qtdeParcelas ==1) {
					String value1 = valorCompra + "";
					cliente [i][h]= value1;	
					System.out.printf("A compra foi de %s", value1);
					
				} else if (qtdeParcelas ==2) {
					valorParcela = valorCompra/2;
					String value2 = valorParcela + "";
					cliente [i][h]= value2;	
					System.out.printf("O valor da compra foi de %.2f, e o da parcela ficou %s. \n", valorCompra, value2 );
					
				} else if (qtdeParcelas ==3) {
					valorParcela = valorCompra/3;
					String value3 = valorParcela + "";
					cliente [i][h]= value3;	
					System.out.printf("O valor da compra foi de %.2f, e o da parcela ficou %s. ", valorCompra, value3 );

					
				} else if (qtdeParcelas ==4) {
					valorParcela = valorCompra/4;
					String value4 = valorParcela + "";
					cliente [i][h]= value4;	
					System.out.printf("O valor da compra foi de %.2f, e o da parcela ficou %s. ", valorCompra, value4 );

					
				} else if (qtdeParcelas ==5) {
					valorCompra = (valorCompra*0.05) + valorCompra;
					valorParcela = valorCompra/5;
					String value5 = valorParcela + "";
					cliente [i][h]= value5;	
					System.out.printf("O valor da compra foi de %.2f, e o da parcela ficou %s. ", valorCompra, value5 );

				} else {
					System.out.println("Parcelamento inválido!");
				}
				
				h=4;
			}
		}
		System.out.println("\n**********************************************************");
		System.out.println("\nEscolha um cliente de 1 a 3 para ver suas informações: \n");
		escolhaCliente = sist.nextInt();
		escolhaCliente +=-1;
		
		for (int i = escolhaCliente; i == escolhaCliente; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.println(quesito[j] +": " + cliente[escolhaCliente] [j]+ " ");
			}
		}
		
		sist.close();
	}

}
