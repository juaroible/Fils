package BanyetaButoni;

public class Banyeta extends Thread {

    public void run() {

        try {
            System.out.println("Soc el Banyeta");
            for (int i = 0; i < 5; i++) {
                System.out.println(i + 1);
                sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
