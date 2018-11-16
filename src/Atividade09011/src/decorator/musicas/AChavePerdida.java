package decorator.musicas;

import decorator.MusicasDecorator;
import decorator.Playlist;

public class AChavePerdida extends MusicasDecorator {

	private Playlist playlist;

	public AChavePerdida(Playlist playlist) {
		this.playlist = playlist;
	}

	@Override
	public String getNome() {
		return playlist.getNome() + "A chave perdida";
	}

	@Override
	public double calcularDuracaoPlaylist() {
		return playlist.calcularDuracaoPlaylist() + 3.05;

	}

}
