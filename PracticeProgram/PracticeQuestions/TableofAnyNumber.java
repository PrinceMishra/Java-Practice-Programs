package PracticeQuestions;

import java.util.Scanner;

public class TableofAnyNumber {


    public static void main(String[] args) {

        System.out.println("Enter the number to print table :");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(num+" x "+i+" = "+Calculations.multiply(num,i));
     
        }

        sc.close();
    }
}
