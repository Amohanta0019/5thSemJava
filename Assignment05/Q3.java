//Create two interfaces, each with two methods. Inherit a new interface from the two, adding a new method. Create a class by im-plementing the new interface and also inheriting from a concrete class. In main (), create an object of derived class and call the methods. [do all without package statement]

interface interf1{
    void m1();
    void m2();
}
interface interf2{
    void m3();
    void m4();
}
interface interf3 extends interf1, interf2{
    void m5();
}

class A implements interf3{
    int a;
    A(int a){
        this.a = a;
    }
    public void m1(){
        System.out.println("m1() method from interf1");
    }
    public void m2(){
        System.out.println("m2() method from interf1");
    }
    public void m3(){
        System.out.println("m3() method from interf2");
    }
    public void m4(){
        System.out.println("m4() method from interf2");
    }
    public void m5(){
        System.out.println("m5() method from interf3");
    }
    void show(){
        System.out.println("a = "+a);
    }
}
class B extends A{
    int b;
    B(int a, int b) {
        super(a); 
        this.b = b;
    }
    void show(){
        super.show();
        System.out.println("b = "+b);
    }
}
public class Q3 {
    public static void main(String[] args) {
        B b = new B(10,20);
        b.m1();
        b.m2();
        b.m3();
        b.m4();
        b.m5();
        b.show();
    }
}
