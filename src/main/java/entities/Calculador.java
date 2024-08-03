package entities;

public class Calculador {

    public static String maiorValorArea(FiguraGeometrica figura01, FiguraGeometrica figura02) {
        if(figura01.calcularArea() > figura02.calcularArea()){
            return String.format("A área maior é a do círculo com área igual a %.3f ", figura01.calcularArea());
        } else {
            return String.format("A área maior é a do quadrado com área igual a %.3f ", figura02.calcularArea());
        }
    }
}
