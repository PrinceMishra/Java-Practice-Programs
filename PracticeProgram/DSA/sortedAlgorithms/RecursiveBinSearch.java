package DSA.sortedAlgorithms;

import java.util.Scanner;

public class RecursiveBinSearch {

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

        int start=0;
        int end = arr.length-1;
        int resultRecursiveBinary=recursiveBinarySearch(arr,start,end,target);
        System.out.println("Recursive binary Searched "+ countRec + " times");
        if(resultRecursiveBinary==-1) {
            System.out.println(target + " Not found in the list");
        }
        else {
            System.out.println(target + " is present at " + resultRecursiveBinary);
        }

        sc.close();
    }


    static int  countRec=0;
    public static int recursiveBinarySearch(int[] arr,int start, int end, int target){
        countRec++;
        if(start<end)
        {
            int mid =(start+end)/2;

            if(arr[mid]==target){
                return mid;
            }
            else if (arr[mid]<target){
                return recursiveBinarySearch(arr,mid+1,end,target);
            }
            else{
                return recursiveBinarySearch(arr,start,mid-1,target);
            }
        }

        return -1;
    }
}
