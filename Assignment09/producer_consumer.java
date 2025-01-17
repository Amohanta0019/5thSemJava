class Q {
    int n;
    boolean valueSet = false;

    synchronized void put(int n) {
        while (valueSet) {
            try {
                wait();
            } catch (InterruptedException ie) {
            }
        }
        this.n = n;
        System.out.println("producer produces item : " + n);
        valueSet = true;
        notify();
    }

    synchronized int get() {
        while (!valueSet) {
            try {
                wait();
            } catch (InterruptedException ie) {
            }
        }
        System.out.println("consumer consumes item : " + n);
        valueSet = false;
        notify();
        return n;
    }
}

class Producer extends Thread {
    Q q;

    Producer(Q q) {
        this.q = q;
    }

    public void run() {
        int i = 0;
        while (true) {
            q.put(i++);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {}
        }
    }
}

class Consumer extends Thread {
    Q q;

    Consumer(Q q) {
        this.q = q;
    }

    public void run() {
        while (true) {
            q.get();
            try {
                Thread.sleep(1000);
            } catch (Exception e) {}
        }
    }
}

public class producer_consumer {
    public static void main(String[] args) {
        Q q = new Q();
        Producer p = new Producer(q);
        Consumer c = new Consumer(q);

        p.start();
        c.start();
    }

}
