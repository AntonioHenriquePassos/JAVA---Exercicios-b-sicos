package exercicioSabadoFilmes;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;


public abstract class ImportaFIlme {
		
	
	 static List <Filme> listaFilmes = new ArrayList<>();
	 
	 public static void addFilmesALista() throws IOException {
	
		InputStream file = new FileInputStream("filmes.txt");
		Reader reader = new InputStreamReader(file);
		BufferedReader buffered = new BufferedReader(reader);
		String linha = buffered.readLine();
		
		
		while (linha!=null) {
			String[] separaLinha;
		
			separaLinha = linha.split(";");
		
			Filme filme = new Filme();
			filme.setTitulo(separaLinha[0]);
			filme.setDirecao(separaLinha[1]);
			filme.setGenero(separaLinha[2]);
			filme.setUf(separaLinha[3]);
			filme.setDuracao(Integer.parseInt(separaLinha[4]));
			filme.setAno(Integer.parseInt(separaLinha[5]));
			filme.setClassificacao(Integer.parseInt(separaLinha[6]));
			filme.setTotalPublico(Integer.parseInt(separaLinha[7]));
			
			listaFilmes.add(filme);
			linha = buffered.readLine();
		}

		buffered.close();
		
	}
	 public static void imprimeTodosFilmes() {
		 System.out.println();
		 System.out.println("Lista de todos os filmes: ");
		 System.out.println("===============================================================================");
		 for (Filme filme:listaFilmes) {
			 System.out.println(filme);
		 }
	 }
	 
	 public static void filmes2021() {
		 System.out.println();
		 System.out.println("Lista com os filmes de 2021: ");
		 System.out.println("===============================================================================");
		 List<Filme> filtroFilmes2021 = listaFilmes.stream().filter(filme -> filme.getAno()== 2021).collect(Collectors.toList());
		 filtroFilmes2021.forEach(System.out::println);
		 
		
	 }
	 
	 public static void maiorBilheteria() {
		 System.out.println();
		 System.out.println("Filme de maior bilheteria: ");
		 System.out.println("===============================================================================");
		 Optional<Filme> filtroMaiorBilheteria = listaFilmes.stream().max(Comparator.comparing(Filme:: getTotalPublico));
		 System.out.println(filtroMaiorBilheteria);
			 
	 }
	 
	 public static void agruparPorDiretor() {
		 System.out.println();
		 System.out.println("Lista de filmes, agrupada por nome de diretor: ");
		 System.out.println("===============================================================================");
		 List<Filme> agrupamentoNomeDiretor = listaFilmes.stream().sorted(Comparator.comparing(Filme :: getDirecao)).collect(Collectors.toList());
		 agrupamentoNomeDiretor.forEach(System.out::println);
	 }
	 
	 public static void agruparPorCategoria() {
		 System.out.println();
		 System.out.println("Lista de filmes, agrupada por nome de catogoria: ");
		 System.out.println("===============================================================================");
		 List<Filme> agruparPorCategoria = listaFilmes.stream().sorted(Comparator.comparing(Filme::getGenero)).collect(Collectors.toList());
		 agruparPorCategoria.forEach(System.out::println);
	 }
	 
	 public static void mediaClassificacao() {
		 System.out.println();
		 System.out.println("A média de classificação é: ");
		 System.out.println("===============================================================================");
		 OptionalDouble mediaClassificação = listaFilmes.stream().mapToDouble(filme -> filme.getClassificacao()).average();
		 System.out.println(mediaClassificação);
	 }
	 
	 public static void mediaPublico() {
		 System.out.println();
		 System.out.println("A média de público é: ");
		 System.out.println("===============================================================================");
		 OptionalDouble mediaPublico = listaFilmes.stream().mapToDouble(Filme:: getTotalPublico).average();
		 System.out.println(mediaPublico);
	 }
	 
	 
	 
	
	
	
	

}
