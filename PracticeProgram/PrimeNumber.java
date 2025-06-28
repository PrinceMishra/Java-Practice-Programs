// Java program to demonstrate Improved method to check if a number is prime
import java.util.Scanner;

// Driver Class
class GFG {
    static boolean isPrime(int n)
    {
        // Corner case
        if (n <= 1)
            return false;

        // Check from 2 to n/2
        for (int i = 2; i <= n / 2; i++)
            if (n % i == 0)
                return false;

        return true;
    }

    // Driver Program
    public static void main(String args[])
    {
       System.out.println("Enter the number to check prime : ");
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
        if (isPrime(n))
            System.out.println("It's prime number.");
        else
            System.out.println("It's not prime number.");

            sc.close();
    }

   
}
