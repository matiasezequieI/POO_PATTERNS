package strategy;

public class EstudanteReprovado extends Estudante {

	public EstudanteReprovado(int idMatricula, String nome) {
		super(idMatricula, nome);
	}

	@Override
	public void calcularNotas() {
		this.setNota1(5);
		this.setNota2(6);
		System.out.println("estudante reprovado");

	}

}
