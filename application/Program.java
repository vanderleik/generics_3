package application;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Rectangle> myRectangle = new ArrayList<>();
        myRectangle.add(new Rectangle(3.0, 2.0));

        List<Circle> myCircle = new ArrayList<>();
        myCircle.add(new Circle(2.0));

        System.out.printf("Circle total area: %.2f", totalArea(myCircle));
        System.out.println();
        System.out.println("Rectangle total area: " + totalArea(myRectangle));
    }

    private static double totalArea(List<? extends Shape> list) {
        double sum = 0.0;
        for (Shape s : list) {
            sum +=s.area();
        }
        return sum;
    }

}
