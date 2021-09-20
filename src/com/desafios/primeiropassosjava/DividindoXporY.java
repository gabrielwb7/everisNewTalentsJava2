package com.desafios.primeiropassosjava;

import java.io.IOException;
import java.util.Scanner;

public class DividindoXporY {

    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        int N = teclado.nextInt();

        while(N <= 0) {
            N = teclado.nextInt();
        };

        int X, Y;
        for (int i = 0; i < N; i++) {
            X = teclado.nextInt();
            Y = teclado.nextInt();
            if (Y == 0) {
                System.out.println("divisao impossivel");
            }
            else {
                double divisao = (double) X/ Y;
                String resultado = String.format("%.1f", divisao);
                System.out.println(resultado);
            }
        }
    }
}
