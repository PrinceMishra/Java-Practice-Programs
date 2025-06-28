package PracticeQuestions;

import java.util.Scanner;

public class GradesCheck {
    public static void main(String[] args) {
        System.out.println("please enter the Percentage to check grades :" );
        Scanner input = new Scanner(System.in);
        int grade = input.nextInt();

        if(grade>=90){
            System.out.println("Great, You have got A");
        }else if(grade>=75){
            System.out.println("Good, You have got B");
        }else if(grade>=60){
            System.out.println("You have got C, Work hard next time.");
        }else if(grade>=30){
            System.out.println("You have got D, you seriously need to work hard.");
        }else{
            System.out.println("Sorry, You have got failed and got F.");
        }
    }
    
}
