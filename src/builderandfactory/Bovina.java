package builderandfactory;

import java.util.ArrayList;
import java.util.List;

public class Bovina implements ICarne {

	@Override
	public String getTipo() {
		return "Bovina";

	}

	@Override
	public List<String> getCortes() {
		List<String> cortes = new ArrayList<>();
		cortes.add("pernil");
		cortes.add("picanha");
		cortes.add("fraldinha");
		return cortes;
	}

	@Override
	public String toString() {
		return "Bovina [getTipo()=" + getTipo() + ", getCortes()=" + getCortes() + "]";
	}

}
