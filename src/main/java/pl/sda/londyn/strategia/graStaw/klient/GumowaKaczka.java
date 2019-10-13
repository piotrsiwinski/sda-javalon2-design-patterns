package pl.sda.londyn.strategia.graStaw.klient;

import pl.sda.londyn.strategia.graStaw.kwakanie.Piszczenie;
import pl.sda.londyn.strategia.graStaw.latanie.NieLatam;

public class GumowaKaczka extends Kaczka {

    // w konstruktorze wybieramy strategie
    // metody ustawKwakanie i ustawLatanie
    // są protected, wiec mamy dostep w klasie pochodnej
    // a nie mamy dostepu poza tą klasą
    public GumowaKaczka() {
        ustawKwakanie(new Piszczenie());
        ustawLatanie(new NieLatam());
    }

    @Override
    public void wyswietl() {
        System.out.println("Jestem gumowa kaczka");
        wykonajKwakanie();
        this.wykonajLatanie();
    }
}
