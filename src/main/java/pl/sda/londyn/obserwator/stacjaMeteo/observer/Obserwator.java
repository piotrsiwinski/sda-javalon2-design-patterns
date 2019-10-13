package pl.sda.londyn.obserwator.stacjaMeteo.observer;
// ten interfejs beda implementowac obserwatorzy, obiekty, ktore chca otrzymywac powiadomienia
// tzw subskrybenci
public interface Obserwator {

    // ta metoda bedzie wywolana gdy zmieni sie temperatura
    // bedzie wywolana jako "odpowiedz", jako reakcja na zdarzenie
    // tzw. callback
    void aktualizacja(float temperatura, float wilgotnosc, float cisnienie);
}
