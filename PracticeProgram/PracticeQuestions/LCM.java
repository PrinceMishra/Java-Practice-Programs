package PracticeQuestions;

import java.util.Scanner;

class LCM {

    public static void main(String[] args) {
        System.out.println("Find the LCM(Least Common Factor) of given numbers");

        System.out.println("Please enter your first number : ");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        System.out.println("Please enter your second number : ");
        int num2 = input.nextInt();

        int factor =LeastCommonFactor(num1, num2);

        System.out.println("Least Common Factor of " + num1 + " and " + num2 + " is " +factor);

       
    }

    public static int LeastCommonFactor(int n1 ,int n2)
    {
        int i=1;
        int factor =1;

        while (i<n2) // because return 0 is unachieveable this condition is always true so i can also give condiiton as True
        {

            factor=i*n1;
            if(factor%n2==0)
            {
                return factor;
            }
            i++;
        }

      return 0; // unachieveable;
    }
}
