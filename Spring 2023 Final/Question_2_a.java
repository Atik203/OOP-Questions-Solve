
class Math1 {
    public int divide(int a, int b) {
        return a / b;
    }
}

 class test {
    public static void main(String[] args) {
        Math1 m = new Math1();
        int n = 4;
        int d = 0;

        try{
            System.out.println(m.divide(n, d));
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed");
        }finally {
            System.out.println("Complete");
        }

    }
}

