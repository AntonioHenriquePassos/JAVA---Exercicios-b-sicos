package aula10Exercicio2;

import java.util.Scanner;

public class Estudante {
	Scanner sist = new Scanner (System.in);
	
	private String nome;
	private int id;
	private int idade;
	private Double media;
	
	public void cadastrar() {
		System.out.println();
		System.out.println("Cadastre as informações do aluno: ");
		System.out.println("Nome: ");
		nome = sist.next();
		System.out.println("Idade: ");
		idade = sist.nextInt();
		
		
	}
	
	public String getNome() {
		return nome;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Double getMedia() {
		return media;
	}
	public void setMedia(Double media) {
		this.media = media;
	}
	public int getIdade() {
		return idade;
	}

	@Override
	public String toString() {
		return "Estudante [nome=" + nome + ", id=" + id + ", idade=" + idade + ", media=" + media + "]";
	}

	
	

}
