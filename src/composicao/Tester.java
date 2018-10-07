package composicao;

public class Tester {

	public static void main(String[] args) {
		Pessoa p = new Pessoa("Lucas", 20);
		Aluno aluno = new Aluno();
		aluno.setIdAluno(1);
		aluno.setPessoa(p);

		System.out.println(aluno.getPessoa().getNome());

	}

}
