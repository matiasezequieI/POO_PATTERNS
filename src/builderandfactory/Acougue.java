package builderandfactory;

public class Acougue {
	private CarneFactory carneFactory;

	public Acougue(CarneFactory cf) {
		this.carneFactory = cf;
	}

	public ICarne cortar(String tipo) {
		return carneFactory.getTipo(tipo);
	}

}
