package by.bsu.lab3c._main;

import by.bsu.lab3c.action.QuadrilateralOperator;
import by.bsu.lab3c.entity.Quadrilateral;

import java.awt.*;


public class Main {
    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(0, 5);
        Point c = new Point(5, 5);
        Point d = new Point(5, 0);
        Quadrilateral square = new Quadrilateral(a, c, c, d);
        Quadrilateral noll =new Quadrilateral(new Point(0,0),new Point(0,0),new Point(0,0),new Point(0,0));

        System.out.println(square);
        QuadrilateralOperator operator = new QuadrilateralOperator();
        System.out.println("P = " + operator.perimeter(square));
        System.out.println("S = " + operator.area(square));

    }
}
