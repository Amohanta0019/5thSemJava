import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input string :- ");
        String s1 = sc.nextLine();
        System.out.println("Enter starting index :- ");
        int n = sc.nextInt();
        System.out.println("Enter no of chars to extract :- ");
        int m = sc.nextInt();
        if(n<0 || n> s1.length()){
            System.out.println("invalid starting index");
        }else if(m<0 || (n-1+m)>s1.length()){
            System.out.println("invalid extraction length");
        }else{
            String s2 = s1.substring(n-1,n-1+m);
            System.out.println(s2);
        }
        sc.close();
    }
}
