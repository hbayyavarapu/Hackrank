package algorithms.codinginterview;

class Point {
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

/**
 * Program to check if two rectangles intersect
 */
public class IntersectingRectangles {
    public  static void main(String[] args) {
        Point l1 = new Point(0,10);
        Point r1 = new Point (10, 0);
        Point l2 = new Point(5,5);
        Point r2 = new Point(15,0);

        System.out.println(isRectagleIntersection(l1, r1, l2, r2));

    }

    public static boolean isRectagleIntersection(Point l1, Point r1, Point l2, Point r2) {
        if(l1.x > r2.x || r1.x < l2.x)
            return false;
        if(r1.y > l2.y || r2.y > l1.y)
            return false;
        return true;
    }
}
