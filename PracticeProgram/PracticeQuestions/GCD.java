package PracticeQuestions;

import java.util.Scanner;

public class GCD {

     public static void main(String[] args) {
        System.out.println("Find the GCD (Greatest Common Divisor) of given numbers");

        System.out.println("Please enter your first number : ");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        System.out.println("Please enter your second number : ");
        int num2 = input.nextInt();

        int gcd =GreatestCommonDivisor(num1, num2);

        System.out.println("Greatest Common Divisor of " + num1 + " and " + num2 + " is " +gcd);

       
    }

    public static int GreatestCommonDivisor(int n1 ,int n2)
    {
        int least = LeastNumber(n1, n2);
        int i=2;
        int gcd=1;
        while (i<=least) {

            if(n1%i==0 && n2%i==0)
                 gcd=i;

            i++;

        }

      return gcd; 
    }

    public static int LeastNumber(int n1, int n2){

        if(n1>n2){
            return n1;
        }
        else{
            return n2;
        }
    }
    
}
