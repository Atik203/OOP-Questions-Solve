
/*

Consider the following code and answer the following questions:
i. What values will be printed in Line Number 43 and 45?
ii. Mention the line numbers in the main method which will cause to mark some objects to be collected by the
Garbage Collector

 */

class Point {

   int x, y;

}

 class Main1 {
    static void swapPoints1(Point a, Point b) {
        Point t = a;
        a = b;
        b = t;
    }

    static void swapPoints2(Point a, Point b) {
        int x = a.x;
        int y = a.y;
        a.x = b.x;
        a.y = b.y;
        b.x = x;
        b.y = y;
    }

     public static void main(String[] args) {
         Point p1 = new Point();
         p1.x = 10;
         p1.y = 15;

         Point p2 = new Point();
         p2.x = 20;
         p2.y = 25;

         swapPoints1(p1, p2);
         System.out.println("(" + p1.x + ", " + p1.y + ")");
         swapPoints2(p1, p2);
         System.out.println("(" + p1.x + ", " + p1.y + ")");
         new Point(); // garbage collector will collect this object
         Point p3 = p2;
         p2 = new Point();
         p3 = p1;
         p1 = p2;

     }
 }

