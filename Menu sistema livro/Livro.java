package aula13Exercicio2;

import java.util.ArrayList;
import java.util.List;

public class Livro {
	private String titulo;
	private String autor;
	private String editora;
	private int numeroPaginas;
	protected static List <Livro> biblioteca = new ArrayList<Livro>();
	
	public String getTitulo() {
		return titulo;
	}
	public String getAutor() {
		return autor;
	}
	public String getEditora() {
		return editora;
	}
	public int getNumeroPaginas() {
		return numeroPaginas;
	}
	public List<Livro> getBiblioteca() {
		return biblioteca;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}
	@Override
	public String toString() {
		return "Título: " + titulo +"\n"+ "Autor: " + autor +"\n"+  "Editora: " + editora + "\n"+ "Número de páginas: "
				+ numeroPaginas;
	}
	
	
	
	

}
