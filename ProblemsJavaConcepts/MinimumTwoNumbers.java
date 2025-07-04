import java.util.Scanner;

class MinimumTwoNumbers{

public static void main(String[] args) {

    System.out.println("Please enter the first number: ");
    int num1;
    Scanner input = new Scanner(System.in);
    num1=input.nextInt();
    int num2;
    System.out.println("Please enter the second number: ");
    num2=input.nextInt();

    int res = (num1<num2)?num1:num2;
    System.out.println("Minium number is: " + res);
}

}