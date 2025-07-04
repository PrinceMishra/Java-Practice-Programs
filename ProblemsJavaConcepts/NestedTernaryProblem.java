import java.util.Scanner;

class NestedTernaryProblem {

    public static void main(String[] args) {
        System.out.println("Please enter the your marks: ");
        int marks;
        Scanner input = new Scanner(System.in);
        marks=input.nextInt();


        String res = (marks>80)?"High":(marks>50?"Moderate":"Low");
        System.out.println("Your category is : " + res);
    }
}
