package Exercicio04;

public class Exercicio04 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Joãozinho", 25, "São Paulo", "34729403203");
        Funcionario funcionario = new Funcionario("Mariazinha", 30, "Santos", "7447434");

        cliente.exibirDados();
        System.out.println("----------------------");
        funcionario.exibirDados();
    }
}
