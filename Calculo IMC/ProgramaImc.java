package aula10;

public class ProgramaImc {
	public static void main(String[] args) {
		Paciente paciente1 = new Paciente();
		CalculaImc calc  = new CalculaImc();
		paciente1.cadastrarPaciente();
		calc.calcularImc(paciente1);
		System.out.println(paciente1);
	}

}
