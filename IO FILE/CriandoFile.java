package aula14_IOFile;

import java.io.File;
import java.io.IOException;

public class CriandoFile {
	public static void main(String[] args) throws IOException {
		
	// Aqui estou criando um novo arquivo, sua localização e nome.
	File file = new File("C:\\Users\\ahpsa\\Documents\\workspace-spring-tool-suite-4-4.13.0.RELEASE\\CITI\\src\\aula14_IOFile\\meuArquivo.txt");
	if (file.exists()){
		System.out.println("Arquivo ja existe!");
	} else {
		boolean foiCriado = file.createNewFile();
		System.out.println("Foi criado?"+ foiCriado);
	}
	
	
	boolean foiDeletado = file.delete();
	System.out.println("Foi deletado?" +  foiDeletado);
	

	
	}
}
