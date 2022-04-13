package aula10Exercicio2;


public class TesteEstudanteAvaliador {

	public static void main(String[] args) {
		int cont = 0;
		
		Estudante [] estudante = new Estudante [2];
		
		 for(int i = 0; i< estudante.length; i++) {

			Estudante  e1 = new Estudante();
			Avaliador av1 = new Avaliador();
			e1.cadastrar();
			av1.receberId(e1);
			av1.InformaNotas(e1);
			estudante [i] = e1;
			
			
		 }
		
		
		Avaliador av = new Avaliador();
		System.out.println();
		System.out.println(av.calcMaiorMedia(estudante[cont], estudante[cont+1]));
		
		
		
		
		

	}

}
