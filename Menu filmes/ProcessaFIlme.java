package exercicioSabadoFilmes;

import java.io.IOException;

public class ProcessaFIlme {

	public static void main(String[] args) throws IOException {
		ImportaFIlme.addFilmesALista();
		ImportaFIlme.imprimeTodosFilmes();
		ImportaFIlme.filmes2021();
		ImportaFIlme.maiorBilheteria();
		ImportaFIlme.agruparPorDiretor();
		ImportaFIlme.agruparPorCategoria();
		ImportaFIlme.mediaClassificacao();
		ImportaFIlme.mediaPublico();
	
		

	}

}
