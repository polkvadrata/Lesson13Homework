package app;

import app.models.Circle;
import app.models.Square;
import app.models.Triangle;
import app.services.GeometricFigure;
import app.services.TotalAreaCalculator;

public class MainProgram {

    public static void main(String[] args) {

        Circle circle1 = new Circle(1);
        Triangle triangle1 = new Triangle(2,3);
        Square square1 = new Square(4);

        GeometricFigure[] figuresArr = new GeometricFigure[]{circle1,triangle1,square1};

        TotalAreaCalculator totalArea = new TotalAreaCalculator();

        System.out.println(totalArea.fromArray(figuresArr));

    }

}
