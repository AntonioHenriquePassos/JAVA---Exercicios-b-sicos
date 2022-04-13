package aula10Exercicio2;

import java.util.Scanner;

public class Avaliador {
	Scanner sist = new Scanner (System.in);
	private int id;
	private static int count = 1;
	private Double [] notas = new Double [4];
	private Double somaNota = 0.0;
	int i = 0;
	
	
	private void pegaNotas(Double...notass) {
		
		
		for(int g = 0; g < notas.length; g++)  {
				somaNota+=notass[g];
			
		}

	}
	
	private int geraId() {
		this.id = count;
		count++;
		return this.id;
		
	}
	
	public void receberId(Estudante estudante) {
		estudante.setId(this.geraId());
	}
	
	public void InformaNotas(Estudante estudante) {
		System.out.println("Informe as 4 notas no aluno: ");
		this.pegaNotas(sist.nextDouble(), sist.nextDouble(), sist.nextDouble(), sist.nextDouble());	
		estudante.setMedia(somaNota/4);	
	}

	public String calcMaiorMedia(Estudante estudante1, Estudante estudante2) {
		String resultado = (estudante1.getMedia() > estudante2.getMedia())? "Estudante 1 tem média maior que estudante 2.\n"+ "Dados: "+ estudante1: "Estudante 2 tem média maior que estudante 1.\n" + "Dados: "+ estudante2;
		return resultado;
		
	}
}
