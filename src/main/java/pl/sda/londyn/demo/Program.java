package pl.sda.londyn.demo;

import pl.sda.londyn.oop.Pracownik;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {

    public static void main(String[] args) {
        Pracownik prezes = new Pracownik();

        prezes.setPensja(3000);

        Pracownik ksiegowa = new Pracownik();
        ksiegowa.setPensja(-2000);
    }
}
