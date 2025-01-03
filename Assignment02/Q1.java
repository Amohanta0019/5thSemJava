public class Q1 {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide two numbers as command line arguments.");
            return;
        }
        
        try {
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);
            int sum = num1 + num2;
            System.out.println("Sum using Command Line Input: " + sum);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format. Please enter valid integers.");
        }
    }
    
}
