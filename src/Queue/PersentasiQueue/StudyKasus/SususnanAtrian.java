package Queue.PersentasiQueue.StudyKasus;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class SususnanAtrian {

    protected static ArrayDeque<Mahasiswa> antrian1 = new ArrayDeque<>();
    protected  static PriorityQueue<Mahasiswa> antrian2 = new PriorityQueue<>(Comparator.reverseOrder());
    protected static ArrayBlockingQueue<Mahasiswa> antrian3 = new ArrayBlockingQueue<>(5);


    public static void TampilkanAntrian1(){
        System.out.println("\n === TAMPILKAN DATA SECARA URUT [FIFO] ");
        for (Mahasiswa a : antrian1){
            System.out.println(a);
        }

        System.out.println("=\n == TAMPILKAN DATA SECARA TERBALIK [LIFO] ");
        for (Iterator<Mahasiswa> it = antrian1.descendingIterator(); it.hasNext(); ) {
            Mahasiswa a = it.next();
            System.out.println(a);
        }
    }
    public static void TampilkanAntrian2() {
        System.out.println("=\n == TAMPILKAN DATA SISWA NILAI TERENDAH LEBIH DAHULU === ");
        for (Mahasiswa a : antrian2) {
            System.out.println(a);
         }
        }
    public static void TampilkanAntrian3() {
        System.out.println("\n === ATRIAN HANYA BERKAPASITAS 5 ORANG === ");
        for (Mahasiswa a : antrian3) {
            System.out.println(a);
        }
    }
    }

