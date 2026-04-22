
import org.shape.*;
import java.util.*;

class TestPackage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Square
        System.out.println("Enter the side of the Square:");
        int s = sc.nextInt();
        Square sq = new Square(s);
        System.out.println("Area of Square is " + sq.area());

       /*     circle
        System.out.println("Enter the radius of the Circle:");
        int r = sc.nextInt();
        Circle ci = new Circle(r);   // ✅ corrected (was 's')
        System.out.println("Area of Circle is " + ci.area());

        // Triangle
        System.out.println("Enter Side1 of Triangle:");
        int s1 = sc.nextInt();
        System.out.println("Enter Side2 of Triangle:");
        int s2 = sc.nextInt();
        System.out.println("Enter Side3 of Triangle:");
        int s3 = sc.nextInt();

        Triangle t = new Triangle(s1, s2, s3);
        System.out.println("Area of Triangle is " + t.area()); */

        sc.close();
    }
}