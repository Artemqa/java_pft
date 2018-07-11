package ru.stqa.pft.sandbox;

public class Point {

    public double a;
    public double b;
    public double c;
    public double d;

    public Point(double a, double b, double c, double d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public double distance() {
        return Math.sqrt(Math.pow((b - a), 2) + Math.pow((d - c), 2));
        //return Math.sqrt(Math.pow(Double.parseDouble(String.valueOf(b-a)),2)+
                //(Math.pow(Double.parseDouble(String.valueOf(d-c)),2)));
    }
}
