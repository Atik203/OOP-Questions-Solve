

/*

Complete the following code using the following instructions:
i. Create an object of class A from pack1 in class B
ii. Set the access specifier of x in A properly to make it accessible in this package

 */


// package pack1;

class A {

    int x;
}


// package pack2;
// import pack1.A;

class B {
    public static void main(String[] args) {
        A objA = new A();
        objA.x = 10;
        System.out.println("Value of x: " + objA.x);
    }
}
