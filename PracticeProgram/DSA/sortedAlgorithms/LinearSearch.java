package DSA.sortedAlgorithms;

import java.util.Scanner;

public class LinearSearch {

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
        int resultLinear=linearSearch(arr,target);

        if(resultLinear==-1) {
            System.out.println(target + " Not found in the list");
        }
        else {
            System.out.println(target + " is present at " + resultLinear);
        }

        sc.close();
    }


    public static int linearSearch(int[] arr, int target) {

        int count=0;
        for (int i =0;i<arr.length;i++)
        {
            count++;
            if(arr[i]==target) {
                System.out.println("Linear Searched " + count + " times");
                return i;
            }
        }
        System.out.println("Linear Searched "+ count + " times");
        return -1;
    }


}
