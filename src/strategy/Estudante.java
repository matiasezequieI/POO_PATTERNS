package strategy;

public abstract class Estudante {
	protected int idMatricula;
	protected String nome;
	protected double nota1;
	protected double nota2;

	public Estudante(int idMatricula, String nome) {
		this.idMatricula = idMatricula;
		this.nome = nome;
	}

	public Estudante(int idMatricula, String nome, int semestre, double n1, double n2) {
		this(idMatricula, nome);
		this.nota1 = n1;
		this.nota2 = n2;

	}

	public int getIdMatricula() {
		return idMatricula;
	}

	public void setIdMatricula(int idMatricula) {
		this.idMatricula = idMatricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public abstract void calcularNotas();

}
