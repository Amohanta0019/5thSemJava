import java.util.Scanner;
import java.util.Arrays;
public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.nextLine();
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        String s1 = new String(ch);
        System.out.println(s1);
        sc.close();
    }
}
