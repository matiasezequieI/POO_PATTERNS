package visitor;

public class Tester {
	public static void main(String[] args) {
		Items[] itemsLista = new Items[] { new Cd("Coletanea melhores do Calypso", 60, 15),
				new Dvd("Filme de terror", 120, 25) };

		int conta = precoTotal(itemsLista);
		System.out.println(conta);

	}

	private static int precoTotal(Items[] itemsLista) {
		CarrinhoVisitor visitar = new Compras();
		int soma = 0;
		for (Items item : itemsLista) {
			soma += item.aceitar(visitar);
		}
		return soma;

	}

}
