import java.util.Scanner;

class BmiCalculator
{
    public static void main(String args[]) {
        float weight;
        float height;
        float bmi;
        
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the weight in KG: ");
        weight=sc.nextFloat();

        System.out.print("Enter the height in meter: ");
        height=sc.nextFloat();

        bmi=weight/(height*height);

        if ((bmi<=18.5)) {
            System.out.println("Body Mass Index of this person is :" + bmi + " It's Underweight!! Please gain some weight.");
        }

        else if((bmi>18.5) && (bmi<=24.9)) {
            System.out.println("Body Mass Index of this person is :" + bmi + " It's Normal. cool!");
        }    
        
        else if((bmi>24.9) && (bmi<=29.9)) {
            System.out.println("Body Mass Index of this person is :" + bmi + " It's Overweight!! Please loss some weight.");
        }

        else if((bmi>29.9) && (bmi<=34.9)) {
            System.out.println("Body Mass Index of this person is :" + bmi + " It's Obese!! Please loss much weight");
        }

        else {
            System.out.println("Body Mass Index of this person is :" + bmi + " It's Extremely Obese!! Please contact to the Physcian");
        }

        sc.close();
      }
}