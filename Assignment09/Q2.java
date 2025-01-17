class MyRunnable implements Runnable {
    String tname;

    public MyRunnable(String tname) {
        this.tname = tname;
    }

    public void run() {
        System.out.println("name :" + Thread.currentThread());
        for (int i = 0; i < 3; i++) {
            try {
                System.out.println(Thread.currentThread().getName()+ " [child]Running for "+i+"-time");
                Thread.sleep(1000);
            } catch (InterruptedException ie) {
                System.out.println("interrupt");
            }
        }
    }
}

public class Q2 {
    public static void main(String[] args) {
        MyRunnable r = new MyRunnable("c-thread");
        Thread t = new Thread(r);
        t.start();
        for (int i = 0; i < 3; i++) {
            try {
                System.out.println(Thread.currentThread()+" [main]Running for "+i+"-time");
                Thread.sleep(1000);
            } catch (InterruptedException ie) {
                System.out.println("interrupt");
            }
        }
    }
}
