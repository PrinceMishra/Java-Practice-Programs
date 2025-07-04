import java.util.Scanner;

class MaximumValueIntegerArray {

    public static void main(String[] args) {

        System.out.println("Please enter the number of values to store in an array: ");
        Scanner input = new Scanner(System.in );
        int n= input.nextInt();
        int [] arr = new int[n];
        System.out.println("Please enter "+n+" values in an array: ");
        for (int i=0;i<n;i++ ){
            arr[i]=input.nextInt();
        }

        System.out.println("Maximum value in this array is "+maxValue(arr));
    }

    public static int maxValue(int [] arr1){

        int max=  Integer.MIN_VALUE;
        for(int e : arr1){
            if(e>max)
            {
               max=e;
            }
        }

        return max;
    }
}
