package by.bsu.lab3c.entity;

import java.awt.*;

import by.bsu.lab3c.util.Util;

import static by.bsu.lab3c.util.Util.calculateDistance;


public class Quadrilateral {
    private Point a;
    private Point b;
    private Point c;
    private Point d;

    public Quadrilateral() {
    }

    public Quadrilateral(Point a, Point b, Point c, Point d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public Point getC() {
        return c;
    }

    public void setC(Point c) {
        this.c = c;
    }

    public Point getD() {
        return d;
    }

    public void setD(Point d) {
        this.d = d;
    }

    @Override
    public String toString() {
        return "Quadrilateral{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", d=" + d +
                '}';
    }




}
