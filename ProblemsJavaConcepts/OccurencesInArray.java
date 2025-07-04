import java.lang.reflect.Array;
import java.util.Scanner;

class OccurencesInArray {
    public static void main(String[] args) {
        System.out.println("Enter the number of values to store in an array: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int [] arr=new int[n];
        System.out.println("Enter the values in an array:");
        for (int i=0;i<n;i++)
        {
            arr[i]=input.nextInt();
        }
        System.out.println("Enter the number to check occurences : ");
        int occur= input.nextInt();
        System.out.println("Your element is found " + occurenceOfElement(arr, occur) + "times.");


    }

    public static int occurenceOfElement(int [] arr, int occur){
        int count =0;
        for(int e: arr){
            if(e==occur)
                count++;
        }
        return count;
    }
}
