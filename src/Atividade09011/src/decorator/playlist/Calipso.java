package decorator.playlist;

import decorator.Playlist;

public class Calipso extends Playlist {
	public Calipso() {
		nome = "playlist de calipso";
	}

	@Override
	public double calcularDuracaoPlaylist() {
		return 0;
	}

}
