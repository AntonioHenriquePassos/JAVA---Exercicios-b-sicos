package aula10;


import java.util.Scanner;

public class Paciente {
	Scanner sist = new Scanner (System.in);
	
	private String nome;
	private String sobrenome;
	private int idade;
	private Double peso;
	private Double altura;
	private Double imc;
	
	
	public void cadastrarPaciente() {
		System.out.println("Informações do paciente:");
		System.out.println("Nome: ");
		nome = sist.next();
		System.out.println("Sobreome: ");
		sobrenome = sist.next();
		System.out.println("Idade: ");
		idade = sist.nextInt();
		System.out.println("Peso: ");
		peso = sist.nextDouble();
		System.out.println("Altura: ");
		altura = sist.nextDouble();
	
	}

	public String getNome() {
		return nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public int getIdade() {
		return idade;
	}

	public Double getPeso() {
		return peso;
	}

	public Double getAltura() {
		return altura;
	}

	
	
		
	@Override
	public String toString() {
		return "\nDados do paciente:\n" + "None: "+ this.getNome()+ "\n"+ "Sobrenome: "+ this.getSobrenome()+ "\n"+ "Idade: "+ this.getIdade()+ "\n"+ "Peso: "+ this.getPeso()+ "\n"+ "Altura: "+ this.getAltura()+ "\n"+ "IMC: "+ this.getImc();            
	}

	public Double getImc() {
		return imc;
	}

	public void setImc(Double imc) {
		this.imc = imc;
	}



	
	

	


}
