import java.util.Scanner;

public class InsertEleArr {

    public static void main(String[] args) {

        System.out.println("Enter the no of elements in an array : ");

        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();

        System.out.println("Enter the elements in an array");
        int[] arr=new int[index];

        for(int i=0;i< arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.println(arr.length);

        System.out.println("Enter the element to insert into an array : ");
        int add = sc.nextInt();
        System.out.println("enter the index at which to insert : ");
        int target=sc.nextInt();
        for (int j= arr.length-1;j>=target;j++)
        {
                if(arr[j]==add) {
                    arr[j] = add;
                    break;
                }
                else
                    arr[j-2]=arr[j-1];

        }

        System.out.println("After adding the element into an array at index " + target );
       for(int j=0;j<arr.length;j++)
       {
           System.out.println(" "+arr[j]);
       }

       sc.close();

    }


}
