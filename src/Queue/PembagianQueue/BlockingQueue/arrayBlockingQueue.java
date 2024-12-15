package Queue.PembagianQueue.BlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class arrayBlockingQueue {
    public static void main(String[] args) throws InterruptedException {
                ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(3);

                try {
                    // Menambahkan elemen ke dalam antrian
                    queue.put("Zahra");
                    queue.put("Mumu");
                    queue.put("Jesika");
                    System.out.println("Isi antrian: " + queue);

                    // Thread untuk menghapus elemen setelah beberapa waktu
                    new Thread(() -> {
                        try {
                            Thread.sleep(2000); // Simulasi penundaan 2 detik
                            System.out.println("Menghapus elemen: " + queue.take());
                            System.out.println("Isi antrian setelah penghapusan: " + queue);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }).start();

                    // Menambahkan elemen baru ke antrian
                    System.out.println("Menunggu untuk menambahkan elemen 'Joko Susanto'...");
                    queue.put("Joko Susanto"); // Akan menunggu sampai ada ruang kosong
                    System.out.println("Joko Susanto berhasil ditambahkan ke antrian.");
                    System.out.println("Isi antrian akhir: " + queue);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

