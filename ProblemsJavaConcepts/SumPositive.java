import java.util.Scanner;

class SumPositive {

    public static void main(String[] args) {

        System.out.println("Welcome to add all positive number entered. ");
        System.out.println("Please enter a number to be length a of an array");
        Scanner input = new Scanner(System.in);
        int len = input.nextInt();
        int [] arr = new int[len];
        System.out.println("Enter the values of an array.");
        int sum=0;
        for (int i=0; i<len;i++)
        {
            arr[i]=input.nextInt();
        }

        for (int e :arr)
        {
            if (e<0)
                continue;
            sum+=e;
        }

            System.out.println("Sum of all positive number of an array is "+sum );


    }


}
