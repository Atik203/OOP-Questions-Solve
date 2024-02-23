class Base {
    public int a;
    private double b;

    Base(int a, double b) {
        this.a = a;
        this.b = b;
    }

    Base(Base ob) {
        a = ob.a;
        b = ob.b;
    }

    double getB() {
        return b;
    }

    void show() {
        System.out.println("Sum of variables " +
                "In the Base class " + a + b);
    }
}

class Override extends Base {
    int c;

    Override(int a, double b, int c) {
        super(a, b);
        this.c = c;
    }

    void show() {
        double total = this.a + this.getB() + this.c;
        System.out.println("In the Override class " + total);
    }


}

class Override2 extends Base {
    int c;

    Override2(int a, double b) {
        super(a, b);
    }

    Override2(Override2 ob) {
        super(ob);
    }
  void show()
  {
      double total = this.a + this.getB();
        System.out.println("In the Override2 class " + total);
  }

}

class MethodOverride {
    public static void main(String[] args) {

        Override obj = new Override(10, 20.5, 12);
        obj.show();
        Override2 obj2 = new Override2(6, 10);
        obj2.show();
        Override2 obj3 = new Override2(obj2);
        obj3.show();
    }
}