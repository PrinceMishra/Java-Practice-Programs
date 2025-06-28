package PracticeQuestions;
import java.util.*;

public class MultiplicationTable {
    public static void main(String[] args) {
        
        System.out.println("Multiplication Table Starts Here:");
        int num = readNumber();
        Multiplication(num);

    }


    public static int readNumber(){
        System.out.println("Please enter the number to find the Multiplication Table:");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        return n;
    }

    public static void Multiplication(int num){

        int i=1;
        while(i<=10)
        {
            System.out.println(num +" * "+i +" = "+ (num*i));
            i++;
        }
       
    }
    
}
