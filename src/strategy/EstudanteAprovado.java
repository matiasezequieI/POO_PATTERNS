package strategy;

public class EstudanteAprovado extends Estudante {

	public EstudanteAprovado(int idMatricula, String nome) {
		super(idMatricula, nome);
	}

	@Override
	public void calcularNotas() {
		this.setNota1(7);
		this.setNota2(8);
		System.out.println("estudante aprovado");

	}
}
