//Show that ordinary block is executed when object is created and also the order of execution of these blocks (for multiple blocks/inherited block).

class P {
    {
        System.out.println("parent class non-static block");
    }
    static {
        System.out.println("parent class static block");
    }
    P() {
        System.out.println("parent class constructor");
    }
}

class C extends P {
    {
        System.out.println("child class non-static block");
    }
    static {
        System.out.println("child class static block");
    }
    C() {
        System.out.println("child class constructor");
    }
}

public class Q1 {
    public static void main(String[] args) {
        //P p = new P();
        //C c = new C();
        P p1 = new C();
    }

}