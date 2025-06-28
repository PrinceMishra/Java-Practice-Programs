import java.util.Scanner;

public class CompareNumber {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First number : ");
      
        int fNum = sc.nextInt();
        System.out.println("Enter the Second number : ");
      
        int sNum = sc.nextInt();

        if(fNum == sNum)
        {
            System.out.println("Both numbers are equal.");
        }
        else if(fNum>sNum)
        {
            System.out.println(fNum+" is greater than "+sNum);
        }
        else if (fNum<sNum) {
            System.out.println(fNum+" is Less than "+sNum);
        }
        else
        {
            System.out.println("Invalid Input.");
        }
        sc.close();
    }
    
}
