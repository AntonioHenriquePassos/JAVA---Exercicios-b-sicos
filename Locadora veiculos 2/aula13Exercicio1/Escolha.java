package aula13Exercicio1;

import java.util.Scanner;

public class Escolha {
	Scanner sist  =new Scanner (System.in);
	
	private Categoria categoria;
	private int unidCarro=0;
	private ModeloValorCarro modelo;
	private Double valorCarro;
	private Double valorTotal;
	private int qtdeDias;
	private String escolhaCategoria;



	
	public Categoria getCategoria() {
		return categoria;
	}




	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}




	public int getUnidCarro() {
		return unidCarro;
	}




	public void setUnidCarro(int unidCarro) {
		this.unidCarro = unidCarro;
	}




	public ModeloValorCarro getModelo() {
		return modelo;
	}




	public void setModelo(ModeloValorCarro modelo) {
		this.modelo = modelo;
	}




	public Double getValorTotal() {
		return valorTotal;
	}




	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}




	public int getQtdeDias() {
		return qtdeDias;
	}




	public void setQtdeDias(int qtdeDias) {
		this.qtdeDias = qtdeDias;
	}




	public Scanner getSist() {
		return sist;
	}




	public Double getValorCarro() {
		return valorCarro;
	}




	public String getEscolhaCategoria() {
		return escolhaCategoria;
	}




	public void adicionaCarro() {
		
		System.out.println("Escolha a categoria: ");
		escolhaCategoria=sist.next();
		
		while (!escolhaCategoria.equalsIgnoreCase("b") && !escolhaCategoria.equalsIgnoreCase("i")&& !escolhaCategoria.equalsIgnoreCase("e") && !escolhaCategoria.equalsIgnoreCase("p")) {
			System.out.println("Categoria inválida!");
			System.out.println("Escolha a categoria: ");
			escolhaCategoria=sist.next();
		}
			
			
			
		if(escolhaCategoria.equalsIgnoreCase("b")) {
			categoria= Categoria.BASICO;
		} else if(escolhaCategoria.equalsIgnoreCase("i")) {
			categoria= Categoria.INTERMEDIARIO;
		} else if(escolhaCategoria.equalsIgnoreCase("e")) {
			categoria= Categoria.EXECUTIVO;
		} else if(escolhaCategoria.equalsIgnoreCase("p")) {
			categoria= Categoria.PREMIUM;
		}
		System.out.println("Qual o modelo? (escolha por meio do número). ");
		int escolhaModelo;
		escolhaModelo=sist.nextInt();
		
		//METODO PARA NÃO PERMITIR QUE SE ALUGUE CARROS DE OUTRA CATEGORIA
		if(categoria==Categoria.BASICO){
			while (escolhaModelo!=1 && escolhaModelo!=2) {
				System.out.println("Modelo inválido!");
				System.out.println("Qual o modelo? (escolha por meio do número");
				escolhaModelo=sist.nextInt();
			
			}
			
		} else if(categoria==Categoria.INTERMEDIARIO){
			while (escolhaModelo!=3 && escolhaModelo!=4) {
				System.out.println("Modelo inválido!");
				System.out.println("Qual o modelo? (escolha por meio do número");
				escolhaModelo=sist.nextInt();
			
			}
			
		} else if(categoria==Categoria.EXECUTIVO){
			while (escolhaModelo!=5 && escolhaModelo!=6) {
				System.out.println("Modelo inválido!");
				System.out.println("Qual o modelo? (escolha por meio do número");
				escolhaModelo=sist.nextInt();
			
			}
		}  else if(categoria==Categoria.EXECUTIVO){
			while (escolhaModelo!=7 && escolhaModelo!=8) {
				System.out.println("Modelo inválido!");
				System.out.println("Qual o modelo? (escolha por meio do número");
				escolhaModelo=sist.nextInt();
			
			}
		}
		
		if (escolhaModelo==1) {
			modelo = ModeloValorCarro.FIAT_UNO;
			valorCarro = ModeloValorCarro.FIAT_UNO.getValor();
		} else if (escolhaModelo==2) {
			modelo = ModeloValorCarro.VW_GOL;
			valorCarro = ModeloValorCarro.VW_GOL.getValor();
		} else if (escolhaModelo==3) {
			modelo = ModeloValorCarro.JEEP_RENEGADE;
			valorCarro = ModeloValorCarro.JEEP_RENEGADE.getValor();
		} else if (escolhaModelo==4) {
			modelo = ModeloValorCarro.RENAUT_DUSTER;
			valorCarro = ModeloValorCarro.RENAUT_DUSTER.getValor();
		} else if (escolhaModelo==5) {
			modelo = ModeloValorCarro.TOYOTA_HILUX;
			valorCarro = ModeloValorCarro.TOYOTA_HILUX.getValor();
		} else if (escolhaModelo==6) {
			modelo = ModeloValorCarro.GM_TRAILBLAZER;
			valorCarro = ModeloValorCarro.GM_TRAILBLAZER.getValor();
		} else if (escolhaModelo==7) {
			modelo = ModeloValorCarro.PORCHE_CAYENNE;
			valorCarro = ModeloValorCarro.PORCHE_CAYENNE.getValor();
		} else if (escolhaModelo==8) {
			modelo = ModeloValorCarro.FORD_MUSTANG;
			valorCarro = ModeloValorCarro.FORD_MUSTANG.getValor();

		} 
		

		System.out.println("Quantas unidades desse modelo? ");
		unidCarro = sist.nextInt();
		System.out.println("Por quantos dias alugará o carro? ");
		qtdeDias = sist.nextInt();
		valorTotal = valorCarro*unidCarro*qtdeDias;
				
	}




	@Override
	public String toString() {
		return "Categoria: " + categoria + "\nModelo: " + modelo + "\nUnidades: "+ unidCarro + "\nDias de aluguel: " + qtdeDias + "\nValor total: "
				+ valorTotal;
	}
		

	

}
