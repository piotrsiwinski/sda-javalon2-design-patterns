package pl.sda.londyn.figury;

import pl.sda.londyn.fabryka.FabrykaFigur;

import java.util.Scanner;

// nowa wersja programu z figurami
// korzystajaca z wzorca fabryki
public class ProgramZFabryka {
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
        Figura mojaFig = FabrykaFigur.stworzFigure(wybor);

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
