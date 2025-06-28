package PracticeQuestions;

import java.util.Scanner;

public class SumOddNumbers {
    
    public static void main(String[] args) {
        
        System.out.println("Sum All Odd Numbers Till Given Number");
        int num = readNumber();

       System.out.println("Sum of Odd number till " + num +" is " + sumOfOdd(num)); 

    }

    public static int readNumber(){
        System.out.println("Please enter a number : ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        return n;
    }

    public static int sumOfOdd(int num){
        int i=1;
        int sum=0;
        while (i<=num) {
            sum+=i;
            i=i+2;  
        }
        return sum;
    }
}
