package ThreadVsRunnable;

public class ComptaRunnable implements Runnable{

    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Runnable: " + (i + 1));
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}