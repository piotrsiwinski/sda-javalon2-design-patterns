package pl.sda.londyn.fabryka;

import pl.sda.londyn.figury.Figura;
import pl.sda.londyn.figury.Kolo;
import pl.sda.londyn.figury.Kwadrat;
import pl.sda.londyn.figury.Prostokat;

import java.util.Scanner;

public class FabrykaFigur {
    private static Scanner scanner = new Scanner(System.in);

    // typem zwracanym bedzie typ abstarkcyjny "Figura"
    // fabryka musi miec jakis parametr wejsciowy
    // na podstawie ktorego bedzie wiedziec jaki obiekt zwrocic
    // jaki obiekt najbardziej bedzie pasowac do danego zadania
    public static Figura stworzFigure(int wybor) {
        switch (wybor) {
            case 1:
                System.out.println("Podaj bok kwadratu: ");
                double bok = scanner.nextDouble();
                return new Kwadrat(bok);
            case 2:
                System.out.println("Podaj boki prostokata");
                double bokA = scanner.nextDouble();
                double bokB = scanner.nextDouble();
                return new Prostokat(bokA, bokB);
            case 3:
                System.out.println("Podaj promien okregu: ");
                double promien = scanner.nextDouble();
                return new Kolo(promien);
            default:
                return null;
        }

    }

}
