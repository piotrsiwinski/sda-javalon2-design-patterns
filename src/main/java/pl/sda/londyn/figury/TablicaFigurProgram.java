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




    }
}
