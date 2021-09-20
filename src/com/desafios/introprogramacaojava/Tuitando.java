package com.desafios.introprogramacaojava;

import java.io.IOException;
import java.util.Scanner;

public class Tuitando {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        String tweet = leitor.nextLine();
        System.out.println(tweet.length() > 140 ? "MUTE" : "TWEET");
    }

}