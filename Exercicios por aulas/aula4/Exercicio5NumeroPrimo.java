package aula4;

public class Exercicio5NumeroPrimo {
	public static void main(String[] args) {
		int cont=0;
		int numPrimos=0;
		System.out.println("20 Primeiros números primos: \n ");
		
		for(int i = 1; i<100; i++) {
			cont=0;
			for(int j=1; j<100; j++) {
				if(i%j==0) {
					cont= cont + 1;
				}
			} 
			
			if(cont==2) {
				numPrimos+=1;
				System.out.print(i + "  ");
				if (numPrimos==20) {
					break;
				}
				
			}
		}	
	}	
}	
	


