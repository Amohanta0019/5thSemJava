import java.util.Scanner;
public class Q1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.nextLine();
        
        char chArr[] = s.toCharArray();
        System.out.println("String to charecter array conversion -> ");
        for(char c : chArr){
            System.out.print(c+"-");
        }
        sc.close();
    }
}