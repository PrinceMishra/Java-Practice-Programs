import java.util.Scanner;

public class DuplicateEleArray {
    public static void main(String[] args) {
        System.out.print("Please enter number of elements in an array: ");
        Scanner sc = new Scanner(System.in);
        int arrIndex= sc.nextInt();
        int [] arr = new int[arrIndex];
        System.out.println("Enter the elements of an array : ");
        for(int i=0;i<arrIndex;i++)
        {
            arr[i]=sc.nextInt();
        }
        for (int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                    System.out.println(arr[i]);
            }
        }

        sc.close();
    }

}
