import java.util.Scanner;

class ExitOnExit {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while(true){
            System.out.println("Enter your command : ");
            String cmd = input.next();
            if(cmd.equalsIgnoreCase("exit")){
                break;
            }
        }

        System.out.println("You have successfully exited.");
    }
}
