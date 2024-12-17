//Create an abstract class with three abstract methods check whether you can we override only few methods (not all methods) in sub - class or not.

abstract class A {
    abstract void m1();

    abstract void m2();

    abstract void m3();
}

class B extends A {
    // either give implementation to all 3 methods or declare class B as abstract
    void m1() {
        System.out.println("Abstract method m1");
    }

    void m2() {
        System.out.println("Abstract method m2");
    }

    void m3() {
        System.out.println("Abstract method m3");
    }

    // void m3() {
    // System.out.println("Abstract method m3");
    // }
    // Exception in thread "main" java.lang.Error: Unresolved compilation problem:
    // The type B must implement the inherited abstract method A.m3()

    // at B.m3(Q2.java:11)
    // at Q2.main(Q2.java:30)

}

public class Q2 {
    public static void main(String[] args) {
        B b = new B();
        b.m1();
        b.m2();
        b.m3();
    }

}
