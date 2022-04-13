package aula11Exercicio1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class ProgramaLocacaVeiculos {
	public static void main(String[] args) {
		Scanner sist = new Scanner (System.in);
		String continuar;
		
		Set<Cliente> cliente = new HashSet<Cliente>();
		
		do { 
			
			Cliente cliente1 = new Cliente();
			Locacao locacao1 = new Locacao();
			cliente1.cadastrarCliente();
			locacao1.alugarVeiculo(cliente1);
			locacao1.mostraServicos(cliente1);
			cliente.add(cliente1);
			
			System.out.println("Deseja cadastrar outro cliente? (sim)/(não)");
			continuar = sist.next();
			
			
		} while (continuar.equalsIgnoreCase("sim"));
		
		Iterator<Cliente> ar = cliente.iterator();
		while (ar.hasNext()) {
			Object element = ar.next();
			System.out.println(element + " ");
		}
				
	

		
	}
	
}
