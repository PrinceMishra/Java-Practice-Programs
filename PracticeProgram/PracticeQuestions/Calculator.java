package PracticeQuestions;

import java.util.Scanner;

class  Calculations{

  public static int add (int x, int y){
        return x+y;
    }
    public static int subtract (int x, int y){
        return x-y;
    }
    public static int multiply (int x, int y)
    {
        return x*y;
    }


    public static double divide (double x, double y)
    {

          return x/y;
//        try{
//            return x/y;
//        }
//        catch (ArithmeticException e){
//            System.out.println("Dividing by zero "+e);
//            return 0;
//        }
    }

    public static double remainder (double x, double y)
    {
          return x%y;

//        try{
//            return x%y;
//        }
//        catch (ArithmeticException e){
//            System.out.println("Dividing by zero "+e);
//            return 0;
//        }
    }
}


public class Calculator {

    public static void main(String[] args) {

        double n1, n2;
        System.out.println("Enter the value of First number");
        Scanner sc = new Scanner(System.in);
        n1=sc.nextInt();
        System.out.println("Enter the second number ");
        n2=sc.nextInt();

        double addResult=Calculations.add((int)n1,(int)n2);
        int subtractResult=Calculations.subtract((int)n1,(int)n2);
        double multiplyResult=Calculations.multiply((int)n1,(int)n2);
        double divideResult=Calculations.divide(n1,n2);
        double remainderResult=Calculations.remainder(n1,n2);

        System.out.println("Sum of "+(int)n1+" and "+(int)n2+" is "+String.format("%.0f",addResult));
        System.out.println("Subtract of "+(int)n1+" and "+(int)n2+" is "+subtractResult);
        System.out.println("Multiply of "+(int)n1+" and "+(int)n2+" is "+(int)multiplyResult);
        System.out.println("Divide of "+(int)n1+" and "+(int)n2+" is "+String.format("%.2f",divideResult));
        System.out.println("Remainder of "+(int)n1+" and "+(int)n2+" is "+String.format("%.2f",remainderResult));

        sc.close();
    }
}

//Write a Java program to print the sum (addition), multiply,
// subtract, divide and remainder of two numbers.

