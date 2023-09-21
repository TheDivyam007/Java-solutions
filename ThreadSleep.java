public class ThreadSleep {
    public static void main(String[] args) {
        Thread myThread = new Thread(() -> {
            for (int i = 5; i >= 1; i--) {
                try {
                    Thread.sleep(6000); // Sleep for 6 seconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread " + Thread.currentThread().getName() + " - Count: " + i);
                Thread.currentThread().setName("Thread-" + i); // Change thread name
            }
        });

        myThread.start();

        try {
            myThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread name after change: " + myThread.getName());
    }
}
