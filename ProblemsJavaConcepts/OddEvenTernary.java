import java.util.Scanner;

class OddEvenTernary {

    public static void main(String[] args) {
        System.out.println("Please enter the first number: ");
        int num1;
        Scanner input = new Scanner(System.in);
        num1=input.nextInt();


        String res = (num1%2)==1?"Odd":"Even";
        System.out.println("Number is: " + res);
    }

}
