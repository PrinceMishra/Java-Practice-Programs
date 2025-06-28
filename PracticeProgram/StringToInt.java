import java.util.Scanner;

public class StringToInt {

    public static void main(String[] args) {
        
        System.out.println("Enter the number : ");
        Scanner sc = new Scanner(System.in);

        String s= sc.nextLine();

        System.out.println("Multiple in 10 of " + s + " is " + Integer.parseInt(s)*10 );
        sc.close();    
    }

    
}
