package by.bsu.lab3c.action;

import by.bsu.lab3c.entity.Quadrilateral;
import static by.bsu.lab3c.util.Util.calculateDistance;

public class QuadrilateralOperator {
    public double perimeter(Quadrilateral quadrilateral) {
        return calculateDistance(quadrilateral.getA(), quadrilateral.getB()) +
                calculateDistance(quadrilateral.getB(), quadrilateral.getC()) +
                calculateDistance(quadrilateral.getC(), quadrilateral.getD()) +
                calculateDistance(quadrilateral.getA(), quadrilateral.getD());
    }

    public double area(Quadrilateral quadrilateral) {
        double ab = calculateDistance(quadrilateral.getA(), quadrilateral.getB());
        double bc = calculateDistance(quadrilateral.getB(), quadrilateral.getC());
        double cd = calculateDistance(quadrilateral.getC(), quadrilateral.getD());
        double ad = calculateDistance(quadrilateral.getA(), quadrilateral.getD());
        double halfOfPerimeter = perimeter(quadrilateral) / 2;
        return Math.sqrt(halfOfPerimeter * (halfOfPerimeter - ab) * (halfOfPerimeter - bc) * (halfOfPerimeter - cd) * (halfOfPerimeter - ad));
    }
}
