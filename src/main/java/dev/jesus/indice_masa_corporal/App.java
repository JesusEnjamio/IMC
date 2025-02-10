package dev.jesus.indice_masa_corporal;
import java.util.Locale;
import java.util.Scanner;

public final class App {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);  

        System.out.print("Ingrese su peso en kg: ");
        double peso = scanner.nextDouble();

        System.out.print("Ingrese su estatura en metros: ");
        double estatura = scanner.nextDouble();

        try {
            double imc = CalcularIndiceMasaCorporal.calcularIMC(peso, estatura);
            String categoria = CalcularIndiceMasaCorporal.clasificarIMC(imc);

            System.out.println("Su IMC es: " + imc);
            System.out.println("Clasificación: " + categoria);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}
