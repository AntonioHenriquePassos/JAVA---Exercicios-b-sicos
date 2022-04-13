package exercicioSabadoFilmes;

import java.util.ArrayList;
import java.util.List;

public class Filme {
	private String titulo;
	private String direcao;
	private String genero;
	private String uf;
	private Integer duracao;
	private Integer ano;
	private Integer classificacao;
	private Integer totalPublico;
	
	
	
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDirecao() {
		return direcao;
	}
	public void setDirecao(String direcao) {
		this.direcao = direcao;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public Integer getDuracao() {
		return duracao;
	}
	public void setDuracao(Integer duracao) {
		this.duracao = duracao;
	}
	public Integer getAno() {
		return ano;
	}
	public void setAno(Integer ano) {
		this.ano = ano;
	}
	public Integer getClassificacao() {
		return classificacao;
	}
	public void setClassificacao(Integer classificacao) {
		this.classificacao = classificacao;
	}
	public Integer getTotalPublico() {
		return totalPublico;
	}
	public void setTotalPublico(Integer totalPublico) {
		this.totalPublico = totalPublico;
	}
	@Override
	public String toString() {
		return "Filme [titulo=" + titulo + ", direcao=" + direcao + ", genero=" + genero + ", uf=" + uf + ", duracao="
				+ duracao + ", ano=" + ano + ", classificacao=" + classificacao + ", totalPublico=" + totalPublico
				+ "]";
	}
	
	
	
	
	

}
