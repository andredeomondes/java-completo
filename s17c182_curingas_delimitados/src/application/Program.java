package application;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        System.out.println("Generics Delimitados");

        List<Shape> myShapes = new ArrayList<>();
        myShapes.add(new Rectangle(3.0, 2.0));
        myShapes.add(new Circle(2.0));

        List<Circle> myCircles = new ArrayList<>();
        myCircles.add(new Circle(2.0));
        myCircles.add(new Circle(3.0));


        System.out.println("Total area (shapes): " + String.format("%.2f", totalArea(myShapes)));
        System.out.println("Total area (circles): " + String.format("%.2f", totalArea(myCircles)));
    }

    // Metodo que calcula a área total de uma lista de formas
    public static double totalArea(List <? extends Shape> list) { // Uso de curinga delimitado
        double sum = 0.0;
        for (Shape s : list) {
            sum += s.area();
        }
        return sum;
    }
}
