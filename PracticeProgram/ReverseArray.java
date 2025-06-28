import java.util.Scanner;

public class ReverseArray {

    public static void main(String[] args) {
        System.out.print("Enter the number of elements: ");
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        System.out.println("Enter the elements of an array: ");
        int [] arr= new int[index];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        int temp=0;
        for(int i=0;i< arr.length/2;i++)
        {
            temp=arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;
        }


        System.out.println("Reversed array: ");
        for(int data : arr)
        {
            System.out.println(" "+data);
        }

        sc.close();

    }


}
