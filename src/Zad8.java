//
//public class Zad8 {
//    public static void Execute() {
//        Counter counter = new Counter();
//
//        MyCounterThread_Increment t1 = new MyCounterThread_Increment(counter);
//        MyCounterThread_GetValue t2 = new MyCounterThread_GetValue(counter);
//
//        t1.start();
//        t2.start();
//    }
//}
//
//class MyCounterThread_Increment extends Thread{
//    public Counter counter;
//    MyCounterThread_Increment(Counter counter) {
//        this.counter = counter;
//    }
//
//    public void run() {
//        for (int i = 0; i < 10; i++) {
//            counter.increment();
//            System.out.println("Incremented");
//            try {
//                Thread.sleep(200);
//            } catch (InterruptedException e) { }
//        }
//    }
//}
//
//class MyCounterThread_GetValue extends Thread {
//    public Counter counter;
//    MyCounterThread_GetValue(Counter counter) {
//        this.counter = counter;
//    }
//
//    public void run(){
//        for (int i = 0; i < 10; i++) {
//            int currentValue = counter.getValue();
//            System.out.println("getValue result:" + currentValue);
//            try {
//                Thread.sleep(200);
//            } catch (InterruptedException e) { }
//        }
//    }
//}
//
//class Counter {
//    private int value = 0;
//
//    synchronized public void increment() {
//        value++;
//    }
//
//    public int getValue() {
//        return value;
//    }
//}
