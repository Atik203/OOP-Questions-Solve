import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

class Point{
    int x,y,z;

    Point(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
}

class PointComparator implements Comparator<Point> {
    public int compare(Point p1, Point p2){
        return (p2.x+p2.y)-(p1.x+p1.y);
    }
}

class Question_5_b{
    public static void main(String[] args){
        ArrayList<Point> points = new ArrayList<Point>();
        points.add(new Point(14,2,3));
        points.add(new Point(4,5,6));
        points.add(new Point(7,8,9));

        Collections.sort(points, new PointComparator());

        for(Point p: points){
            int total = p.x + p.y;
            System.out.println(p.x + " " + p.y + " " + p.z+" "+total);
        }
    }
}