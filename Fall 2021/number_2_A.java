

/*
* The code contains some errors. Fix the errors and write the correct code. You cannot remove any lines from the code. Note: You do not need to rewrite the whole code. You can use line numbers to fix errors in that line only.


*
* */

class AQ {
    double v1;
    int a1;

    public AQ(double v1, int a1) {
        this.v1 = v1;
        this.a1 = a1;
    }

    public AQ()
    {
        // this.AQ(100);
        this.f1(100,0); // fix the name of the constructor to AQ and remove the parameter
    }

    void f1 (int a, int b)
    {
        System.out.println(a+b+v1+a1);
    }

    void f2(int x,int y) // fix the name f1 to f2 and a,b to x,y
    {
        System.out.println(v1+a1+x+y);
    }

    // Test method
    public static void main(String[] args) {
        AQ a = new AQ(10,20);
        AQ b = new AQ();
        a.f1(10,20);
        a.f2(10,20);
    }

}
