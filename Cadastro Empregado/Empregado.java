package aula9Empregado;

public class Empregado {
	private String nome;
	private String sobrenome;
	private String cpf;
	private int idade;
	private String recebeStatus;
	private boolean ativo;
	public Endereco endereco;
	
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
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String i) {
		this.cpf = i;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
	
	public String getRecebeStatus() {
		return recebeStatus;
	}
	public void setRecebeStatus(String recebeStatus) {
		if(recebeStatus.equalsIgnoreCase("ativo")) {
			this.ativo = true;
		}
	}

	public void recebeEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
//	public String getEndereco() {
//		return endereco.toString();
//	}
	
		
	@Override
	public String toString() {
		return "Nome: "+ this.getNome()+ "\n" + "Sobrenome: " + this.getSobrenome()+ "\n" + "CPF: " + this.getCpf()+ "\n" + "Idade: " + this.getIdade()+ "\n" + "Status: " + this.getRecebeStatus()+ "\n" + "Dados de endereço: \n" + this.endereco;
		
	}
	
}
				
				