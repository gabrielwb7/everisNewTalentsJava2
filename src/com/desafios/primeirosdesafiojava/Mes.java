package com.desafios.primeirosdesafiojava;

import java.util.Scanner;

public class Mes {

    public static void main(String[] args) {

        int month;
        Scanner input = new Scanner(System.in);
        month = input.nextInt();

        switch(month)
        {
            case 1:

                System.out.print("January\n");
                break;

            case 2:

                System.out.print("February\n");
                break;

            case 3:

                System.out.print("March\n");
                break;

            case 4:

                System.out.print("April\n");
                break;


            case 5:

                System.out.print("May\n");
                break;

            case 6:

                System.out.print("June\n");
                break;

            case 7:

                System.out.print("July\n");
                break;

            case 8:

                System.out.print("August\n");
                break;

            case 9:

                System.out.print("September\n");
                break;

            case 10:

                System.out.print("October\n");
                break;

            case 11:

                System.out.print("November\n");
                break;

            case 12:

                System.out.print("December\n");
                break;

            default:
                System.out.print("Invalid input\n");
        }
    }
}