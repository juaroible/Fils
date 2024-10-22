package ThreadVsRunnable;

public class ThreadVsRunnable {

    public static void main(String[] args) {
        
        ComptaRunnable cRunnable = new ComptaRunnable();
        Thread fRunnable = new Thread(cRunnable);
        ComptaThread cThread = new ComptaThread();

        cThread.start();
        fRunnable.start();

    }

}