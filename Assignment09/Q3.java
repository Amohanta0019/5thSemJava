class MyThread1 extends Thread {
    MyThread1(String name, int priority) {
        setName(name);         // Set thread name
        setPriority(priority); // Set thread priority
    }

  
    public void run() {
        System.out.println("Thread Name: " + getName() + ", Priority: " + getPriority() + " is running.");
        for (int i = 1; i <= 3; i++) {
            System.out.println(getName() + " is running for " + i+"-th time");
        }
    }
}

public class Q3 {
    public static void main(String[] args) {
        // Create and initialize 5 threads with custom names and priorities
        MyThread1 t1 = new MyThread1("Thread-1", Thread.MIN_PRIORITY); // Priority 1
        MyThread1 t2 = new MyThread1("Thread-2", Thread.NORM_PRIORITY); // Priority 5
        MyThread1 t3 = new MyThread1("Thread-3", Thread.MAX_PRIORITY); // Priority 10
        MyThread1 t4 = new MyThread1("Thread-4", 7); // Custom Priority 7
        MyThread1 t5 = new MyThread1("Thread-5", 3); // Custom Priority 3

        // Start all threads
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
