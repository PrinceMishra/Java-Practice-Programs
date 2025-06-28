import java.util.Scanner;

public class CountSpecialChar {


    public static void main(String[] args) {
        System.out.println("Enter the String to count special character: ");
        Scanner sc =new Scanner(System.in);
        String line =sc.nextLine();
        char[] ch = line.toCharArray();

        int numbers=0;
        int characters=0;
        int spaces=0;
        int others=0;

        for(int i=0;i<line.length();i++){

            if(Character.isDigit(ch[i]))
            {
                numbers++;
            } else if (Character.isAlphabetic(ch[i])) {
                characters++;
            } else if (Character.isSpaceChar(ch[i])) {
                spaces++;
            } else {
                others++;
            }

        }


        System.out.println("Characters : "+characters);
        System.out.println("Spaces : "+spaces);
        System.out.println("Numbers : "+numbers);
        System.out.println("Others : "+others);
        sc.close();
    }
}
