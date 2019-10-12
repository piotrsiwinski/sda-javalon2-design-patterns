package pl.sda.londyn.figury;

import java.util.Scanner;

public class Program {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // przyklad polimorfizmu
        System.out.println("Wybierz figure:");
        System.out.println("1. Kwadrat");
        System.out.println("2. Prostokat");
        System.out.println("3. Kolo");

        int wybor = scanner.nextInt();


        // w switchu podejmujemy decyzję jaką figurę wykorzystac
        // pod referencje mojaFig typu Figura podstawiamy konkretny obiekt w zaleznosci od wyboru uzytkownika
        // decyzje o utworzeniu konkretnego typu podejmujemy dopiero w trakcie dzialania programu
        // w zaleznosci od wyboru uzytkownika, referencja "mojaFig" moze przyjac 1 z 3 roznych postaci
        // przyklad polimorfizmu
        Figura mojaFig = null;
        switch (wybor) {
            case 1: {
                System.out.println("Podaj bok kwadratu: ");
                double bok = scanner.nextDouble();
                mojaFig = new Kwadrat(bok);
                break;
            }
            case 2: {
                System.out.println("Podaj boki prostokata");
                double bokA = scanner.nextDouble();
                double bokB = scanner.nextDouble();
                mojaFig = new Prostokat(bokA, bokB);
                break;
            }
            case 3: {
                System.out.println("Podaj promien okregu: ");
                double promien = scanner.nextDouble();
                mojaFig = new Kolo(promien);
                break;
            }
            default: {
                System.out.println("Zly wybor");
            }
        }

        if (mojaFig != null) {

            System.out.println("Wykonuje obliczenia.....");
            double pole = mojaFig.obliczPole();
            double obwod = mojaFig.obliczObwod();

            System.out.println("Pole to: " + pole);
            System.out.println("Obwod to: " + obwod);
        }








           /* Podstawowe uzycie
        Kwadrat k = new Kwadrat(3);
        Prostokat p = new Prostokat(4,2);
        Kolo maleKolo = new Kolo(5);


        double poleKwadratu = k.obliczPole();
        double obwodKwadratu = k.obliczObwod();

        System.out.println(poleKwadratu);
        System.out.println(obwodKwadratu);


        double poleProstokata = p.obliczPole();
        double obwodProstokata = p.obliczObwod();

        System.out.println(poleProstokata);
        System.out.println(obwodProstokata);
*/
    }
}
