package TombaTossals;

public class TombaTossals extends Thread{

    String MISSATGE = "El TombaTossals saluda!";

    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println(MISSATGE);
                sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}