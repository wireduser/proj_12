package com.education_wired_.work14;

import java.util.Arrays;

public class Runner {
    public void run( ) throws CloneNotSupportedException{

        System.out.println("---parse---");
        Shape[] shapes = createShapes();
        infoShapes(shapes);
    }

    public  Shape[] createShapes(){
        return new Shape[] {
            Shape.parseShape("Triangle:RED:12:13:12"),
        };
    }

    public  void infoShapes(Shape[] shapes){
        for (Shape shape: shapes){
            shape.draw();

        }
    }

    public   double areaShapes( Shape[] shapes){
        double area = 0;
        for (Shape shape: shapes){
            area += shape.calcArea();
        }
        return area;
    }

    public   double areaShapes( Shape[] shapes, String shapeName){
        double area = 0;

        for (Shape shape: shapes){
            if (shapeName.equals(shape.getClass().getSimpleName())) area += shape.calcArea();
        }
        return area;
    }

    public   double areaShapes( Shape[] shapes, Class shapeName){
        double area = 0;

        for (Shape shape: shapes){
            if (shape.getClass() == shapeName) area += shape.calcArea();
        }
        return area;
    }

    public  double[] areaShapesByObj (Shape[] shapes){
        double[] areas = new double [3];
        for (Shape shape: shapes){
            if (shape instanceof Circle) areas[0] += shape.calcArea();
            else if (shape instanceof Triangle) areas[1] += shape.calcArea();
            else if (shape instanceof Rectangle) areas[2] += shape.calcArea();
        }
        return areas;
    }

    public  void printAllAreasByObj (double[] areas){
        System.out.println("area Circle = " + areas[0]);
        System.out.println("area Triangle = " + areas[1]);
        System.out.println("area Rectangle = " + areas[2]);
    }



}
