package builderandfactory;

public class DemandaBuilder {
	private Demanda demanda;

	public DemandaBuilder(Demanda demanda) {
		this.demanda = demanda;
	}

	public DemandaBuilder quantidade(double quant) {
		demanda.setQuantidade(quant);
		return this;
	}

	public DemandaBuilder valor(double val) {
		demanda.setValor(val);
		return this;
	}

	public DemandaBuilder peso(double pes) {
		demanda.setPeso(pes);
		return this;
	}

	public DemandaBuilder carne(ICarne carne) {
		demanda.getCarne().add(carne);
		return this;
	}

	public DemandaBuilder cliente(Cliente cli) {
		demanda.getCliente().add(cli);
		return this;
	}

}
