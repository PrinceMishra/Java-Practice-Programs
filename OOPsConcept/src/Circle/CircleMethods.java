package Circle;

public class CircleMethods {

    Points center;
    final float PI=3.14f;

    public void setCenter(Points center) {
        this.center = center;
    }

    public float circleArea(float radius)
    {
        return PI*radius*radius;
    }

    public float circlePerimeter(float radius)
    {
        return 2*PI*radius;
    }

    public void getCenter()
    {
        System.out.println("Coordinates of center of a circle is ("+center.getX()+"),("+center.getY()+")");
    }


}
