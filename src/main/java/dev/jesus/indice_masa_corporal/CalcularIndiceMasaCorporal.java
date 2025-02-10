package dev.jesus.indice_masa_corporal;

public class CalcularIndiceMasaCorporal {
    public static double calcularIMC(double peso, double estatura) {
        if (peso <= 0 || estatura <= 0) {
            throw new IllegalArgumentException("Peso y estatura deben ser mayores a cero.");
        }
        return peso / Math.pow(estatura, 2);
    }

    public static String clasificarIMC(double imc) {
        if (imc < 16) {
            return "Delgadez severa";
        } else if (imc < 17) {
            return "Delgadez moderada";
        } else if (imc < 18.5) {
            return "Delgadez leve";
        } else if (imc < 25) {
            return "Peso normal";
        } else if (imc < 30) {
            return "Sobrepeso";
        } else if (imc < 35) {
            return "Obesidad leve";
        } else if (imc < 40) {
            return "Obesidad moderada";
        } else {
            return "Obesidad mórbida";
        }
    }


}
