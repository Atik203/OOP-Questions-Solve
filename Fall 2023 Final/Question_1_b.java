interface Shape {
    public double getArea();
}

class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }
}

class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }
}

class ShapeTest{

    public static void draw(Shape s){
        System.out.println("Drawing over: " + s.getArea() + " area");
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle(5, 6);
        Square s = new Square(3);
        draw(r);
        draw(s);
    }
}