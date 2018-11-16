package decorator.musicas;

import decorator.MusicasDecorator;
import decorator.Playlist;

public class FalaPraMim extends MusicasDecorator {

	private Playlist playlist;

	public FalaPraMim(Playlist playlist) {
		this.playlist = playlist;
	}

	@Override
	public String getNome() {
		return playlist.getNome() + "Fala pra mim";
	}

	@Override
	public double calcularDuracaoPlaylist() {
		return playlist.calcularDuracaoPlaylist() + 3.40;
	}

}
