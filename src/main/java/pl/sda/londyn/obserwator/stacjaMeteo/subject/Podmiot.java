package pl.sda.londyn.obserwator.stacjaMeteo.subject;

import pl.sda.londyn.obserwator.stacjaMeteo.observer.Obserwator;

// Interfejs podmiot, czesto okreslany jako Observable
// ten interfejs będą implementowac klasy, ktore udostepniaja informacje o sobie
// te, ktore pozwalaja sie obserwowac
public interface Podmiot {
    void zarejestrujObserwatora(Obserwator obs);
    void usunObserwatora(Obserwator obs);
    void powiadomObserwatorow();

}
