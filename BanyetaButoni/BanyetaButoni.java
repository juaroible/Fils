package BanyetaButoni;
public class BanyetaButoni extends Thread{
    
    public static void main(String[] args) {

        Banyeta banyeta = new Banyeta();
        Butoni butoni = new Butoni();

        try {
            banyeta.start();
            banyeta.join();
            butoni.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
    }

}
