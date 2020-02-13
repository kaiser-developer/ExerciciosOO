package Exercicio02;

public class Exercicio02 {
    public static void main(String[] args) {
        Triangulo triangulo1 = new Triangulo(8, 6.4);
        Triangulo triangulo2 = new Triangulo(10, 3.6);
        Triangulo triangulo3 = new Triangulo(20, 15);

        System.out.println("A area do triangulo 1 é igual á: " + triangulo1.area());
        System.out.println("A area do triangulo 2 é igual á: " + triangulo2.area());
        System.out.println("A area do triangulo 3 é igual á: " + triangulo3.area());
    }
}
