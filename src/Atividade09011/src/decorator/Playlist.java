package decorator;

public abstract class Playlist {
	protected String nome;

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public abstract double calcularDuracaoPlaylist();

}
