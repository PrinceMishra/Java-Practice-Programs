import java.util.Scanner;

public class RotateArray {

    public static void main(String[] args) {

        System.out.print("Enter the number of elements in an array: ");
        Scanner sc =new Scanner(System.in);
        int ind = sc.nextInt();
        System.out.println("Enter the elements in an array: ");
        int [] arr= new int[ind];
        for (int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("How many times you have to reverse an array : ");
        int rev= sc.nextInt();
//        Reversing array

            int temp;
            while(rev>0) {
                temp = arr[arr.length - 1];
                for (int x = arr.length - 1; x > 0; x--) {
                    arr[x] = arr[x - 1];
                }
                arr[0] = temp;
                rev--;
            }

        System.out.print("Reversed Array : ");
        for(int counter : arr)
        {
            System.out.println(counter +" ");
        }

        sc.close();

    }

}
