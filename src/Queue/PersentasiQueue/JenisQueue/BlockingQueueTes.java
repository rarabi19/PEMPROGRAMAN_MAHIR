package Queue.PersentasiQueue.JenisQueue;

import java.util.concurrent.ArrayBlockingQueue;

public class BlockingQueueTes {
    public static void main(String[] args) throws InterruptedException{
        ArrayBlockingQueue<String> blok = new ArrayBlockingQueue<>(5);
        Thread t = new Thread(() -> {
            try{
                blok.put("Zaza");
                blok.put("Zizi");
                blok.put("zuzu");
                System.out.println(" Data Dalam Antrian : "+ blok);

                System.out.println("Hapus data : " + blok.take());
                System.out.println("\n === DATA SEDANG DIPROSES ===");

                Thread.sleep(3000);  //3 detik

                System.out.println("Data Tersisa" + blok);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        t.start();
        t.join();

    }
}
