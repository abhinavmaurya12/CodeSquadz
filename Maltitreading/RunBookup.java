import javax.swing.*;
import javax.swing.*;
class ShutdownBooks implements Runnable {

    public void run() {
        System.out.println("***Application Shutting down***");
		
        ShutdownBooks1 book = new ShutdownBooks1();

        Thread t1 = new Thread(book);
        t1.start();

        try {
            t1.join();
        } catch (Exception e) {
            // Thread.currentThread().interrupt();
        }

        System.out.println("***After Backup***");
    }
}

class ShutdownBooks1 implements Runnable {

    public void run() {
        System.out.println("***Taking backup and closing resources***");

        try {
            Thread.sleep(1000 * 5);
        } catch (Exception e) {
            // Thread.currentThread().interrupt();
        }
    }
}

class RunBookup {

    public static void main(String[] arg) {

        Runtime runTime = Runtime.getRuntime();
        ShutdownBooks hook = new ShutdownBooks();

        // Registering the Shutdown Hook
        runTime.addShutdownHook(new Thread(hook));

        // System.exit(0);
        // int x = 10 / 0;

        JFrame testFrame = new JFrame("Test Frame");
        testFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        testFrame.setSize(400, 400);
        testFrame.setVisible(true);
        System.out.println("hello");
    }
}