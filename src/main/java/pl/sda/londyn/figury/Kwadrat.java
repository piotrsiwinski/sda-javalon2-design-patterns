package pl.sda.londyn.figury;

public class Kwadrat extends Figura {

    // definiujemy 1 pole okreslające BOK
    private double bokA;


    // konstruktor 1 parametrowy
    public Kwadrat(double bokA) {
        this.bokA = bokA;
    }


    // metody z nadklasy, metody z klasy abstrakcyjnej
    @Override
    public double obliczPole() {
        return Math.pow(bokA, 2);
    }

    @Override
    public double obliczObwod() {
        return 4 * bokA;
    }

    @Override
    public String toString() {
        return "Kwadrat{" +
                "bokA=" + bokA +
                '}';
    }
}
