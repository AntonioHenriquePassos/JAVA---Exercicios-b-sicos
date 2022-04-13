package aula13Exercicio1;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class Servicos {
	private static Double valorFinal=0.0;

	
	public static void ImprimeClientePorId(List<Cliente> lista, Integer id) {
		
		for(Cliente cliente:lista) {
			if (cliente.getId()==id) {
				System.out.println("----------------------------------------------------------------");
				System.out.println("Dados do Cliente: \n"+"Nome:"+cliente.getNome()+"\n"+"Idade"+
			cliente.getIdade()+"\n"+ "ID: "+ cliente.getId());
				System.out.println("----------------------------------------------------------------");
				System.out.println("Detalhamento das operações: ");
				for(Escolha escolha:cliente.carros) {
					valorFinal+=escolha.getValorTotal();
					System.out.println("----------------------------------------------------------------");
					System.out.println(escolha);
					
				}
				System.out.println("----------------------------------------------------------------");
				System.out.println("Valor total a ser pago: "+ valorFinal);
				valorFinal=0.0;
			} 
		}
		
		
	}
	public static void ImprimeTabela() {
		System.out.println("----------------------------------------------------------------");
		System.out.println("                   Tabela de aluguel:"                           );
		System.out.println("----------------------------------------------------------------");

		System.out.println("COD.B - CATEGORIA BÁSICO\r\n"
				+ "COD.1 - Fiat Uno – Modelo way – motor 1.0 – cor preto – 130, 00\r\n"
				+ "COD.2 - VW Gol – Modelo G3 – motor 1.0 – cor branco – 150,00\r\n"+"\n"
				+ "COD.I - CATEGORIA INTERMEDIÁRIO\r\n"
				+ "COD.3 - Jeep Renagade – Modelo std AT – motor 1.8 - 350,00\r\n"
				+ "COD.4 - Renault Duster – Modelo Dynamique – motor 1.6 - 350,00\r\n"+"\n"
				+ "COD.E - CATEGORIA EXECUTIVO\r\n"
				+ "COD.5 - Toyota Hilux – Modelo SW4 – motor 3.0 – 1500,00\r\n"
				+ "COD.6 - GM TrailBlazer – Modelo LTZ – motor 3.0 – 1800,00\r\n"+"\n"
				+ "COD.P - CATEGORIA PREMIUM\r\n"
				+ "COD.7 - Porche Cayenne – Modelo turbo GT – motor 4.0 – 3500,00\r\n"
				+ "COD.8 - Ford Mustang - Modelo Mach 1 – motor 5.0 – 4000,00");
		System.out.println("----------------------------------------------------------------");
	}

	

}
