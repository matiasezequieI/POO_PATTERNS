package builderandfactory;

import java.util.ArrayList;
import java.util.List;

public class Aviaria implements ICarne {

	@Override
	public String getTipo() {
		return "Aviaria";
	}

	@Override
	public List<String> getCortes() {
		List<String> cortes = new ArrayList<>();
		cortes.add("coxa");
		cortes.add("sobrecoxa");
		cortes.add("filé");
		return cortes;
	}

}
