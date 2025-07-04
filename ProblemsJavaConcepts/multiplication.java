import java.util.Scanner;

class multiplication {

    public static void multiplicationTable(int num){

        for(int i=1;i<=10;i++){
            System.out.println(num + " * " + i + " = "+ num*i);
        }
    }

    public static void main(String[] args) {
        System.out.println("Please enter a number for multiplication");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        multiplicationTable(num);
    }

}
