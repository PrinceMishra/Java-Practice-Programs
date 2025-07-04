import java.util.Scanner;

class AbsoluteTernary {
    public static void main(String[] args) {
        System.out.println("Please enter the number: ");
        int num1;
        Scanner input = new Scanner(System.in);
        num1=input.nextInt();

        int res = num1>=0?num1:-num1;
        System.out.println("Absolute number is : " + res);
    }

}
