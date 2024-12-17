//Create a class which contains an inner class. Show that inner class can use member of outer class directly, but Outer class can use member of Inner class only through its object. Check the name of class file, you created.

class Outer{
    int x=10;
    class Inner{
        int y = 20;
        void show(){
            System.out.println("Outer class var = "+x);
        }
    }
    void show(){
        Inner i = new Inner();
        System.out.println("Inner class var = "+i.y);
    }
}
public class Q2 {
    public static void main(String[] args) {
       Outer o = new Outer();
       o.show();
       Outer.Inner i = o.new Inner();
       i.show();

    }
}
