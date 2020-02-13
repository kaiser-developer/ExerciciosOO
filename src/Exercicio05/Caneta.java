package Exercicio05;

public class Caneta extends Forma implements Escrevem{
    public Caneta(String escreveCom, String ehFeitoDe) {
        super(escreveCom, ehFeitoDe);
    }

    @Override
    public void escrever() {
        System.out.println("Escrevendo com " + this.escreveCom);
    }
}
