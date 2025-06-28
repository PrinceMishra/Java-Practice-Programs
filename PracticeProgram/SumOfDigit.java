import java.util.Scanner;

public class SumOfDigit {



    public static void main(String[] args) {

        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int n=num;
        int sum = 0;

        while (num!=0) {
            
            sum =sum+(num % 10);
            num = num/10;
        }   

        System.out.println("Sum of the digits of " + n + " is " + sum );

        sc.close();
        
    }
    
}
