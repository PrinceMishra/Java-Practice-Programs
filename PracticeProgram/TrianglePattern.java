public class TrianglePattern {
    public static void main(String[] args) {
        int rows = 5; // Number of rows in the pattern

        for (int i = 1; i <= rows; i++) {
            // Print spaces for left padding
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("@");
            }

            // Print asterisks with space
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }

            // Move to next line
            System.out.println();
        }
    }
}

