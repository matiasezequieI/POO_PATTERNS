package builderandfactory;

import java.util.ArrayList;
import java.util.List;

public class Suina implements ICarne {

	@Override
	public String getTipo() {
		return "Suina";
	}

	@Override
	public List<String> getCortes() {
		List<String> cortes = new ArrayList<>();
		cortes.add("lombo");
		cortes.add("paleta");
		cortes.add("alcatra");
		return cortes;
	}

}
