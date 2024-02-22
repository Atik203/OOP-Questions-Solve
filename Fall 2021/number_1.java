/**
 * Write a java program to print the area of a rectangle by creating a class named ‘Area’ taking the values of its ‘length’ and ‘width’ as private instance variables of integer type. The constructor initializes the instance variables with ‘this’ reference keyword. Area has a method named ‘returnArea’ which returns the area of the rectangle. Length and width of rectangle are entered through the object creation that’s done in the ‘main’ method. There’s a block in this class that prints the following message ‘The area A of a rectangle is given by the formula, A=lw, where l is the length and w is the width.’.

 */


class Area {
    private  int length;
    private  int width;
    public Area(int length, int width) {
        this.length = length;
        this.width = width;
    }
    public int returnArea() {
        return length * width;
    }
    {
        System.out.println("The area A of a rectangle is given by the formula, A=lw, where l is the length and w is the width.");
    }

    public static void main(String[] args) {
        Area a = new Area(4, 5);
        System.out.println("Area of rectangle is: " + a.returnArea());
    }
}
