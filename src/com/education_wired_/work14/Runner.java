package com.education_wired_.work14;

import java.util.Arrays;
import java.util.Scanner;

public class Runner {
    public void run( ) throws CloneNotSupportedException, ClassNotFoundException {

        System.out.println("---parse---");
        Shape[] shapes = createShapes();
        infoShapes(shapes);
        infoShapes(createShpesByScanner());
    }

    public  Shape[] createShapes(){
        return new Shape[] {
            Shape.parseShape("Triangle:RED:12:13:12"),
            Shape.parseShape("cirCle:graY:10"),
            Shape.parseShape("ReCtanGle :Orange:3:12"),
        };
    }

    public  void infoShapes(Shape[] shapes){
        for (Shape shape: shapes){
            shape.draw();

        }
    }

    public Shape[] createShpesByScanner(){
        Scanner sc = new Scanner(System.in);
        System.out.print("set count Shapes -> ");
        int count = sc.nextInt();
        Shape shapes[] = new Shape[count];
        while (count > 0){
            Scanner scshape = new Scanner(System.in);
            System.out.print("set shape String -> ");
            shapes[--count] = Shape.parseShape(scshape.next());
        }

        return shapes;
    }
}
