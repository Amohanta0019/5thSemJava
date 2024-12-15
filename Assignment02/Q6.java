//6. Create a class, make method inside it and pass object as parameter of this method. (a) pass same class’s object, (b) pass different class’s object

class A {
    A(){
        System.out.println("A class");
    }
}

public class Q6 {
    void m1(Q6 q){
        System.out.println("Q6 object hash-code = "+q.hashCode());
    }
    void m2(A a){
        System.out.println("A object hash-code = "+a.hashCode());
    }
    
    //7. Create a class; put a method inside this class which will return a class reference return same class and/or different class object.
    Q6 m11(){
        return this;
    }
    A m22(){
        return new A();
    }

    public static void main(String[] args) {
        Q6 q1 = new Q6();
        A a1 = new A();
        q1.m1(q1);
        q1.m2(a1);
        
        //7. Create a class; put a method inside this class which will return a class reference return same class and/or different class object.
        q1.m11();
        q1.m22();
    }
}
