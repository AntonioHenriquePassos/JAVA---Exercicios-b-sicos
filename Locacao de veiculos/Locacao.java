package aula11Exercicio1;

import java.util.Scanner;

public class Locacao {
	Scanner sist = new Scanner (System.in);
	private int qtdVeic; //quantidade veiculos alugados
	private int qtdVeicTotal=0; 
	private Double valorTotal=0.0; // veiculos alugados valor total
	private int escolha;
	private String continuar;
	private int basico=0;
	private int intermediario=0;
	private int executivo=0;
	private int premium=0;
	
	
	public void alugarVeiculo(Cliente cliente) {
		do {
			qtdVeic=0;
			System.out.println("Por favor, escolha o número da opção desejada: ");
			System.out.println("1 – BASICO (R$ 100,00)\r\n"
					+ "2 – INTERMEDIARIO(R$ 200,00)\r\n"
					+ "3 – EXECUTIVO (R$ 500,00)\r\n"
					+ "4 - PREMIUM (R$ 1.000,00)");
			escolha = sist.nextInt();
			
			System.out.println("Quantos veículos serão alugados nessa modalidade? ");
			qtdVeic = sist.nextInt();
		
			
			switch (escolha) {
			
			case 1:
				valorTotal+= (qtdVeic * 100.0);
				basico++;
				qtdVeicTotal+= qtdVeic;
				break;
				
			case 2:
				valorTotal+= (qtdVeic * 200.0);
				intermediario++;
				qtdVeicTotal+= qtdVeic;
				break;


			case 3:
				valorTotal+= (qtdVeic * 500.0);
				executivo++;
				qtdVeicTotal+= qtdVeic;
				break;


			case 4:
				valorTotal+= (qtdVeic * 1000.0);
				premium++;
				qtdVeicTotal+= qtdVeic;
				break;

			default: 
				System.out.println("Valor digitado inválido.");
			
			}
			
			System.out.println("Deseja continuar alugando? (sim)/(não): ");
			continuar= sist.next();
			
		} while (continuar.equalsIgnoreCase("sim"));
		
		cliente.setValorTotal(valorTotal);
		cliente.setQtdVeicTotal(qtdVeicTotal);
	}
		
		public void mostraServicos(Cliente cliente) {
			String basic = (basico>0)?"Serviço Básico contratado: "+ basico +"\n": "";
			String Interm = (intermediario>0)?"Serviço intermediario contratado: "+ intermediario+"\n": "";
			String Execut = (executivo>0)?"Serviço executivo contratado: "+ executivo+"\n": "";
			String prem = (premium>0)?"Serviço premium contratado: "+ premium+"\n": "";
			cliente.setServicosContratados(	basic + Interm +Execut+ prem);
		



	} 
	
	

}
