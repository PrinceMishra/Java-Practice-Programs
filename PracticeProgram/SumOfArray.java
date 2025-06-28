import java.util.Scanner;

public class SumOfArray {

    public static void main(String[] args) {

        int allIndex;

        System.out.print("Enter the number of elements of an array : ");
        Scanner sc = new Scanner(System.in);
        allIndex=sc.nextInt();
        int []arr=new int[allIndex];
        int sum=0;
        System.out.print("Enter the elements of an array: ");
        for (int element: arr)
        {
            arr[element]=sc.nextInt();
            sum+=arr[element];
        }

        System.out.println("Sum of all elements in an array is : " + sum);
        sc.close();
    }

}
