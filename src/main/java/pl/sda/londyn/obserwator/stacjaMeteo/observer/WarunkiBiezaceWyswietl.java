package pl.sda.londyn.obserwator.stacjaMeteo.observer;

import pl.sda.londyn.obserwator.stacjaMeteo.subject.Podmiot;

public class WarunkiBiezaceWyswietl implements Obserwator {

    // Obiekt typu podmiot jest zaleznoscia tej klasy
    // tzn. ze ta klasa do swojego dzialnia potrzebuje obiektu typu Podmiot
    // polecana praktyka jest "wstrzykiwanie zaleznosci" przez konstruktor
    // czyli zdefiniowanie jako parametry konstruktora wszystkich typow zaleznych
    // w tym przykladku do poprawnego dzialnia potrzebujemy jedynie obiektu, ktory chcemy obserwowac (tu: Podmiot danePodogodowe)

    // w konstruktorze musimy zarejestrowac "ten" (this) obiekt jako obserwator
    public WarunkiBiezaceWyswietl(Podmiot danePogodowe) {
        // rejestracja "mnie" u podmiotu
        // rejestracja w obiekcie danePogodowe
        danePogodowe.zarejestrujObserwatora(this);

        // alternatywna wersja -  wersja mniej preferowana
//        Obserwator tenobiekt = this;
//        danePogodowe.zarejestrujObserwatora(tenobiekt);
    }


    // ta metoda to tzw "Callback"
    // kod tej metody wykona sie jako reakcja na zmiane temperatury
    // otrzymujemy powiadomienie i wykonujemy ta metode jako reakcję na zmianę

    // w tym miejscu umieszczamy logikę, ktora ma zostac wykonana jako reakcja na zdarzenie
    // np zapis do pliku, wyswietlenie informacji o zmianie w okienku, wyslanie emaila itd
    @Override
    public void aktualizacja(float temperatura, float wilgotnosc, float cisnienie) {
        System.out.println("Zmiana temperatury!! Warunki biezace: "

                + temperatura + " stopni C oraz "
                + wilgotnosc + "% wigotnosci");
    }
}
