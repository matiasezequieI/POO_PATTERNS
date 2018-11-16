package decorator;

import decorator.musicas.AChavePerdida;
import decorator.musicas.FalaPraMim;
import decorator.musicas.LuaMeTraiu;
import decorator.playlist.Calipso;

public class Tester {

	public static void main(String[] args) {
		Playlist p1 = new Calipso();
		p1 = new AChavePerdida(p1);
		p1 = new FalaPraMim(p1);
		p1 = new LuaMeTraiu(p1);

		System.out.println(p1.getNome());
		System.out.println(p1.calcularDuracaoPlaylist());

	}

}
