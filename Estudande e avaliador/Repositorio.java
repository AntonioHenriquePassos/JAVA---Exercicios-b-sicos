package aula10Exercicio2;

import java.util.List;

import aula11Exercicio2.Contato;

public interface Repositorio {
	
	public void armazenaContato(List<Contato> contatos);
	public void removeContatoPorId(List<Contato> contatos, String nome, Integer id);
	public void imprimeContatoPorId(List<Contato> contatos, Integer id);
	public void imprimeTodosContatosMenosId(List<Contato> contatos);
	public void imprimeTodosContatosSduplicidade(List<Contato> contatos);



	
	
	

}
