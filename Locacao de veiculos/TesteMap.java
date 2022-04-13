package aula11Exercicio1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TesteMap {
	
	public static void main(String[] args) {
		Scanner sist = new Scanner (System.in);
		Map<String, Integer> meuMap = new HashMap<>();
		System.out.println("Digite o caminho do arquivo: ");
		String path = sist.nextLine();
		
		try ( BufferedReader leitor = new BufferedReader(new FileReader(path))) {
			
			String linha = leitor.readLine();
			
			while (linha!=null) {
				String [] campo = linha.split(",");
				
				String nome = campo[0];
				Integer voto = Integer.parseInt(campo[1]);
				
				if (meuMap.get(nome)==null) {
					meuMap.put(nome, voto);
				} else {
					meuMap.put(nome, voto + meuMap.get(nome));
				}
				linha = leitor.readLine();			
		}
		
		for (String key: meuMap.keySet()) {
			System.out.println(key + ":" + meuMap.get(key));
		}
		
	}
	 catch (IOException e) {
		System.out.println("error: " + e.getMessage());
		
	}
	
		
	 sist.close();


		}
	}
