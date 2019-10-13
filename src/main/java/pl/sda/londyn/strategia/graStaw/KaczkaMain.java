package pl.sda.londyn.strategia.graStaw;

import pl.sda.londyn.strategia.graStaw.klient.DzikaKaczka;
import pl.sda.londyn.strategia.graStaw.klient.GumowaKaczka;
import pl.sda.londyn.strategia.graStaw.klient.Kaczka;

public class KaczkaMain {
    public static void main(String[] args) {
        // tworzymy "klienty" typu Kaczka
        // widac, ze DzikaKaczka implementuje 2 strategie: Z Latania implementuje "LatamBoMamSkrzydla"
        // a z kwakania implementuje strategie "Kwacz"
        // wybierając kontretnego klienta (tu DzikaKaczka)
        // wybieramy klienta z konkretna strategia

        // musimy tylko wybrac odpowiedni typ z odpowiednia strategia
        Kaczka dzikaKaczka = new DzikaKaczka();
        dzikaKaczka.wyswietl();


        System.out.println("---------------------------------");

        Kaczka gumowaKaczka = new GumowaKaczka();
        gumowaKaczka.wyswietl();

    }
}
