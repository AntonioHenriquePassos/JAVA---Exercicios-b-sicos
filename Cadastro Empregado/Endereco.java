package aula9Empregado;

public class Endereco {
	private String tipoLogradouro;
	private String nome;
	private String cidade;
	private String numero;
	
	public String getTipoLogradouro() {
		return tipoLogradouro;
	}
	public void setTipoLogradouro(String tipoLogradouro) {
		this.tipoLogradouro = tipoLogradouro;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	} 
	
	@Override
	public String toString() {
		return "Cidade: " + this.getCidade()+ "\n"+ this.getTipoLogradouro() + ": "+ this.getNome() + ", "+ this.getNumero();
	}
}