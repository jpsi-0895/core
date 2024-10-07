# join() method

The `join()` method is used to wait for a thread to complete its execution before proceeding with the next line of code in the calling thread.

This is particularly useful when you need to ensure that a thread has finished its task before continuing, allowing you to coordinate the execution flow of multiple threads.

```java
class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Count: " + i);
            try {
                Thread.sleep(100); // Simulate work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();

        thread1.start(); // Start the first thread
        thread2.start(); // Start the second thread

        try {
            thread1.join(); // Wait for thread1 to finish
            thread2.join(); // Wait for thread2 to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Both threads have finished executing.");
    }
}

```
