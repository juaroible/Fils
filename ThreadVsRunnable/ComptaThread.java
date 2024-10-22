package ThreadVsRunnable;

public class ComptaThread extends Thread{

    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread: " + (i + 1));
                sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}