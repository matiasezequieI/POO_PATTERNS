package strategy;

public class Tester {

	public static void main(String[] args) {
		Estudante aprov = new EstudanteAprovado(1, "joao");
		Estudante reprov = new EstudanteReprovado(2, "mario");

		CalculadoraDeNotas cn = new CalculadoraDeNotas();
		cn.calcularNotas(aprov);
		System.out.println(aprov);

		cn.calcularNotas(reprov);
		System.out.println(reprov);

	}

}
