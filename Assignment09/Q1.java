class MyThread extends Thread {
    MyThread(String s){
        super(s);
        System.out.println("child thread : "+s);
    }
    public void run() {
        System.out.println("Thread "+getName()+" execution starts");
        for (int i = 0; i < 3; i++) {
            try {
                System.out.println(getName()+ " Running for "+i+"-time");
                Thread.sleep(1000);
            } catch (InterruptedException ie) {
                System.out.println("interrupt");
            }
        }

    }
}
// inconsistent output will come
public class Q1 {
    public static void main(String[] args) {
        MyThread t = new MyThread("c-thread");
        t.start();
        for (int i = 0; i < 3; i++) {
            try {
                System.out.println(Thread.currentThread().getName()+" Running for "+i+"-time");
                Thread.sleep(1000);
            } catch (InterruptedException ie) {
                System.out.println("interrupt");
            }
        }
    }
}