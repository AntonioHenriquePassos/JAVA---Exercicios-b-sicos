package aula3;

import java.util.Scanner;

public class exercicio7posto {
	public static void main(String[] args) {
		Scanner sist = new Scanner (System.in);
			double pGasolina = 6.18; // preço gasolina
			double pAlcool = 5.34; // preço alcool
			int qdeLitros;
			String combustivel;
			double valor = 0;
			double desconto = 0;
			double valorTotal = 0;
			
			
			
			System.out.println("Irá abastecer (G) Gasolina ou (A) Alcool?");
			combustivel = sist.next();
			System.out.println("Quantos litros?");
			qdeLitros = sist.nextInt();
		
			if (combustivel.equals("G")) {
				if (qdeLitros <= 20) {
					valor = qdeLitros * pGasolina;
					desconto = valor * 0.026;
					valorTotal =  valor - desconto;
					System.out.printf("São %s litros de %s, total de R$%.2f ", qdeLitros, "Gasolina", valorTotal );
					
					
				} else if (qdeLitros > 20) {
					valor = qdeLitros * pGasolina;
					desconto = valor * 0.0425;
					valorTotal =  valor - desconto;
					System.out.printf("São %s litros de %s, total de R$%.2f ", qdeLitros, "Gasolina", valorTotal );
					
				}
			}
			
			if (combustivel.equals("A")) {
				if (qdeLitros <= 20) {
					valor = qdeLitros * pAlcool;
					desconto = valor * 0.03;
					valorTotal =  valor - desconto;
					System.out.printf("São %s litros de %s, total deR$%.2f ", qdeLitros, "Alcool", valorTotal );
				
			} else if (qdeLitros > 20) {
				valor = qdeLitros * pAlcool;
				desconto = valor * 0.05;
				valorTotal =  valor - desconto;
				System.out.printf("São %s litros de %s, total de R$%.2f ", qdeLitros, "Alcool", valorTotal );
				
			}
			
		}
	}

}
