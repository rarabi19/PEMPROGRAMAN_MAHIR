package Queue.PembagianQueue.BlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;

public class Blocking2 {
    public static void main(String[] args) throws InterruptedException{
        ArrayBlockingQueue<String> blok = new ArrayBlockingQueue<>(5);

        Thread t = new Thread(() ->{
            try {
                blok.put("Zahra");
                blok.put("Zaza");
                blok.put("Zizi");
                System.out.println("\n Data Dalam Antrian   : " + blok);

                System.out.println(" Data Dihapus         : " + blok.take());
                blok.put("Zaya");
                System.out.println("Data Ditambahkan      : Zaya ");

                System.out.println("\n\n === HARAP TUNGGU DATA SEDANG DIPROSES ===");
                Thread.sleep(3000); //3 detik
                System.out.println("Antrian Saat ini      : " + blok);


            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        t.start();
        t.join();
    }
}
