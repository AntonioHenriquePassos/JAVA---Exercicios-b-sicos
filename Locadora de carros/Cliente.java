package aula13Exercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cliente {
	Scanner sist = new Scanner (System.in);
	private Integer id;
	private String nome;
	private Integer idade;
	protected List<Escolha> carros = new ArrayList<Escolha>();
	private static int cont = 1;
	
	
	public Integer getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public void cadastrarCliente() {
		System.out.println("**********************************************************");
		System.out.println("Informações do cliente:");
		System.out.println("Nome: ");
		nome = sist.next();
		System.out.println("Idade: ");
		idade = sist.nextInt();
		this.setId(cont);
		System.out.println("O ID do cliente é: "+this.getId());
		cont++;
		System.out.println("**********************************************************");
	}


	@Override
	public String toString() {
		return "Dados do Cliente: " +"\n"+"Nome: "+ this.getNome()+"\n"+"Idade: "+
				this.getIdade() +"\n"+ "ID: "+ this.getId();
		
	}
	
	
	
	}
	


