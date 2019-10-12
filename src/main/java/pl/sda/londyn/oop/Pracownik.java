package pl.sda.londyn.oop;


public class Pracownik {

    String imie;
    private double pensja;

    public double getPensja() {
        return this.pensja;
    }


    public void setPensja(double value) {
        if (value < 0) {
            throw new RuntimeException("pensja nie moze byc ujemna");
        } else {
            pensja = value;
        }
    }

}
