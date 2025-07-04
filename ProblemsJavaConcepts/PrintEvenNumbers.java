import java.util.Scanner;

 class PrintEvenNumbers {

    public static void main(String[] args) {
        System.out.println("Welcome to print the even numbers using continue ");

        System.out.println("Enter the number of elements you want to store in an array:");
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int [] arr = new int[len];
        System.out.println("Enter the values of an array ");
        for (int i=0;i<len;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Even numbers in an array are :");
        evenNumbers(arr);


    }

     static void evenNumbers(int [] arr){
        for(int e:arr){
            if(e%2==1)
                continue;
            System.out.print(" "+e+ " ");
        }
     }


}
