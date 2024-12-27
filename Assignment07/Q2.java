import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a string");
        String s = sc.nextLine();

        System.out.println("Enter a char array");
        char[] ch = new char[5];
        for (int i = 0; i < ch.length; i++) {
            ch[i] = sc.next().charAt(0);
        }

        StringBuilder sb = new StringBuilder();
        sb.append(ch).append(s); 

        char[] ch1 = sb.toString().toCharArray();
        System.out.println("Resulting char array:");
        for (char c : ch1) {
            System.out.print(c + "-");
        }
        sc.close();
    }
}
