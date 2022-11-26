// Comment/uncomment lines 27 & 28 to switch between synchronized and not synchronized
public class Zad5 {
    public static void Execute() {
        var samePrinter = new Printer();

        MyPrinterThread t1 = new MyPrinterThread(samePrinter, 1, 1);
        MyPrinterThread t2 = new MyPrinterThread(samePrinter, 2, 2);
        MyPrinterThread t3 = new MyPrinterThread(samePrinter, 3, 3);

        t1.start();
        t2.start();
        t3.start();
    }
}

class MyPrinterThread extends Thread {
    public Printer printer;
    int mod;
    int printerThread;
    MyPrinterThread(Printer printer, int mod, int printerThread) {
        this.printer = printer;
        this.mod = mod;
        this.printerThread = printerThread;
    }

    public void run() {
//      printer.printNumbers(mod, printerThread);
        printer.printNumbersSync(mod, printerThread);
    }
}

class Printer {
    public void printNumbers(int mod, int printerThread) {
        for(int i = 0; i < 10; i++) {
            var result = (i+1)*mod;
            System.out.println("Printer thread: " + printerThread + " mod result: " + result);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) { }
        }
    }

    public synchronized void printNumbersSync(int mod, int printerThread) {
        for(int i = 0; i < 10; i++) {
            var result = (i+1)*mod;
            System.out.println("Printer thread: " + printerThread + " mod result: " + result);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) { }
        }
    }
}
