class Display{
    public synchronized void displayn(){
        for(int i=0; i<10; i++){
            System.out.print(i);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException ie){ }
        }
    }
    public synchronized void displayc(){
        for(int i=65; i<75; i++){
            System.out.print((char)i);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException ie){ }
        }
    }
}
class MyThread2 extends Thread{
    Display d;
    MyThread2(Display d){
        this.d = d;
    }
    public void run(){
        d.displayn();
    }
}
class MyThread3 extends Thread{
    Display d;
    MyThread3(Display d){
        this.d = d;
    }
    public void run(){
        d.displayc();
    }
}

public class Q5 {
    public static void main(String[] args) {
        
        Display d = new Display();
        
        MyThread2 t1 = new MyThread2(d);
        MyThread3 t2 = new MyThread3(d);

        t1.start();
        t2.start();
    }
}
