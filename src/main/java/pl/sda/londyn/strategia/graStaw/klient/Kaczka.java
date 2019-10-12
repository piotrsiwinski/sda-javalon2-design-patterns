package pl.sda.londyn.strategia.graStaw.klient;

import pl.sda.londyn.strategia.graStaw.kwakanie.Kwakanie;
import pl.sda.londyn.strategia.graStaw.latanie.Latanie;

public abstract class Kaczka {


    // mowimy, ze kaczka implementuje 2 algorytmy (1 dla kwakania, drugi dla latania)

    private Kwakanie kwakanie;
    private Latanie latanie;


    // wywolanie algorytmu kwakania
    public void wykonajKwakanie() {
        kwakanie.kwacz();
    }

    // wywolanie algorytmu latania
    public void wykonajLatanie() {
        latanie.lec();
    }

    // ustawiamy widocznosc na protected
    // tak, abysmy mogli w podklasach (Np gumowa kaczka)
    // ustawic ktore implementacje algorytmow wybieramy
    // i protected, po to, bysmy mogli robic to tylko w podklasach
    // aby uniknac opcji, ze programista na zewnatrz zmienia strategie kaczki
    // protected daje nam to, ze programista w "mainie" nie bedize mogl sprawic, ze gumowa kaczka lata
    protected void ustawLatanie(Latanie latanie) {
        this.latanie = latanie;
    }

    protected void ustawKwakanie(Kwakanie kwakanie) {
        this.kwakanie = kwakanie;
    }

    public abstract void wyswietl();


}
