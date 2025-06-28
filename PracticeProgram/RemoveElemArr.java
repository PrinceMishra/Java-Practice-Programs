import java.util.Scanner;

public class RemoveElemArr {

    public static void main(String[] args) {

        System.out.print("Enter the number of an array : ");
        Scanner sc = new Scanner(System.in);
        int arrIndex=sc.nextInt();
        int[] arr= new int[arrIndex];

        System.out.println("Enter the elements of an array : ");

        for (int i=0;i<arr.length;i++)
        {
            arr[i]= sc.nextInt();
        }

        System.out.println("Enter the element to remove from an array: ");
        int removeEle=sc.nextInt();

        System.out.println("After removing an element from an array: ");

        for(int j=0;j<arr.length;j++)
        {
            if(arr[j]==removeEle)
                arr[j]=arr[j+1];
            else
                System.out.println(arr[j]);
        }

        sc.close();

    }

}
