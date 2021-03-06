package com.education_wired_.work14;



public abstract class Shape implements Drawable, Comparable, Cloneable{
    private String color ;
    public abstract double calcArea();

    public String getColor() {
        return color;
    }

    public Shape() {
    }

    public Shape(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "class = " + this.getClass().getSimpleName()+ ": color = " + color;
    }

    @Override
    public void draw() {
        System.out.println(this + " -> area =  " + this.calcArea());
    }

    @Override
    public int compareTo(Object o) {
        //return (int)(this.calcArea()-((Shape)o).calcArea());
        return Double.compare(this.calcArea(),((Shape)o).calcArea());

    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Shape shape = (Shape)super.clone();
        shape.color = new String(this.color);
        return shape;
    }

    public static Shape parseShape(String strShape){
        String[] shapeArgs = strShape.split(":");
        //String[] dimArgs = shapeArgs[2].split(",");
        Shape shape = null;

        switch (shapeArgs[0].toUpperCase().trim()){
            case "CIRCLE":
                //return new Circle(shapeArgs[1],Integer.parseInt(shapeArgs[2]));
                shape = Circle.parseCircle(strShape);
                break;
            case "TRIANGLE":

                //return new Triangle(shapeArgs[1],Integer.parseInt(dimArgs[0]),Integer.parseInt(dimArgs[1]),Integer.parseInt(dimArgs[2]));
                shape = Triangle.parseTriangle(strShape);
                break;
            case "RECTANGLE":
                //return new Rectangle(shapeArgs[1],Integer.parseInt(dimArgs[0]),Integer.parseInt(dimArgs[1]));
                shape = Rectangle.parseRectangle(strShape);
                break;
        }
        return shape;
    }
}
