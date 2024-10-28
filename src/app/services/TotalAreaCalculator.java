package app.services;

public class TotalAreaCalculator {

    public double fromArray(GeometricFigure[] figuresArr){

        double area = 0;
        for (GeometricFigure geometricFigure : figuresArr) {
            area += geometricFigure.getArea();
        }

        return area;
    }

}
