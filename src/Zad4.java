public class Zad4 {
    public static void Execute() {
        Thread t1 = new Thread(() -> {
            for(int i = 0; i < 10000; i++)
                System.out.println("Counter: " + String.valueOf(i+1) + " on thread: " + 1);
        });

        Thread t2 = new Thread(() -> {
            for(int i = 0; i < 10000; i++)
                System.out.println("Counter: " + String.valueOf(i+1) + " on thread: " + 2);
        });

        t2.setPriority(10);
        t1.setPriority(1);

        t1.start();
        t2.start();
    }
}
