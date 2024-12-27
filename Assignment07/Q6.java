import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first name");
        String fname = sc.nextLine().trim();
        System.out.println("Enter middle name");
        String mname = sc.nextLine().trim();
        System.out.println("Enter last name");
        String lname = sc.nextLine().trim();
        System.out.println("Enter roll no");
        String roll = sc.nextLine().trim();
        StringBuilder pwd = new StringBuilder();

        if (!fname.isBlank()) {
            pwd.append(fname.charAt(0));
        }
        if (!mname.isBlank()) {
            pwd.append(mname.charAt(0));
        }
        if (!lname.isBlank()) {
            pwd.append(lname.charAt(0));
        }
        if (!roll.isBlank() && roll.length() >= 4) {
            pwd.append(roll.substring(roll.length() - 4));
        } else {
            System.out.println("roll msut have min 4 digits");
        }
        System.out.println(pwd);
        sc.close();
    }
}
