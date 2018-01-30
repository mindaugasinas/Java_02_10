package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Iveskite du skaicius");

        float a = sc.nextFloat();
        float b = sc.nextFloat();

        System.out.println("Suma: " + Skaiciuotuvas.suma(a,b));
        System.out.println("Skirtumas: " + Skaiciuotuvas.suma(a,b));
        System.out.println("Sandauga: " + Skaiciuotuvas.suma(a,b));




    }
}
