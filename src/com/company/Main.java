package com.company;

import java.util.Scanner;

/**
 * Temat: Rozwiązywanie równań pierwszego, drugiego i trzeciego stopnia. Implementacja  w języku Java.
 *
 * Założenia: Program będzie pobierał od użytkownika wartości a,b,c,d po uprzednim wybraniu rodzaju funkcji, którą chce obliczyć,
 * a następnie będzie obliczać, na podstawie wzorów zawartych w programie i wyświetlać wyniki na ekranie.
 */

public class Main {

    public static void main(String[] args) {
        System.out.println("Start programu!");
        System.out.println("Podaj, który rodzaj funkcji chcesz obliczyć. (Poprzez wpisanie 1 lub 2.)");
        System.out.println("1)Liniowa");
        System.out.println("2)Kwadratowa");
        Scanner funkcja = new Scanner(System.in);
        if (funkcja.hasNextInt()) {
            int f = funkcja.nextInt();
            if (f == 1) {
                funkcjaLiniowa();
            } else if (f == 2) {
                funkcjaKwadratowa();
            } else {
                System.out.println("Blad wyboru. Wlacz program jeszcze raz i wybierz 1 lub 2.");
            }
        } else {
            System.out.println("Blad wyboru, sprawdz swoj wybor i wlacz program ponownie.");
        }
        System.out.println("Program wykonal: Daniel Kaczorowski");
        System.out.println("Koniec programu.");
    }

    private static double funkcjaLiniowa() {
        System.out.println("Wybrałeś funkcję Liniową.");
        System.out.println("f(x)=ax+b");
        System.out.println("Proszę podać a.");
        double a, b, wynik;
        Scanner na = new Scanner(System.in);
        if (na.hasNextInt()) {
            System.out.println("");
        } else {
            System.out.println("Blad. Program dziala na liczbach.");
            return funkcjaLiniowa();
        }
        a = na.nextInt();
        System.out.println("Proszę podać b.");
        Scanner nb = new Scanner(System.in);
        if (nb.hasNextInt()) {
            System.out.println("");
        } else {
            System.out.println("Blad. Program dziala na liczbach.");
            return funkcjaLiniowa();
        }
        b = nb.nextInt();
        wynik = -(b / a);

        if (a == 0) {
            System.out.println("Funkcja liniowa jest stała.");
            System.out.println("Nie posiada miejsc zerowych");
        } else if (a > 0) {
            System.out.println("Funkcja liniowa jest rosnąca.");
            System.out.println("A miejsce zerowe wynosi " + wynik);
        } else if (a < 0) {
            System.out.println("Funkcja liniowa jest malejąca");
            System.out.println("A miejsce zerowe wynosi " + wynik);
        }
        return a;
    }

    private static double funkcjaKwadratowa() {
        System.out.println("Wybrałeś funkcję kwadratową.");
        System.out.println("f(x)=ax2+bx+c");
        double a, b, c, delta, deltak, x1, x2, x0;
        System.out.println("Proszę podać a.");
        Scanner ak = new Scanner(System.in);
        if (ak.hasNextInt()) {
            System.out.println("");
        } else {
            System.out.println("Blad. Program dziala na liczbach.");
            return funkcjaKwadratowa();
        }
        a = ak.nextInt();
        System.out.println("Proszę podać b.");
        Scanner bk = new Scanner(System.in);
        if (bk.hasNextInt()) {
            System.out.println("");
        } else {
            System.out.println("Blad. Program dziala na liczbach.");
            return funkcjaKwadratowa();
        }
        b = bk.nextInt();
        System.out.println("Proszę podać c.");
        Scanner ck = new Scanner(System.in);
        if (ck.hasNextInt()) {
            System.out.println("");
        } else {
            System.out.println("Blad. Program dziala na liczbach.");
            return funkcjaKwadratowa();
        }
        c = ck.nextInt();
        delta = b * b - 4 * a * c;
        deltak = Math.sqrt(delta);
        x1 = (-b + deltak) / (2 * a);
        x2 = (-b - deltak) / (2 * a);
        x0 = -b / (2 * a);
        if (delta > 0) {
            System.out.println("Delta jest wieksza od zera. A miejsca zerowe wynosza:");
            System.out.println("x1= " + x1);
            System.out.println("x2= " + x2);
        } else if (delta == 0) {
            System.out.println("Delta jest rowna zero. A miejce zerowe wynosi:");
            System.out.println("x0 = " + x0);
        } else if (delta < 0) {
            System.out.println("Delta jest mniejsza od zera.");
            System.out.println("Nie ma rozwiązania.");
        }
        return delta;
    }
}
