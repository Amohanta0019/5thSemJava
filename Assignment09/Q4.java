class MyRunnable1 implements Runnable {
    private String threadName;

    MyRunnable1(String threadName) {
        this.threadName = threadName; // Set thread name
    }


    public void run() {
        System.out.println("Thread Name: " + threadName + ", Priority: " + Thread.currentThread().getPriority() + " is running.");
        for (int i = 1; i <= 3; i++) {
            System.out.println(threadName + " is executing step " + i);
        }
    }
}

public class Q4 {
    public static void main(String[] args) {
        // Create 5 threads with Runnable
        Thread t1 = new Thread(new MyRunnable1("Thread-1"));
        Thread t2 = new Thread(new MyRunnable1("Thread-2"));
        Thread t3 = new Thread(new MyRunnable1("Thread-3"));
        Thread t4 = new Thread(new MyRunnable1("Thread-4"));
        Thread t5 = new Thread(new MyRunnable1("Thread-5"));

        // Set priorities for the threads
        t1.setPriority(Thread.MIN_PRIORITY);  // Priority 1
        t2.setPriority(Thread.NORM_PRIORITY); // Priority 5
        t3.setPriority(Thread.MAX_PRIORITY);  // Priority 10
        t4.setPriority(7);                    // Custom priority 7
        t5.setPriority(3);                    // Custom priority 3

        // Start all threads
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
