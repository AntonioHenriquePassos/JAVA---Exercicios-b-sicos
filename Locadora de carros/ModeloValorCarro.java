package aula13Exercicio1;

public enum ModeloValorCarro {

	FIAT_UNO(1,130.00),
	VW_GOL(2,150.00),
	JEEP_RENEGADE(3,350.00),
	RENAUT_DUSTER(4,350.00),
	TOYOTA_HILUX(5, 1500.00),
	GM_TRAILBLAZER(6,1800.00),
	PORCHE_CAYENNE(7, 3500.00),
	FORD_MUSTANG(8,4000.00);
	
	
	private final int id;

	private final Double valor;
	
	ModeloValorCarro(int i, double d) {
		this.id = i;
		this.valor = d;
	}
	
	public int getId() {
		return id;
	}

	public Double getValor() {
		return valor;
	}

}
