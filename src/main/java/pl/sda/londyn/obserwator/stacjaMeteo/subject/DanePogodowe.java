package pl.sda.londyn.obserwator.stacjaMeteo.subject;

import pl.sda.londyn.obserwator.stacjaMeteo.observer.Obserwator;

import java.util.ArrayList;
import java.util.List;

public class DanePogodowe implements Podmiot {
    private List<Obserwator> obserwatorzy = new ArrayList<>();
    private float temperatura;
    private float wilgotnosc;
    private float cisnienie;


    @Override
    public void zarejestrujObserwatora(Obserwator obs) {
        obserwatorzy.add(obs);
    }

    @Override
    public void usunObserwatora(Obserwator obs) {
        obserwatorzy.remove(obs);

        // 2 wersja, alternatywna
        // metoda indexOf zwroci pozycje elementu na liscie
        // badz -1 jesli elementu nie ma na liscie
//        int index = obserwatorzy.indexOf(obs);
//        if (index >=0){
//            obserwatorzy.remove(index);
//        }
    }

    @Override
    public void powiadomObserwatorow() {
        for (Obserwator o : obserwatorzy) {
            o.aktualizacja(temperatura, wilgotnosc, cisnienie);
        }
    }


    // ta metoda odpowiada za zmiane stanu temperatury
    // tutaj dokonuje sie zmiana wartosci obiektu
    // !! Nalezy powiadomic wszystkich obserwatorow o zmianie!!!!
    public void ustawOdczyty(float temperatura, float wilgotnosc, float cis) {
        this.temperatura = temperatura;
        this.wilgotnosc = wilgotnosc;
        cisnienie = cis;

        // najpierw zapisujemy nowe wartosci w polach
        // powiadamiamyObserwatorow o zmianie
        powiadomObserwatorow();

    }
}