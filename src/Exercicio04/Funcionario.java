package Exercicio04;

public class Funcionario extends Pessoa {
    private String numeroMatricula;

    public Funcionario(String nome, int idade, String cidadeNasc, String numeroMatricula) {
        super(nome, idade, cidadeNasc);
        this.numeroMatricula = numeroMatricula;
    }

    @Override
    public void exibirDados() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("idade: " + this.getIdade() + " anos");
        System.out.println("Cidade de Nascimento: " + this.getCidadeNasc());
        System.out.println("Numero da matricula: " + this.numeroMatricula);
    }
}
