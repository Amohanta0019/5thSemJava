public class Q1{
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
        }catch(ArithmeticException ae){
            System.out.println("cannot / by 0");
        }
    }
}