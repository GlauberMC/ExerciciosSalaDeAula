package entities;

public class Circulo implements FiguraGeometrica {

    private double raio;

    public Circulo(double raio){

        this.raio = raio;
        System.out.printf("O raio passado foi igual a %f\n", this.raio);
    }

    public double calcularArea(){
        return  Math.PI * Math.pow(raio, 2.0);
    }

    public double calcularPerimetro(){
        return 2 * Math.PI * raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    public double getRaio(){
        return raio;
    }

    @Override
    public String toString() {
        return String.format("Área do círculo: %.3f e o Comprimento do círculo: %.3f", this.calcularArea(),  this.calcularPerimetro());
    }
}
