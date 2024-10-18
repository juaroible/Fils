package BanyetaButoni;

public class Butoni extends Thread{

    public void run() {

        try {
            System.out.println("Soc el Butoni");
            for (int i = 5; i < 10; i++) {
                System.out.println(i + 1);
                sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
