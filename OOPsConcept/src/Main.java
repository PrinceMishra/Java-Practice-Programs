import Circle.CircleMethods;
import Circle.Points;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter the coordinates of center of a circle i.e. x and y respectively: ");
        Scanner sc = new Scanner(System.in);
        float x =sc.nextFloat();
        float y = sc.nextFloat();
        Points p1 =new Points();
        p1.setX(x);
        p1.setY(y);

        CircleMethods c1 = new CircleMethods();
        System.out.print("Enter the radius of a circle : ");
        float radius= sc.nextFloat();
        c1.setCenter(p1);
        c1.getCenter();
        System.out.println("Area of a circle is "+c1.circleArea(radius));




    }
}