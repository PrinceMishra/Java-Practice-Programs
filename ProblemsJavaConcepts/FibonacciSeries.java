import java.net.InetSocketAddress;
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        System.out.println("Fibonacci Series using recursion and normal approach ");
        System.out.println("Please enter a number to be printed ");
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
//        System.out.println("Fibonacci Series upto "+ count +" : ");
//        fibonacci(count);

        for(int i=0;i<count;i++)
        {
            System.out.print(" "+recursiveFibonacci(i)+" ");
        }

    }

    static void fibonacci(int cnt){
        long firstNumber=0;
        long secondNumber=1;
        long nextTerm;

        for(int i=0;i<cnt;i++){
            System.out.print(" "+firstNumber+" ");
            nextTerm=firstNumber+secondNumber;
            firstNumber=secondNumber;
            secondNumber= nextTerm;

        }


    }

    static int recursiveFibonacci(int n){
        if(n<=1)
            return n;
        return recursiveFibonacci(n-1)+recursiveFibonacci(n-2);

    }

}
