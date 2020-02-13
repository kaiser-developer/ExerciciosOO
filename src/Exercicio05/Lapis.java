package Exercicio05;

public class Lapis extends Forma implements Escrevem {

    public Lapis(String escreveCom, String ehFeitoDe) {
        super(escreveCom, ehFeitoDe);
    }

    @Override
    public void escrever() {
        System.out.println("Escrevendo com " + this.escreveCom);
    }
}
