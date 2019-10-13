package pl.sda.londyn.obserwator.stacjaMeteo;

import pl.sda.londyn.obserwator.stacjaMeteo.observer.WarunkiBiezaceWyswietl;
import pl.sda.londyn.obserwator.stacjaMeteo.subject.DanePogodowe;

public class StacjaMeteoProgram {
    public static void main(String[] args) throws InterruptedException {
        // tworzymy obiekt obserwowany
        DanePogodowe dane = new DanePogodowe();

        // tworzymy obserwatora
        // jako parametr konstruktora podajemy nasz podmiot
        // czyli to co checemy, zeby obserwator obserwowal
        // w konstruktorze klasy WarunkiBiezaceWyswietl
        // wywolujemy metodę zarejestrujObserwatora
        // w ten sposob podmiot wie kogo powiadamiac
        // tworzy sie powiazanie miedzy tymi 2 obiektami
        // wstrzykujemy obiekt dane do obiektu obserwator
        WarunkiBiezaceWyswietl obserwator = new WarunkiBiezaceWyswietl(dane);


        // zmieniamy temperature....

        dane.ustawOdczyty(10.4f, 30, 900);
        Thread.sleep(5000);
        dane.ustawOdczyty(19.4f, 50, 920);


        Thread.sleep(3000);

        dane.ustawOdczyty(19.4f, 50, 920);

    }
}
