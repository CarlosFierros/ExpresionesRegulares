package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String regexHolaMundo= "\\bHola mundo\\b";
        String regexHolaMundocualquier = "(?i)\\bHola mundo\\b";
        String regexLenguaje = "\\b(Java|Python|Go|Pascal|Perl)\\b";
        String regexUnisonCorreo = "[a-zA-Z0-9._%+-]+@(unison|uson)\\.mx";
        String regexNombreArchivo = "^ISI\\d{4}-[12]\\.(txt|csv)$";


        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa una cadena:");
        String input = scanner.nextLine();


        if (input.matches(regexHolaMundo)) {
            System.out.println("La cadena coincide con 'Hola mundo'.");
        }

        if (input.matches(regexHolaMundocualquier)) {
            System.out.println("La cadena coincide con 'Hola mundo' en mayúsculas y minúsculas.");
        }

        if (input.matches(regexLenguaje)) {
            System.out.println("La cadena es de la lista: Java, Python, Go, Pascal, Perl.");
        }

        if (input.matches(regexUnisonCorreo)) {
            System.out.println("La cadena es un correo de la Universidad de Sonora.");
        }

        if (input.matches(regexNombreArchivo)) {
            System.out.println("La cadena es un archivo.");
        }
        
        if (!input.matches(regexHolaMundo) &&
                !input.matches(regexHolaMundocualquier) &&
                !input.matches(regexLenguaje) &&
                !input.matches(regexUnisonCorreo) &&
                !input.matches(regexNombreArchivo)) {
            System.out.println("La cadena no es ninguna expresion regular almacenada.");
        }
    }
}