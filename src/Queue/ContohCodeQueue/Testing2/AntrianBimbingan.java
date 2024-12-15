package Queue.ContohCodeQueue.Testing2;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class AntrianBimbingan {
    protected static ArrayDeque<murid> antrian1 = new ArrayDeque<>();
    protected static PriorityQueue<murid> antrian2 = new PriorityQueue<>(Comparator.reverseOrder());
    protected static ArrayBlockingQueue<murid> antrian3 = new ArrayBlockingQueue<>(5);

    public static void TampilkanAntrian1(){
        System.out.println("\n ====== MENAMPILKAN ANTRIAN SECARA FIFO ======");
        for (murid a : antrian1){
            System.out.println(a);
        }

        System.out.println("\n ====== MENAMPILKAN ANTRIAN SECARA LIFO ======");
        for (Iterator<murid> it = antrian1.descendingIterator(); it.hasNext(); ) {
            murid a = it.next();
            System.out.println(a);
        }
    }
    public static void TampilkanAntrian2() {
        System.out.println("\n ====== MENAMPILKAN PRIORITY NILAI TERENDAH ======");
        for (murid a : antrian2) {
            System.out.println(a);
        }
    }
    public static void TampilkanAntrian3() {
        System.out.println("\n ====== MENAMPILKAN 5 DATA DALAM ANTRIAN ======");
        for (murid a : antrian3) {
            System.out.println(a);
        }
    }
}
