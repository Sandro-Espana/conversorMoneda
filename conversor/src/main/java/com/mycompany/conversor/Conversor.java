package com.mycompany.conversor;

import java.util.Scanner;

public class Conversor {

    public static void main(String[] args) {
        while (true) {
            System.out.println("CONVEROR DE MONEDAS");
            System.out.println("1 - Pesos Colombianos a Dolares ");
            System.out.println("2 - Pesos Colombianos a Reales");
            System.out.println("3 - Pesos Colombianos a Soles");
            System.out.println("4 - Salir");
            System.out.println("INGRESE UNA OPCION");
            System.out.println("Esto esta mejorando");
            Scanner leer = new Scanner(System.in);
            char opcion = leer.next().charAt(0);

            switch (opcion) {
                case 1:
                    convertir(3.58, "Dolares");
                    break;
                case 2:
                    convertir(2.18, "Soles peruanos");
                    break;
                case 3:
                    convertir(4.58, "Reales");
                    break;
                case 4:
                    System.out.println("CERRANDO PROGRAMA");
                    break;
                default:
                    System.out.println("OPCION INCORRECTA");
                    break;
                    
            }
        }
    }

    static void convertir(double valorDolar, String pais) {
        Scanner leer = new Scanner(System.in);
        System.out.printf("Ingrese la cantidad de %s :", pais);
        double cantidadMoneda = leer.nextDouble();

        double dolares = cantidadMoneda / valorDolar;

        dolares = (double) Math.round(dolares * 100d) / 100;
        
        System.out.println("---------------------------------------");
        System.out.println("|     Tienes $ " + dolares + " Dolares  |");
        System.out.println("---------------------------------------");
    }
}
