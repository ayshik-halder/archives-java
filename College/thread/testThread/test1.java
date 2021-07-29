

class MultithreadingD extends Thread {
    public void run() {
        try {
            System.out.println("Thread " + Thread.currentThread().getId() + " is running");
        } catch (Exception e) {
            System.out.println("Exception caught");
        }
    }
}

public class test1 {
    public static void main(String[] args) {
        int n = 20;
        for (int i = 0; i < n; i++) {
            MultithreadingD obj = new MultithreadingD();
            obj.start();
        }
    }
}

