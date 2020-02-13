package Exercicio05;

public class Exercicio05 {
    public static void main(String[] args) {
        Caneta caneta = new Caneta("Tinta Preta", "Plastico");
        Lapis lapis = new Lapis("Grafite", "Madeira");
        PenaMosquito penaMosquito = new PenaMosquito("Tinta", "Pena");

        penaMosquito.escrever();
        caneta.escrever();
        lapis.escrever();
    }

}
