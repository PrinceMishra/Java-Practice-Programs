// /**
//  * FirstCode
//  */

//  import java.util.Scanner;
// public class FirstCode {

//     public static void main(String[] args) {
//         System.out.println("Boom");
//         // System.out.println(args[1]);

//         Scanner input = new Scanner(System.in); 
//         System.out.print("Enter the Roll number : ");
//         int Roll  = input.nextInt();
//         System.out.println("Roll Number :" + Roll);

//         System.out.println("Enter Your name please");
//         String name = input.next();
//         System.out.println("Your Name is : " + name );


//     }
// }

class Outer {
    private int outerValue = 10;

    class Inner {
        void display() {
            System.out.println("Outer value: " + outerValue);
        }
    }
}

class Main {
    public static void main(String[] args) {
        Outer.Inner inner = new Outer().new Inner();
        inner.display();
    }
}
