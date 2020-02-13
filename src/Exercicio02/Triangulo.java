package Exercicio02;

public class Triangulo {
    private double altura;
    private double base;

    public Triangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    public double area(){
        return (this.altura * this.base)/2;
    }

    public double getAltura() {
        return altura;
    }

    public double getBase() {
        return base;
    }
}
