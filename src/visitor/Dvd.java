package visitor;

public class Dvd implements Items {
	
	private String titulo;
	private double duracao;
	private int preco;

	public Dvd(String titulo, double duracao, int preco) {
		super();
		this.titulo = titulo;
		this.duracao = duracao;
		this.preco = preco;

	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getDuracao() {
		return duracao;
	}

	public void setDuracao(double duracao) {
		this.duracao = duracao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(int preco) {
		this.preco = preco;
	}

	@Override
	public int aceitar(CarrinhoVisitor visitor) {
		return visitor.visitar(this);
	}

}
