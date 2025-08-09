package ThreadExample;
class Table {
    synchronized void printTable(int n) {
        for (int i = 1; i <= 20; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

public class SyncLambdaExample {
    public static void main(String[] args) {
        Table t = new Table(); // shared object

        // Using lambda expressions instead of creating separate thread classes
        Thread t1 = new Thread(() -> t.printTable(5));
        Thread t2 = new Thread(() -> t.printTable(100));

        t1.start();
        t2.start();
    }
}

