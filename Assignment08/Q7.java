class MyException1 extends Exception{
    MyException1(String s){
        super(s);
    }
}
class MyException2 extends Exception{
    MyException2(String s){
        super(s);
    }
}
class Test{
    void f() throws MyException2{
        try{
            g();
        }catch(MyException1 me1){
            System.out.println(me1.getMessage());
        }
        throw new MyException2("user defined exception 2, from f()");
    }
    void g() throws MyException1{
        throw new MyException1("user defined exception 1, from g()");
    }
}
public class Q7{
    public static void main(String[] args) {
        Test t = new Test();
        try{
            t.f();
        }catch(MyException2 me2){
            System.out.println(me2.getMessage());
        }
        
                
    }
}
