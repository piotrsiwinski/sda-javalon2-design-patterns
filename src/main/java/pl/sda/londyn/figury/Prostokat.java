package pl.sda.londyn.figury;

public class Prostokat extends Figura {

    private double bokA;
    private double bokB;

    public Prostokat(double bokA, double bokB) {
        this.bokA = bokA;
        this.bokB = bokB;
    }

    @Override
    public double obliczPole() {
        return bokA * bokB;
    }

    @Override
    public double obliczObwod() {
        return 2 * bokA + 2 * bokB;
    }
}
