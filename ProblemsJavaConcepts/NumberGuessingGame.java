import java.util.Scanner;
import java.lang.Math;

class NumberGuessingGame {

    public static void main(String[] args) {

//        Math.random() returns double number greater than or equal to 0.0 and less than 1.0
//        so, to calculate the range =max-min+1(1 is adding because in range it is less than 1.0)
//        (int)(Math.random()*range)+min....by multiplying we get range and by adding the number we drag it to
//        min 50,40, whatever the minimum number will be will start from there


        int guess;
        System.out.println("Please select max number of the range you want to guess : ");
        Scanner input = new Scanner(System.in);
        int max = input.nextInt();
        System.out.println("Please select min number of the range you want to guess : ");
        int min = input.nextInt();
        int range =max-min+1;
        int number=(int)(Math.random()*range)+min;
        System.out.println(number);
       do {
           System.out.println("Enter the guess between range : ");
           guess=input.nextInt();
       }while(!(guess==number));

        System.out.println("Congratulations! you guessed the number!!");
    }

}
