package Queue.ContohCodeQueue.AntrianBimbingan;
//protected static sering digunakan untuk variabel atau metode yang:
// Dapat diakses oleh kelas lain dalam paket yang sama.


import Queue.ContohCodeQueue.PembelianTiket.Penumpang;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class susunanAntrian {

    protected static Queue<Mahasiswa> antrian1 = new LinkedList<Mahasiswa>(); //Menampilkan data sesuai urutan di Queue [FIFO]
    protected static ArrayDeque<Mahasiswa> antrian2 = new ArrayDeque<>(); // Menampilkan data dari paling terakhir [LIFO]
    protected static PriorityQueue<Mahasiswa> antrian3 = new PriorityQueue<>(Comparator.reverseOrder()); //menampilkan data secara dsc
    protected static ArrayBlockingQueue<Mahasiswa> antrian4 = new ArrayBlockingQueue<>(5);

    public static void tampilkanAntrian1() {
        System.out.println(" ==== PENAMPILAN DATA BERDASARKAN URUTAN PENGAJUAN BIMBINGAN [FIFO] ====");
        for (Mahasiswa a : antrian1) {
            System.out.println(a);
        }
    }

    public static void tampilkanAntrian2() {
        System.out.println(" \n ==== PENAMPILAN DATA BERDASARKAN URUTAN TERAKHIR KE PERTAMA [LIFO] ====");
        for (Iterator<Mahasiswa> it = antrian2.descendingIterator(); it.hasNext(); ) {
            Mahasiswa a = it.next();
            System.out.println(a);
        }
    }
    public static void tampilkanAntrian3() {
        System.out.println(" \n ==== PENAMPILAN DATA NILAI TERENDAH LEBIH DAHULU LALU SETELAHNYA RANDOM ====");
        for (Mahasiswa a : antrian3) {
            System.out.println(a);
        }
    }
        public static void tampilkanAntrian4() {
            System.out.println(" \n ==== PENAMPILAN DATA DENGAN BATAS 5 ORANG ====");
            for (Mahasiswa a : antrian4) {
                System.out.println(a);
        }
    }
}
