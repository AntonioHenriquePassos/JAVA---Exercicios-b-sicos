package aula10;


public class CalculaImc{
	public Double imc;
		
	public void calcularImc(Paciente paciente) {
		this.imc = paciente.getPeso()/ (paciente.getAltura()*paciente.getAltura());
		paciente.setImc(this.imc);

		if (getImc() < 18.5) {
			System.out.printf("Seu IMC do paciente é %.2f, e se enquadra em %s", getImc(), Imc.MAGREZA );
		} else if (getImc() > 18.5 && getImc() < 24.9) {
			System.out.printf("Seu IMC do paciente é %.2f, e se enquadra em %s", getImc(), Imc.NORMALIDADE );
		} else if (getImc() > 24.9 && getImc() < 30) {
			System.out.printf("Seu IMC do paciente é %.2f, e se enquadra em %s", getImc(), Imc.SOBREPESO );
		} else {
			System.out.printf("Seu IMC do paciente é %.2f, e se enquadra em %s", getImc(), Imc.OBESIDADE );
		}
		
	}

	public Double getImc() {
		return imc;
		
		
	}
}
