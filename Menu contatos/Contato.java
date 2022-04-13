package aula11Exercicio2;

import java.util.Scanner;

public class Contato {
	Scanner sist = new Scanner (System.in);
	
	private Integer id;
	private String nome;
	private String sobrenome;
	private Integer idade;
	private Genero genero;
	private static int cont=1;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public Genero getGenero() {
		return genero;
	}
	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	
	
	public void cadastrarContato() {
		System.out.println("Informe os dados do contato: ");
		System.out.println("Nome: ");
		nome = sist.next();
		System.out.println("Sobrenome: ");
		sobrenome = sist.next();
		System.out.println("Idade: ");
		idade = sist.nextInt();
		System.out.println("Gênero (M - masculino), (F - feminino), (O - outro):  ");
		String gen;
		gen = sist.next();
		
		while ((!gen.equalsIgnoreCase("F")) && (!gen.equalsIgnoreCase("M")) && (!gen.equalsIgnoreCase("O"))){
			System.out.println("Valor inválido! Digite novamente.");
			System.out.println("Gênero (M - masculino), (F - feminino), (O - outro):  ");
			gen = sist.next();
		}
		if (gen.equalsIgnoreCase("M")) {
			genero = Genero.MASCULINO;
		} else if (gen.equalsIgnoreCase("F")) {
			genero = Genero.FEMININO;
		} else if (gen.equalsIgnoreCase("O")) {
			genero = Genero.OUTRO;
		} 
		
		this.setId(cont);
		cont++;
		
		
	}
	@Override
	public String toString() {
		return "Contato [nome=" + nome + ", sobrenome=" + sobrenome + ", idade=" + idade + ", genero=" + genero + ", id=" + id + "]";
	}
	public String retornarSemId() {
		return "Contato [nome=" + nome + ", sobrenome=" + sobrenome + ", idade=" + idade + ", genero=" + genero + "]";
	}
	
	
	
	
}
