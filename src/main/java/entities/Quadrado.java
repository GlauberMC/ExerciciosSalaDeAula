package entities;

public class Quadrado implements FiguraGeometrica{

    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double getLado(){
        return lado;
    }

    public double calcularArea(){
        return Math.pow(this.lado,2);
    }

    public double calcularPerimetro(){
        return 4 * this.lado;
    }

    @Override
    public String toString() {
        return String.format("Á área do quadrado é: %.3f e o perímetro do quadrado é: %.3f ", this.calcularArea(), this.calcularPerimetro());
    }
}
