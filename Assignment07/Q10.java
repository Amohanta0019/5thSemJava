import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        // Test the deleteMe method
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:- ");
        String input = sc.nextLine();
        System.out.println("Enter element number to remove:- ");
        int m = sc.nextInt(); // Remove the 1st element
        String result = deleteMe(input, m);

        System.out.println("Original string: " + input);
        System.out.println("Modified string: " + result);
        sc.close();
    }

    // Method to remove the m-th element (word) from the string
    public static String deleteMe(String str, int m) {
        // Validate input
        if (str == null || str.isEmpty()) {
            System.out.println("Invalid input string.");
            return str;
        }

        // Split the string into words
        String[] words = str.split("\\s+");

        // Validate the position
        if (m <= 0 || m > words.length) {
            System.out.println("Invalid position for the element.");
            return str;
        }

        // Build the resulting string without the m-th element
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            if (i != m - 1) { // Skip the m-th element
                sb.append(words[i]).append(" ");
            }
        }

        // Trim and return the result
        return sb.toString().trim();
    }
}
