import java.util.Scanner;
class PayOutOfBoundsException extends RuntimeException{
    PayOutOfBoundsException(String str){
        super(str);
    }
}
public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your salary -> ");
        double salary = sc.nextDouble();
        if(salary < 10000){
            sc.close();
            throw new PayOutOfBoundsException("Salary too low");
        }else{
            System.out.println("Salary is:- Rs."+salary+"/-");
        }
        sc.close();
    }
}
