package application;

import entities.Calculador;
import entities.Circulo;
import entities.Quadrado;
import entities.TrianguloIsosceles;

public class Main {
    public static void main(String[] args) {

        Circulo circulo = new Circulo(2.75);
        System.out.println(circulo);

        Quadrado quadrado = new Quadrado(4);
        System.out.println(quadrado);

        TrianguloIsosceles triangulo = new TrianguloIsosceles(5, 4, 2);
        System.out.println(triangulo);

        System.out.println(Calculador.maiorValorArea(circulo, triangulo));
    }
}
