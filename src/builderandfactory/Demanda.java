package builderandfactory;

import java.util.ArrayList;
import java.util.List;

public class Demanda {
	private double quantidade;
	private double peso;
	private double valor;

	private List<ICarne> carne = new ArrayList<>();
	private List<Cliente> cliente = new ArrayList<>();

	public Demanda(ICarne carne, double peso, double valor, String cliente) {
		this.setPeso(peso);
		this.setValor(valor);
		this.getCliente();
		this.getCarne();
		
	}

	public double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public List<ICarne> getCarne() {
		return carne;
	}

	public void setCarne(List<ICarne> carne) {
		this.carne = carne;
	}

	public List<Cliente> getCliente() {
		return cliente;
	}

	public void setCliente(List<Cliente> cliente) {
		this.cliente = cliente;
	}

}
