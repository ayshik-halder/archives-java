class RunnableDem implements Runnable {
    public Thread t;
    String ThName;
    boolean suspended = false;

    RunnableDem(String name) {
        ThName = name;
        System.out.println("Creating " + ThName);
    }

    @Override
    public void run() {
        System.out.println("Running " + ThName);
        try {
            for (int i = 10; i > 0; i--) {
                System.out.println("Thread: " + ThName + ", " + i);
                Thread.sleep(300);
                synchronized (this) {
                    while (suspended) {
                        wait();
                    }
                }
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + ThName + " interrupted.");
        }
        System.out.println("Tread " + ThName + " exiting.");
    }

    public void start() {
        System.out.println("Starting " + ThName);
        if (t == null) {
            t = new Thread(this, ThName);
            t.start();
        }
    }

    void suspend() {
        suspended = true;
    }

    synchronized void resume() {
        suspended = false;
        notify();
    }
}

public class runnableThread {
    public static void main(String[] args) {
        RunnableDem R1 = new RunnableDem("Thread-1");
        R1.start();
        RunnableDem R2 = new RunnableDem("Thread-2");
        R2.start();
        try {
            Thread.sleep(100);
            R1.suspend();
            System.out.println("Suspending First Thread");
            Thread.sleep(100);
            R1.resume();
            System.out.println("Resuming First Thread");
            R2.suspend();
            System.out.println("Suspending Second Thread");
            Thread.sleep(100);
            R2.resume();
            System.out.println("Resuming Second Thread");
        } catch (InterruptedException e) {
            System.out.println("Main Thread Interrupted");
        }
        try {
            System.out.println("Waiting for thread to finish.");
            R1.t.join();
            R2.t.join();
        } catch (InterruptedException e) {
            System.out.println("Main Thread Interrupted");
        }
        System.out.println("Main Thread Exiting");
    }
}
