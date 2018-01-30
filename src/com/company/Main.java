package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Įvedimas();

        System.out.println(skaiciuotuvas.suma(a,b));
        System.out.println(skaiciuotuvas.sandauga(a,b));
        System.out.println(skaiciuotuvas.skirtumas(a,b));


    }

    static int a;
    static int b;

    public static void Įvedimas() {
        System.out.println("Įveskite du skaičius");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();

    }

}
