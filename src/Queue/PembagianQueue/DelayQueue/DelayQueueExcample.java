package Queue.PembagianQueue.DelayQueue;

//DelayQueue sering digunakan untuk tugas-tugas yang membutuhkan penundaan, seperti penjadwalan tugas yang harus dieksekusi di masa depan atau membatasi waktu pemrosesan elemen tertentu.
// tidak memiliki batasan kapasitas (unbounded), sehingga dapat terus menambah elemen selama memori tersedia.
// DelayQueue adalah implementasi dari BlockingQueue dalam Java yang digunakan untuk menyimpan elemen-elemen yang hanya bisa diambil dari antrian setelah waktu tertentu (delay) telah berlalu.
// Delayed, yang menentukan seberapa lama elemen tersebut harus tertunda sebelum bisa diambil dari antrian.

import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class DelayQueueExcample {

    public static void main(String[] args) throws InterruptedException {
        DelayQueue<DelayedElement> queue = new DelayQueue<>();

        // Menambahkan elemen ke DelayQueue dengan delay berbeda
        queue.put(new DelayedElement("Element 1", 5000)); // 5 detik
        queue.put(new DelayedElement("Element 2", 1000)); // 1 detik
        queue.put(new DelayedElement("Element 3", 3000)); // 3 detik

        // Mengambil elemen dari DelayQueue
        while (!queue.isEmpty()) {
            DelayedElement element = queue.take();  // Akan memblokir sampai delay elemen habis
            System.out.println("Mengambil: " + element.getName());
        }
    }

    // Kelas DelayedElement yang mengimplementasikan antarmuka Delayed
    static class DelayedElement implements Delayed {
        private final String name;
        private final long delayTime;
        private final long startTime;

        public DelayedElement(String name, long delayTime) {
            this.name = name;
            this.delayTime = delayTime;
            this.startTime = System.currentTimeMillis() + delayTime;
        }

        public String getName() {
            return name;
        }

        // Metode ini mengembalikan sisa waktu delay dari elemen
        @Override
        public long getDelay(TimeUnit unit) {
            long diff = startTime - System.currentTimeMillis();
            return unit.convert(diff, TimeUnit.MILLISECONDS);
        }

        // Metode ini menentukan urutan elemen berdasarkan waktu delay mereka
        @Override
        public int compareTo(Delayed o) {
            if (this.startTime < ((DelayedElement) o).startTime) {
                return -1;
            }
            if (this.startTime > ((DelayedElement) o).startTime) {
                return 1;
            }
            return 0;
        }
    }
}
