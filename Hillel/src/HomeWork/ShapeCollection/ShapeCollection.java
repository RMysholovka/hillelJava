package HomeWork.ShapeCollection;

import HomeWork.HierarchyOfColors.*;
import HomeWork.HierarchyOfShapes.*;

import java.util.Scanner;

/**
 * Created by ${Roman} on 14.10.2015.
 */

public class ShapeCollection {

    private Shape[] shapes = new Shape[10];
    private int size = 0;


    public int size() {
        return size;
    }

    public boolean add(Shape o) {
        boolean flag = false;
        if (size() < shapes.length) {
            shapes[size] = o;
            size++;
            flag = true;
        } else {
            resize();
            shapes[size] = o;
            size++;
            flag = true;
        }
        return flag;
    }

    public void resize() {
        Shape[] newElements = new Shape[shapes.length * 2];
        for (int i = 0; i < shapes.length; i++) {
            newElements[i] = shapes[i];
        }
        shapes = newElements;
    }

    public boolean remove(Shape o) {
        boolean flag = false;
        for (int i = 0; i < size; i++) {
            if (o.equals(shapes[i])) {
                for (int j = i; j < size - 1; j++) {
                    shapes[j] = shapes[j + 1];
                }
                size--;
                flag = true;
            }
        }
        return flag;
    }


    public void print() {
        System.out.println("Shapes collection: ");
        for (int i = 0; i < size; i++) {
            System.out.println(shapes[i] + "\n");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Pleas enter color: " + " and next param: ");
        RedPaint red = new RedPaint(scanner.next(), scanner.nextInt());*/

        RedPaint red = new RedPaint("Red", 6);
        BluePaint blue = new BluePaint("Blue", 3);
        GreenPaint green = new GreenPaint("Green", 2);
        YellowPaint yellow = new YellowPaint("Yellow", 5);
        BlackPaint black = new BlackPaint("Black", 4);

        Circle circle = new Circle("Circle", red, 7);
        Square square = new Square("Square", blue, 4);
        Triangle triangle = new Triangle("Triangle", yellow, 4, 6, 45);
        Parallelogram parallelogram = new Parallelogram("Parallelogram", green, 8, 5, 15);
        Rectangle rectangle = new Rectangle("Rectangle", black, 15, 10);

        ShapeCollection shapes = new ShapeCollection();

        shapes.add(circle);
        shapes.add(square);
        shapes.add(triangle);
        shapes.add(parallelogram);
        shapes.add(rectangle);

        shapes.print();


    }
}