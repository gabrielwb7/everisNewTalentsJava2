package com.desafios.primeirosdesafiojava;

import java.util.Locale;
import java.util.Scanner;

public class ValidacaoNota {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        float primeiraNota = scan.nextFloat();
        while (validaNota(primeiraNota) == false) {

            System.out.println("nota invalida");
            primeiraNota = scan.nextFloat();
        }

        float segundaNota = scan.nextFloat();
        while (validaNota(segundaNota) == false) {

            System.out.println("nota invalida");
            segundaNota = scan.nextFloat();
        }

        if (validaNota(primeiraNota) && validaNota(segundaNota)) {
            media(primeiraNota,segundaNota);
        }

    }

    private static void media(float primeiraNota, float segundaNota) {

        float media = (primeiraNota + segundaNota)/2;
        String resultado = String.format("%.2f", media);
        System.out.println("media = " + resultado);

    }

    private static boolean validaNota(float nota) {
        return nota >= 0 && nota <= 10;
    }
}
