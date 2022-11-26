public class Zad3 {
    public static void Execute() {
        Thread t1 = new Thread(() -> {
            for(int i = 0; i < 10; i++)
                System.out.println("Counter: " + String.valueOf(i+1) + " on thread: " + 1);
        });

        Thread t2 = new Thread(() -> {
            for(int i = 0; i < 10; i++)
                System.out.println("Counter: " + String.valueOf(i+1) + " on thread: " + 2);
        });

        Thread t3 = new Thread(() -> {
            for(int i = 0; i < 10; i++)
                System.out.println("Counter: " + String.valueOf(i+1) + " on thread: " + 3);
        });

        t1.start();
        t2.start();
        t3.start();
    }
}
