import java.util.Scanner;

public class AverageOfArray {


    public static void main(String[] args) {
        System.out.print("Please enter number of elements in an array: ");
        Scanner sc = new Scanner(System.in);
        int arrIndex= sc.nextInt();
        int [] arr = new int[arrIndex];
        int sum=0;
        System.out.println("Enter the elements of an array : ");
        for(int element : arr)
        {
            arr[element]=sc.nextInt();
            sum+=arr[element];
        }
        System.out.println("Average of an array is : "+sum/arrIndex);

        sc.close();


    }

}
