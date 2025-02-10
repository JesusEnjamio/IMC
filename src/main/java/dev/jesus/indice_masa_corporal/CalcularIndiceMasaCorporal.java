package dev.jesus.indice_masa_corporal;

public class CalcularIndiceMasaCorporal {
    public static double calcularIMC(double peso, double estatura) {
        if (peso <= 0 || estatura <= 0) {
            throw new IllegalArgumentException("Peso y estatura deben ser mayores a cero.");
        }
        return peso / Math.pow(estatura, 2);
    }


}
