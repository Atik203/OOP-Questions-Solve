class Math2 {
    public int divide(int a, int b) throws DivbyZero {
        if (b == 0) {
            throw new DivbyZero("The denominator cannot be zero");
        }
        return a / b;

    }
}

class DivbyZero extends ArithmeticException {

    public DivbyZero(String message) {
        super(message);
    }

}

class Test2 {
    public static void main(String[] args) {
        Math2 m = new Math2();
        int n = 4;
        int d = 0;


        System.out.println(m.divide(n, d));

        System.out.println("Complete");


    }
}

