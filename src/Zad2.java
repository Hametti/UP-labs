public class Zad2 {
    public static void Execute() {
        System.out.println("Before sleep");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) { }
        System.out.println("After sleep");
    }
}
