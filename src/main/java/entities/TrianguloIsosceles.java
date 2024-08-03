package entities;

public class TrianguloIsosceles implements FiguraGeometrica{

    private double base, lado, altura;

    public TrianguloIsosceles(double base, double lado, double altura) {
        this.base = base;
        this.lado = lado;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (this.base * this.altura) / 2;
    }

    @Override
    public double calcularPerimetro() {
        return this.base + 2 * (lado);
    }

    @Override
    public String toString() {
        return String.format("Á área do triângulo é: %.3f e o perímetro do triangulo é: %.3f ", this.calcularArea(), this.calcularPerimetro());
    }
}
