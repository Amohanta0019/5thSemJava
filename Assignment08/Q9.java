class P{
    public void m1() throws Exception{
        System.out.println("parent class m1() throws checked exception");
    }
}
class C extends P{
    public void m1() throws ArithmeticException{
        System.out.println("child class m1() overrides and throws child class exception");
    }
}
class InvalidChild extends P {
    // Uncommenting the following will cause a compile-time error because
    // we cannot throw a broader or new checked exception during overriding.
    /*
    @Override
    public void method() throws IOException { // Compile-time error
        System.out.println("InvalidChild's method()");
    }
    */
}
public class Q9 {
    public static void main(String[] args) {
        try{
            C c = new C();
            c.m1();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
