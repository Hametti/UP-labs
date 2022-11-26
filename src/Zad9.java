 //Uncomment this code, and comment Zad8.java due to class name duplicates

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Zad9 {
    public static void Execute() {
        Counter counter = new Counter();

        MyCounterThread_Increment t1 = new MyCounterThread_Increment(counter);
        MyCounterThread_GetValue t2 = new MyCounterThread_GetValue(counter);

        t1.start();
        t2.start();
    }
}

class MyCounterThread_Increment extends Thread{
    public Counter counter;
    MyCounterThread_Increment(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            counter.increment();
            System.out.println("Incremented");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) { }
        }
    }
}

class MyCounterThread_GetValue extends Thread {
    public Counter counter;
    MyCounterThread_GetValue(Counter counter) {
        this.counter = counter;
    }

    public void run(){
        for (int i = 0; i < 10; i++) {
            int currentValue = counter.getValue();
            System.out.println("getValue result:" + currentValue);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) { }
        }
    }
}

class Counter {
    private int value = 0;
    private Lock lock = new ReentrantLock();

    synchronized public void increment() {
        lock.lock();
        try {
            value++;
        } finally {
            lock.unlock();
        }
    }

    public int getValue() {
        lock.lock();
        try {
            return value;
        } finally {
            lock.unlock();
        }
    }
}
