package decorator.musicas;

import decorator.MusicasDecorator;
import decorator.Playlist;

public class LuaMeTraiu extends MusicasDecorator {

	private Playlist playlist;

	public LuaMeTraiu(Playlist playlist) {
		this.playlist = playlist;
	}

	@Override
	public String getNome() {
		return playlist.getNome() + "Lua me traiu";
	}

	@Override
	public double calcularDuracaoPlaylist() {
		return playlist.calcularDuracaoPlaylist() + 3.57;
	}

}