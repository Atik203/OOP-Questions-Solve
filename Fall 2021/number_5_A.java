class Parent {
    int i = 10;
    public Parent(int j)
    {
        System.out.println(i); // 10
        j = j*2;
        this.i= j*10; // 80

    }
}


class Child extends Parent {
    public Child(int j)
    {
        super(j);
        System.out.println(i); // 80
        this.i = j * 20; // 80
    }
}

class Main{
    public static void main(String[] args) {
        Child n = new Child(4);
        System.out.println(n.i); // 80
    }
}