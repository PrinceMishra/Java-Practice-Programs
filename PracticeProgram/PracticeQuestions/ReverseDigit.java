package PracticeQuestions;

import java.util.Scanner;

public class ReverseDigit {

    public static void main(String[] args) {
        System.out.println("Reverse the digit of a numeber");

        System.out.println("Enter your number : ");
        Scanner sc =new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println("Reverese of " + num + " is "+ reverseDig(num));

    }

    public static int reverseDig(int n){

        int rem=0;
        int res=0;

        while (n>0) {

            rem=n%10;
            res*=10;
            res+= rem;
            n=n/10;   
        }

        return res;
    }
    
}
