package aula14_IOFile;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class AbrindoFileELendo {
	
	public static void main(String[] args) throws IOException {
		
		// Stream representa fluxo binario - pega qqer coisa, de texto à imagem..
		// reader representa fluxo de caracteres, transforma qqer coisa em texto
		
	FileInputStream file = new FileInputStream("file.txt"); // extend da classe abstrata InputStream
	
	InputStreamReader read_file = new InputStreamReader( file);// extend da classe abstrata Reader
	
	BufferedReader buffer = new BufferedReader(read_file);
	
	String linha = buffer.readLine();
	
	
	while (linha != null) {
		System.out.println(linha);
		linha = buffer.readLine();
	}
	
	}


}
