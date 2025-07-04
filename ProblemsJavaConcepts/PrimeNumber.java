import java.util.Scanner;

class PrimeNumber {

    public static void main(String[] args) {
        System.out.println("Please enter a number :");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if(isPrime(num)){
            System.out.println(num + " is a prime number.");
        }
        else {
            System.out.println(num + " is not a prime number.");
        }
    }

    public static boolean isPrime(int num){

        int count=0;
        if(num<=1)
            return false;

        for (int i=2;i<num;i++)
        {
            if(num%i==0){
                return false;
            }
        }
        return true;
    }

}
