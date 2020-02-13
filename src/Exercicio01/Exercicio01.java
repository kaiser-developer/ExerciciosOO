package Exercicio01;

public class Exercicio01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Joãozinho", 20, 200.45);
        Cliente cliente2 = new Cliente("Mariazinha", 25, 1000);
        Cliente cliente3 = new Cliente("Pereira", 18, 2500.34);

        cliente1.receberProduto("Carro");
        cliente2.comprar(2500);
        cliente3.comprar(2500);
    }
}
