package visitor;

public class Compras implements CarrinhoVisitor {

	@Override
	public int visitar(Cd cd) {
		int custo = 0;
		if (cd.getPreco() > 0) {
			custo += cd.getPreco();
		}
		return custo;

	}

	@Override
	public int visitar(Dvd dvd) {
		int custo = 0;
		if (dvd.getPreco() > 0) {
			custo += dvd.getPreco();
		}
		return custo;
	}

}
