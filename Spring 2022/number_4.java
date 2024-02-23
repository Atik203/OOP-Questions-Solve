import java.lang.Override;

abstract class GeometricShape{
    double PI = 3.14;
    abstract double volume();
}


class Sphere extends GeometricShape{
    double  radius;
    Sphere(double radius){
        this.radius = radius;
    }

    @Override
    double volume() {
        return (4/3) * PI * Math.pow(radius, 3);
    }

}

class Cylinder extends GeometricShape{
    double radius, height;
    Cylinder(double radius, double height){
        this.radius = radius;
        this.height = height;
    }

    @Override
    double volume() {
        return PI * Math.pow(radius, 2) * height;
    }
}


class Test1 {
    public static void main(String[] args) {
        GeometricShape shape1, shape2;
        shape1 = new Sphere(5);
        shape2 = new Cylinder(5, 10);

        System.out.println("Volume of sphere: " + shape1.volume());
        System.out.println("Volume of cylinder: " + shape2.volume());
    }
}