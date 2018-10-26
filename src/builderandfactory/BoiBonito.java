package builderandfactory;

import java.util.ArrayList;
import java.util.List;

public class BoiBonito implements ICarne {

	@Override
	public List<String> getCortes() {
		List<String> cortesCarne = new ArrayList();
		cortesCarne.add("bovino");
		cortesCarne.add("suino");
		cortesCarne.add("aviaria");
		return cortesCarne;
	}

	@Override
	public String getTipo() {
		return "bovino";
	}

	@Override
	public String toString() {
		return "BoiBonito [getCortes()=" + getCortes() + ", getTipo()=" + getTipo() + "]";
	}

}
