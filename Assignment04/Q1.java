//Check without having any abstract method/s whether a class can be abstract; if so, then use that concrete method/s from another class having main method.

abstract class A{
    void m1(){
        System.out.println("Abstract class concrete method");
    }
}

public class Q1 extends A{
    public static void main(String[] args) {
        Q1 q = new Q1();
        q.m1();
    }
    
}