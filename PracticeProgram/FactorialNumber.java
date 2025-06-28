import java.util.Scanner;

class Factorial{


    int fact(int n){
        int fact=1;

        for (int i=n;i>=1;i--)
        {
            fact=fact*i;
        }

        return fact;
    }


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        Factorial fc = new Factorial();

        System.out.println("Factorial of " + num + " is "+ fc.fact(num) );
        sc.close();
    }
}