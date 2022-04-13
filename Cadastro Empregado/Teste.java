package aula9Empregado;

import java.util.Scanner;

public class Teste {
	public static void main(String[] args) {
		Scanner sist = new Scanner (System.in);
		String cadastrar;
		Empregado empregado [] = new Empregado [2];
		int cont = 0;
		
		do {

			if (cont == empregado.length) {
				Empregado novaLista [] = new Empregado [empregado.length*2];
				System.arraycopy(empregado, 0, novaLista, 0, cont);
				empregado = novaLista;
				
			}
		
		Empregado empregadoX = new Empregado();
		Endereco enderecoX = new Endereco();
		
		empregado[cont] = empregadoX;
		empregadoX.recebeEndereco(enderecoX);
		
		System.out.println("***********************************************");
		System.out.println("Por favor, preencha o cadastro do empregado.");
		System.out.println("Nome: ");
		empregadoX.setNome(sist.next());
		System.out.println("Sobrenome : ");
		empregadoX.setSobrenome(sist.next());
		System.out.println("Idade : ");
		empregadoX.setIdade(sist.nextInt());
		System.out.println("CPF : ");
		empregadoX.setCpf(sist.next());
		System.out.println("Status (ativo ou inativo) : ");
		empregadoX.setRecebeStatus(sist.next());
		
		
		
		System.out.println("Informações de endereço: ");
		System.out.println("Cidade: ");
		empregadoX.endereco.setCidade(sist.next());
		System.out.println("Digite tipo de logradouro: ");
		empregadoX.endereco.setTipoLogradouro(sist.next());
		System.out.println("Nome do endereço: ");
		empregadoX.endereco.setNome(sist.next());
		System.out.println("Numero da residência: ");
		empregadoX.endereco.setNumero(sist.next());
		
		System.out.println("Deseja continuar cadastrando? ");
		cadastrar = sist.next();
		cont++;
		
		} while (cadastrar.equalsIgnoreCase("sim"));
		
		System.out.println("Impressão da lista: ");
		for(int i = 0; i< cont; i++) {
			System.out.println("******************************");
			System.out.printf("Empregado %d\n", (i+1));
			System.out.println(empregado[i]);
			System.out.println("");
		}
		
	}

	
}
