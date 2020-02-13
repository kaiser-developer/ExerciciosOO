package Exercicio04;

public class Cliente extends Pessoa{
    private String cpf;

    public Cliente(String nome, int idade, String cidadeNasc, String cpf) {
        super(nome, idade, cidadeNasc);
        this.cpf = cpf;
    }

    @Override
    public void exibirDados() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("idade: " + this.getIdade() + " anos");
        System.out.println("Cidade de Nascimento: " + this.getCidadeNasc());
        System.out.println("CPF: " + this.cpf);
    }

    public String getCpf() {
        return cpf;
    }
}
