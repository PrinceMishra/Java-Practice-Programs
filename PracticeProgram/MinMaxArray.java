import java.util.Scanner;

public class MinMaxArray {


    protected int minArray(int[] arr1){

        int min = arr1[0];
        for(int i=0;i<arr1.length;i++)
        {
           if(min>arr1[i])
               min=arr1[i];
        }
        return min;
    }

    protected int maxArray(int[] arr1){

        int max = arr1[0];
        for(int i=0;i<arr1.length;i++)
        {
            if(max<arr1[i])
                max=arr1[i];
        }
        return max ;
    }

    protected int maxArray(){
        return 0;
    }

    public static void main(String[] args) {

        System.out.println("Enter the number of elements of an array : ");
        Scanner sc = new Scanner(System.in);
        int totInd=sc.nextInt();
        int[] arr=new int[totInd];
        System.out.println("Enter the elements in an array :");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        MinMaxArray obj = new MinMaxArray();
        System.out.println("Minimum in an array is : "+obj.minArray(arr)+" and the Maximum is : "+obj.maxArray(arr));

        sc.close();

    }

}
