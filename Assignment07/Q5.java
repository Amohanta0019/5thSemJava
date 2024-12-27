import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a string");
        String s = sc.nextLine();

        String[] s1 = s.split(" ");
        for(int i=0; i<s1.length; i++){
            for(int j=0; j<s1.length-1-i; j++){
                if (s1[j].compareToIgnoreCase(s1[j+1])>0) {
                    String t = s1[j];
                    s1[j] = s1[j+1];
                    s1[j+1] = t;
                }
            }
        }
        System.out.println("Sorted words :-");
        for(String s2 : s1){
            System.out.print(s2+" ");
        }
        sc.close();
    }
    
}
