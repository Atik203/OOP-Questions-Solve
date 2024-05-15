

interface A{
    int p();
    int q();
}

interface B{
    int x();
    int y();
}

abstract class C implements A, B{

    abstract int z();
}

class D extends C{
    public int p() {
        System.out.println("p");
        return 1;
    }

    public int q() {
        System.out.println("q");
        return 2;
    }

    public int x() {
        System.out.println("x");
        return 3;
    }

    public int y() {
        System.out.println("y");
        return 4;
    }

    public int z() {
        System.out.println("z");
        return 5;
    }
}