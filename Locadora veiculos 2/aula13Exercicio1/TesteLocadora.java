package aula13Exercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteLocadora {

	public static void main(String[] args) {
		Scanner sist = new Scanner (System.in);
		List <Cliente> clientes = new ArrayList<>();
		String continuarCadCliente;
		String continuarAddCarro;
		String procClientId;
		
		System.out.println("Por favor, cadastre um cliente para alugar carros.");

		do {
			Cliente cliente1 = new Cliente();
			cliente1.cadastrarCliente();
			
			do {
				Escolha escolha1 = new Escolha();
				Servicos.ImprimeTabela();
				escolha1.adicionaCarro();
				cliente1.carros.add(escolha1);
				System.out.println("------------------------------------------------");
				System.out.println("Deseja continuar alugando carros?");
				continuarAddCarro = sist.next();
				
			} while (continuarAddCarro.equalsIgnoreCase("sim"));
			System.out.println("------------------------------------------------");
			System.out.println("Deseja continuar cadastrando clientes? ");
			continuarCadCliente = sist.next();
				
			clientes.add(cliente1);
			
		} while (continuarCadCliente.equalsIgnoreCase("sim"));
		
		System.out.println("------------------------------------------------");
		System.out.println("Deseja procurar um cliente por ID? ");
		procClientId = sist.next();
		if (procClientId.equalsIgnoreCase("sim")) {
			System.out.println("------------------------------------------------");
			System.out.println("Por favor, digite o ID.");
			Servicos.ImprimeClientePorId(clientes, sist.nextInt());
		}
		
		sist.close();
	}
}
	


