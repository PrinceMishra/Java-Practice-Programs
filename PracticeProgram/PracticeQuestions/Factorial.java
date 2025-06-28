package PracticeQuestions;

public class Factorial {

    public static void main(String[] args) {
        
        System.out.println("Factorial Program : ");
        int num =SumOddNumbers.readNumber();
        System.out.println("Factorial of "+ num + " is " +fact(num));

    }

    
    public static long fact(int n){

        if (n<2) {
            return 1;
        }
         long fact =1;
        int i=1;
        while (i<=n) {
            fact*=i;
            i++;
        }

        return fact;
    }
    
    
    
    
}
