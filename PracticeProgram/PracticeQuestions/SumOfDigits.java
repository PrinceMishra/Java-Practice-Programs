package PracticeQuestions;

public class SumOfDigits {

    public static void main(String[] args) {
        System.out.println("Sum Of it's Digits : ");
        int n = SumOddNumbers.readNumber();
        System.out.println("sum of its digits of " + n + " is " + sumDigit(n));
    
    }

    public static int sumDigit(int num){

        int res=0;
        int rem =0;
        while(num>0){
            rem=num%10;
            res+=rem;
            num=num/10;
        }

        return res;

    }
    
}
