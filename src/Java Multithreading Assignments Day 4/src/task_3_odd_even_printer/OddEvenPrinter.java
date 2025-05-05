package task_3_odd_even_printer;

public class OddEvenPrinter {
    private int number = 1;
    private final int MAX = 100;
    private final Object lock = new Object();

    public void printOdd() {
        synchronized (lock) {
            while (number <= MAX) {
                if (number % 2 == 0) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                } else {
                    System.out.print("\n " + number);
                    number++;
                    lock.notify();
                }
            }
        }
    }

    public void printEven() {
        synchronized (lock) {
            while (number <= MAX) {
                if (number % 2 != 0) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                } else {
                    System.out.print("\n " + number);
                    number++;
                    lock.notify();
                }
            }
        }
    }
}

