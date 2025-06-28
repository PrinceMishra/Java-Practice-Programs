package DSA.sortedAlgorithms;

import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {
        System.out.println("Please enter the number of elements you want to store: ");
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int arr[] = new int[num];
        System.out.println("Please enter "+num+" elements in the list ");
        for (int i=0;i< arr.length;i++) {
            arr[i]= sc.nextInt();
        }
        System.out.println("Please enter the target value from the list to get index :");
        int target = sc.nextInt();
        int resultBinary=binarySearch(arr,target);

        if(resultBinary==-1) {
            System.out.println(target + " Not found in the list");
        }
        else {
            System.out.println(target + " is present at " + resultBinary);
        }

        sc.close();
    }


    public static int binarySearch(int[] arr, int target) {

        int start=0;
        int end= arr.length-1;
        int count=0;

        while (start<=end)
        {
            count++;
            int mid =(start+end)/2;

            if(arr[mid]==target){
                System.out.println("Binary Searched " + count + " times");
                return mid;
            }
            else if (arr[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }

        }
        System.out.println("Binary Searched "+ count + " times");
        return -1;
    }

}
