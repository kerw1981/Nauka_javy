package main.logic;

import java.util.Scanner;

public class UnitOfLenght {

    private double y;
    private String x;
    Scanner scanner = new Scanner(System.in);

    public String getX() {
        System.out.println("wybierz działanie");
        return x=scanner.next();
    }

    public double getY() {
        System.out.println("podaj liczbę");
        return y= scanner.nextDouble();
    }

    public double obliczenia(String x, double y) {
        if (x.equalsIgnoreCase("mTocm")) {
            return y * 100;
        } else if (x.equalsIgnoreCase("mToMm")) ;
            return y * 1000;

    }


    public static void main(String[] args) {

        UnitOfLenght lenght = new UnitOfLenght();
        lenght.getX();
        lenght.getY();
        lenght.obliczenia(lenght.x, lenght.y);
    }
}


