package pl.sda.londyn.figury;

public class TablicaFigurProgram {

    public static void main(String[] args) {
        // Przyklad polimorfizmu, gdzie wykorzystujemy tablicę typu abstrakcyjnego
        // a kazdy element tej tablicy to inny obiekt typu figura
        // np w tablica[0] jest kwadrat
        // w tablica[1] jest kolo
        // w tablica[2] jest prostokat
        // itd itd

        // w tym celu zdefiniuj kilka obiektow typu kolo, prostokat i kwadrat
        // umiesc je w tablicy
        // i w petli for each przeiteruj przez kolekcję figur
        // wyswietlajac ich pola i obwody

        // zwroc uwage, ze 1 obiekt to figura, drugi kolo
        // ZAWSZE pod typ bazowy (Figura) mozna podstawic typ pochodny
        // Prawidlowy jest zapis:  Figura k1 = new Kolo(2);
        // BŁĄÐ: Kolo mojeKolo = new Figura();  pod typ pochodny nie mozna podstawic typu bazowego


        Figura k1 = new Kolo(2);
        Kolo k2 = new Kolo(5);

        Figura p1 = new Prostokat(44, 12);
        Prostokat p2 = new Prostokat(13, 16);

        Figura kw1 = new Kwadrat(3);
        Kwadrat kw2 = new Kwadrat(20);


        // tworzymy 6-elementowa tablice Figur
        Figura[] mojeFigury = new Figura[6];

        // wstawiamy figury do tablicy
        mojeFigury[0] = k1;
        mojeFigury[1] = k2;
        mojeFigury[2] = p1;
        mojeFigury[3] = p2;
        mojeFigury[4] = kw1;
        mojeFigury[5] = kw2;


        // iterujemy przez tablice figur
        // zwroc uwage, ze uzywam typu bazowego, czyli figura
        // dzieki polimorizmowi podczas iteracji w petli nie ma znaczenia, czy f to kwadrat, kolo, prostokat
        // wazne, ze kazda figura ma metode obliczPole i obliczObwod
        for (Figura f : mojeFigury) {
            System.out.println(f);
            System.out.println("Pole to: " + f.obliczPole());
            System.out.println("Obwod to: " + f.obliczObwod());
            System.out.println();
            System.out.println();
        }


    }
}
