import java.util.Scanner;

class PasswordChecker {

    public static void main(String[] args) {

        String password;
        do {
            System.out.println("Please enter your password");
            Scanner pass =new Scanner(System.in);
            password = pass.nextLine();
        }while (!isValidPassword(password));

        System.out.println("Thanks for entering a valid password!");
    }

    static boolean isValidPassword(String password){
            return password.length()>=6;

    }

}
