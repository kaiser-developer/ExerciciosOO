package Exercicio05;

public class PenaMosquito extends Forma implements Escrevem {
    public PenaMosquito(String escreveCom, String ehFeitoDe) {
        super(escreveCom, ehFeitoDe);
    }

    @Override
    public void escrever() {
        System.out.println("Escrevendo com " + this.escreveCom);
    }
}
