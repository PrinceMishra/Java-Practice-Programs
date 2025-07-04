import java.util.Scanner;

class CalculatorSwitch {

    public static void main(String[] args) {
        System.out.println("Please enter the first number: ");
        int num1;
        Scanner input = new Scanner(System.in);
        num1=input.nextInt();
        int num2;
        System.out.println("Please enter the second number: ");
        num2=input.nextInt();

        System.out.println("Please enter the Operator ( +  *  /  -): ");
        char operator=input.next().charAt(0);

        int res = switch(operator){
            case '+' -> num1+num2;
            case '-' -> num1-num2;
            case '*' -> num1*num2;
            case '/' -> num1/num2;
            default -> -1;
        };

        System.out.println("Your answer is "+ res);
    }
}
