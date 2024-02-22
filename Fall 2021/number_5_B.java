class Vehicle {
    double mph;
    String model;
    int year;

    Vehicle() {
        System.out.println("We are dealing " +
                "with a vehicle class");
    }

    Vehicle(String model, double mph, int year) {
        this.model = model;
        this.mph = mph;
        this.year = year;
    }

    void display() {
        System.out.println("Parent class method");
    }
}
class Bus extends Vehicle {
    String license_no;

    Bus(String license_no, String model, double mph, int year) {
        super(model, mph, year);
        this.license_no = license_no;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Inside bus class ");
    }
}

class MainAccess {
    public static void main(String args[]) {
        Bus bus = new Bus("12345", "Volvo", 50, 2010);
        bus.display();
    }
}