package PracticeQuestions;

import java.util.Scanner;

public class FibonacciSeries {
    
    public static void main(String[] args) {
        System.out.println("Fibonacci Series till the given number.");
        System.out.println("Please enter the number: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        fibonacci(num);

    }

    public static void fibonacci(int n){

        int i =1;
        int res = 0;
        while (i<=n) {
            res += i;
            System.out.println(res + " ");
            i++;
        }

        

    }
}
