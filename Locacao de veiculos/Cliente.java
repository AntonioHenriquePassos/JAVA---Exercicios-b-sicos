package aula11Exercicio1;

import java.util.Scanner;

public class Cliente {
	Scanner sist = new Scanner (System.in);
	private String nome;
	private int idade;
	private String cpf;
	private String servicosContratados;
	private Double valorTotal;
	private int qtdVeicTotal=0; 



	
	public String getNome() {
		return nome;
	}
	public int getIdade() {
		return idade;
	}
	public String getCpf() {
		return cpf;
	}
	
	public void cadastrarCliente() {
		System.out.println("Cadastre os dados do cliente: ");
		System.out.println("Nome: ");
		nome= sist.next();
		System.out.println("Idade: ");
		idade= sist.nextInt();
		System.out.println("CPF: ");
		cpf= sist.next();
		
		}
	public String getServicosContratados() {
		return servicosContratados;
	}
	public void setServicosContratados(String servicosContratados) {
		this.servicosContratados = servicosContratados;
	}
	public Double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}
	public int getQtdVeicTotal() {
		return qtdVeicTotal;
	}
	public void setQtdVeicTotal(int qtdVeicTotal) {
		this.qtdVeicTotal = qtdVeicTotal;
	}
	@Override
	public String toString() {
		System.out.println();
		return "Cliente [nome=" + nome + ", idade=" + idade + ", cpf=" + cpf + ", Detalhes dos Serviços Contratados=\n"
				+ servicosContratados + "Quantidade de veículos alugados=" + qtdVeicTotal + ", Valor total a ser pago=" + valorTotal +"]";
	}
	

	
	
}
