package aula14_IOFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Escrevendo {

	public static void main(String[] args) throws IOException {
		File arquivo = new File("novoArquivo.txt");
		//Qdo colocado dentro do try, o proprio try já fecha o arquivo
		try (FileWriter escreve = new FileWriter (arquivo)) {
			escreve.write("Esse é o texto do arquivo");
			escreve.flush(); //antes de fechar, assegura q tudo foi escrito como solicitado.
			arquivo.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
//LENDO O ARQUIVO CRIADO ACIMA
//		InputStream novo = new FileInputStream("novoArquivo.txt");
//		Reader leitor  = new InputStreamReader(novo);
//		BufferedReader bufferLeitor = new BufferedReader(leitor);
//		String linha = bufferLeitor.readLine();
//		System.out.println(linha);
//		bufferLeitor.close();
//		
		
		
		
	}

}
