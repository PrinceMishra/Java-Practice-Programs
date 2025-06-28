
interface i {
    void  show();
}

class A{
    public void show()
    {
        System.out.println("Class A here ");
    }
}

class B extends A{
    public void show()
    {
        System.out.println("Class B here");
    }
}
public class check {

    public static void main(String[] args) {

       A obj = new A();
       obj.show();

    }
}
