import java.util.Scanner;
public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ans = "James Gosling";
        int attempts = 0;
        while (attempts<3) {
            System.out.println("Who is the inventor of Java ?");
            String s1 = sc.nextLine();
            if(s1.equalsIgnoreCase(ans)){
                System.out.println("Correct Answer ^^");
                break;
            }
            else{
                attempts++;
                if (attempts<3) {
                    System.out.println("Wrong Answer. Try Again TT");    
                }else{
                    System.out.println("The Correct Answer is : "+ans);    
                }
            }
        }
        sc.close();
    }
}
