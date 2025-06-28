package PracticeQuestions;
import java.util.*;
public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Check wheather the number is prime or not. ");

        System.out.println("Enter the number :");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean isprimenumber= isPrime(num);
        if(isprimenumber){
            System.out.println(num+" is a prime number.");

        }
        else{
            System.out.println(num+ " is not a prime number.");
        }
       
        
    }

    public static boolean isPrime(int n){

        int i=2;
        
        while (i<n) {
            if(n%i==0)
               return false;
            i++;
        }

       

        return true;
    }
}
