package aula1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.List;

public class Hello {
	public static void main(String[] args) throws IOException {
		
	
	
	FileInputStream file = new FileInputStream("file.txt");
	
	InputStreamReader read_file = new InputStreamReader( file);
	
	BufferedReader buffer = new BufferedReader(read_file);
	
	String linha = buffer.readLine();
	
	
	while (linha != null) {
		System.out.println(linha);
		linha = buffer.readLine();
	}
	
	}

}
	