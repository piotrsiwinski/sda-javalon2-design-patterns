package pl.sda.londyn.strategia.graStaw.klient;

import pl.sda.londyn.strategia.graStaw.kwakanie.Kwacz;
import pl.sda.londyn.strategia.graStaw.latanie.LatamBoMamSkrzydla;

public class DzikaKaczka extends Kaczka {


    public DzikaKaczka() {
        ustawKwakanie(new Kwacz());
        ustawLatanie(new LatamBoMamSkrzydla());
    }

    @Override
    public void wyswietl() {
        System.out.println("Jestem dzika kaczka");
        this.wykonajKwakanie();
        this.wykonajLatanie();
    }
}
