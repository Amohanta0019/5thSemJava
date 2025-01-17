class MyThread4 extends Thread{
    public void run(){
        try{
            for(int i=0; i<3; i++){
                System.out.println(Thread.currentThread().getName()+" is running");
            }
            Thread.sleep(1000);
        }catch(InterruptedException ie){ }
    }
}
public class Q6 {
    public static void main(String[] args) {
        
        MyThread4 t1 = new MyThread4();
        //MyThread4 t2 = new MyThread4();
        try{
            for(int i=0; i<3; i++){
                System.out.println(Thread.currentThread().getName()+" is running");
            }
            Thread.sleep(1000);
        }catch(InterruptedException ie){ }
        
        t1.start();
        //t2.start();
        try{
            t1.join();
            System.out.println("is t1 alive? "+t1.isAlive());
            //t2.join();
            //System.out.println("is t2 alive? "+t2.isAlive());
        }catch(InterruptedException ie){ }
    }
}
