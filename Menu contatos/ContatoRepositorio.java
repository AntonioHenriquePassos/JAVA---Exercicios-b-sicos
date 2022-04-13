package aula11Exercicio2;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ContatoRepositorio implements Repositorio{
	String verificador="";
	

	@Override
	public void armazenaContato(List<Contato> contatos) {
		Contato contato = new Contato();
		contato.cadastrarContato();
		contatos.add(contato);
		System.out.println("ID: " + contato.getId());
		System.out.println("Contato cadastrado com sucesso!");
	}

	@Override
	public void removeContatoPorId(List<Contato> contatos, String nome, Integer id) {

		for (Contato contato: contatos) {
			
			if (contato.getId()==id && contato.getNome().equalsIgnoreCase(nome)) {
				contatos.remove(contato);
				System.out.println("Contato removido com sucesso!");
				verificador="ok";
				break;
		

			} else if ((contato.getId()==id) && (!contato.getNome().equalsIgnoreCase(nome))) {
				System.out.println("Nome informado não bate com nome vinculado ao ID.");
				verificador ="ok";
				break;
			} 
			
			
		} if (!verificador.equalsIgnoreCase("ok")) {
			System.out.println("ID não encontrado.");
		}
		 
		verificador ="";
	}

	@Override
	public void imprimeContatoPorId(List<Contato> contatos, Integer id) {
		for (Contato contato: contatos) {
			if (contato.getId()==id) {
				System.out.println(contato);
				verificador ="ok";
				break;
				
			} 
			
		}
		if (!verificador.equalsIgnoreCase("ok")) {
			System.out.println("ID não encontrado.");
		}
	}

	@Override
	public void imprimeTodosContatosMenosId(List<Contato> contatos) {
		for (Contato contato:contatos) {
			System.out.println(contato.retornarSemId());
		}
		
	}

	@Override
	public void imprimeTodosContatosSduplicidade(List<Contato> contatos) {
		Set <Contato> contatosHash = new HashSet<Contato>(contatos);
		for(Contato contato: contatosHash) {
			System.out.println(contato.getNome());
			
		}
		
		
	}

}
