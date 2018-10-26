package builderandfactory;

public class Tester {
	public static void main(String[] args) {
	
		CarneFactory cfa = new CarneFactory();
		Acougue ag = new Acougue(cfa);
		
		ICarne c1 = ag.cortar("suina");
		System.out.println(c1.getCortes());
		
		Demanda d1 = new Demanda(c1, 3, 20, "Matias");
		DemandaBuilder db = new DemandaBuilder(d1);
		
		db
			.quantidade(3)
			.valor(20)
			.carne(c1);
		
		System.out.println(d1);
	}

}
