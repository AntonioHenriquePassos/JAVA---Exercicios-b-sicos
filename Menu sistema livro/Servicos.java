package aula13Exercicio2;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Map;

public class Servicos {
	static Scanner sc = new Scanner(System.in);
	static String tituloLivro;
	static int encontrado=0;
	
	
	public static void cadastrarLivro(Livro livro) {
		System.out.println("=====================================================");
		System.out.println("            Cadastro livro            ");
		System.out.println("=====================================================");
		System.out.printf("Título: ");
		livro.setTitulo(sc.next());
		System.out.println();
		System.out.printf("Nome do autor: ");
		livro.setAutor(sc.next());
		System.out.println();
		System.out.printf("Editora: ");
		livro.setEditora(sc.next());
		System.out.println();
		System.out.printf("Número de paginas: ");
		livro.setNumeroPaginas(sc.nextInt());
		System.out.println();
		System.out.println("=====================================================");
		Livro.biblioteca.add(livro);

		
	}
	
	public static void pesquisarLivro(List<Livro> biblioteca) {
		encontrado=0;
		System.out.println("=====================================================");
		System.out.println("       Digite o título do livro:      ");
		tituloLivro = sc.next();
		Map<String, Livro> map = new HashMap<String, Livro>();
		if (biblioteca==null) {
			System.out.println("Não há livros cadastrados.");
		}
		for (Livro livro:biblioteca) {
			map.put(livro.getTitulo(), livro);
		} 
		if (map.get(tituloLivro)!=null) {	
			System.out.println();
			System.out.println("Título Encontrado!");
			System.out.println(map.get(tituloLivro));
			
		} else {
			System.out.println();
			System.out.println("Título não encontrado.");
		}
		
	}

	public static void exibeMenu() {
		System.out.println("=====================================================");
		System.out.println("Digite 1 para CADASTRAR NOVO LIVRO.");
		System.out.println("Digite 2 para CONSULTAR LIVROS.");
		System.out.println("Digite 0 para SAIR.");
		System.out.println("=====================================================");

	}

}
