//4. Create a class First, make instance variable [int x], method [void show ()] and also put main method inside that class and use the instance variable and method from main.
public class First {
    int x;
    void show(){
        System.out.println("show method. X = "+x);
    }
    public static void main(String[] args) {
        First f = new First();
        f.show();
    }
}
