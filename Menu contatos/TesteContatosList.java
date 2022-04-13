package aula11Exercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteContatosList {

	public static void main(String[] args) {
		int escolha;
		Scanner sist = new Scanner(System.in);
		List <Contato> contatos = new ArrayList<>();
		ContatoRepositorio contato_repositorio = new ContatoRepositorio();
		String continuar="";
		
		do {
			System.out.println("*************************************************************");
			System.out.println("Comandos do programa: ");
			System.out.println("1 - Cadastrar contato.\n2 - Remover contato por ID\n3 - Imprimir contato"
					+ "por ID\n4 - Imprimir todos os contatos sem o ID\n5 - Imprimir o nome de "
					+ " todos os contatos, sem duplicidade.");
			
			escolha = sist.nextInt();
			switch (escolha) {
			
				case 1:
					contato_repositorio.armazenaContato(contatos);
					break;
				case 2:
					System.out.println("*************************************************************");
					System.out.println("Digite o nome e ID do contato que será removido:");
					
					contato_repositorio.removeContatoPorId(contatos, sist.next(), sist.nextInt());
					break;
				case 3:
					System.out.println("*************************************************************");
					System.out.println("Digite o ID do contato que será impresso:");
					contato_repositorio.imprimeContatoPorId(contatos, sist.nextInt());
					break;
				case 4:
					
					contato_repositorio.imprimeTodosContatosMenosId(contatos);
					break;
				case 5:
					contato_repositorio.imprimeTodosContatosSduplicidade(contatos);
					break;
				default:
					System.out.println("Opção inválida.");
					System.out.println("*************************************************************");
					System.out.println("                   Comandos do programa: ");
					System.out.println("*************************************************************");
					System.out.println("1 - Cadastrar contato.\n2 - Remover contato por ID\n3 - Imprimir contato"
							+ "por ID\n4 - Imprimir todos os contatos sem o ID\n5 - Imprimir o nome de "
							+ " todos os contatos, sem duplicidade.");
					
					escolha = sist.nextInt();
					}
					System.out.println("*************************************************************");
					System.out.println("Deseja continuar? (sim) / (não): ");
					continuar = sist.next();
					
					
		} while (continuar.equalsIgnoreCase("sim"));	
		

	}

}
