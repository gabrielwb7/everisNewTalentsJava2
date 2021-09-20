package com.desafios.introprogramacaojava;

import java.util.Scanner;

public class ConversaoTempo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int seconds;
        seconds = input.nextInt();

        int hour = 0;
        int minutes;

        hour = (seconds / 3600);
        minutes = ((seconds - (hour * 3600)) / 60);
        seconds = (seconds % 60);

        System.out.println(hour+":"+minutes+ ":"+seconds);
    }
}