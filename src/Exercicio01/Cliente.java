package Exercicio01;

public class Cliente {
    private String nome;
    private int idade;
    private double qtdDinheiro;

    public Cliente(String nome, int idade, double qtdDinheiro) {
        this.nome = nome;
        this.idade = idade;
        this.qtdDinheiro = qtdDinheiro;
    }

    public void comprar(double valor){
        if (valor > qtdDinheiro){
            System.out.println("Não foi possivel efetuar a compra.");
        }else {
            System.out.println("Compra realizada com sucesso.");
        }
    }

    public void receberProduto(String produto){
        if (produto == null){
            System.out.println("Cliente " + this.nome + " não foi possivel entregar seu produto");
        }else{
            System.out.println("Cliente " + this.nome + " seu produto: " + produto + " foi entregue");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getQtdDinheiro() {
        return qtdDinheiro;
    }

    public void setQtdDinheiro(double qtdDinheiro) {
        this.qtdDinheiro = qtdDinheiro;
    }
}
