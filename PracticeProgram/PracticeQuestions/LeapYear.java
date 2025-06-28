package PracticeQuestions;
import java.util.Scanner;


/**
 * LeapYear is divisible by 4 but not divisible by 100 and unless also divisible by 400
 */
public class LeapYear {

    public static void main(String[] args) {
        
        System.out.println("Please enter your year to find weather it is a leap year:");
        Scanner input = new Scanner(System.in);
        int year=input.nextInt();

        if(year%400==0 || (year%4==0 && year%100!=0)){
            System.out.println("It's a leap year.");
        }else{
            System.out.println("It's not a Leap Year.");
        }   
    }
}