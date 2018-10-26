package builderandfactory;

public class CarneFactory {
	public ICarne getTipo(String tipo) {
		ICarne carne = null;

		if (tipo.equalsIgnoreCase("bovina")) {
			carne = new Bovina();
		} else if (tipo.equalsIgnoreCase("suina")) {
			carne = new Suina();
		} else if (tipo.equalsIgnoreCase("aviaria")) {
			carne = new Aviaria();
		}

		return carne;

	}

}
