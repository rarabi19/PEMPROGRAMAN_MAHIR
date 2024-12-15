package Queue.ContohCodeQueue.TestingBefore;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class UrutanBimbingan {
    protected static ArrayDeque<SiswaQue> Antrian1 = new ArrayDeque<>();
    protected static PriorityQueue<SiswaQue> Antrian2 = new PriorityQueue<>(Comparator.reverseOrder());
    protected static BlockingQueue<SiswaQue> Antrian3 = new ArrayBlockingQueue<>(5);

    public static void TampilkAntrian1(){
        System.out.println("\n\n ====== MENAMPILKAN DATA SESUAI URUTAN ANTRIAN [FIFO] ======");
        for (SiswaQue a : Antrian1){
            System.out.println(a);
        }
        System.out.println("\n\n ====== MENAMPILKAN DATA DENGAN URUTAN TERBALIK [LIFO] ======");
        for (Iterator<SiswaQue> it = Antrian1.descendingIterator(); it.hasNext(); ) {
            SiswaQue a = it.next();
            System.out.println(a);
        }
    }
    public static void TampilkanAntrian2(){
        System.out.println("\n\n ====== MENAMPILKAN DATA PIORITY =====");
        for (SiswaQue a : Antrian2){
            System.out.println(a);
        }
    }
    public static void TampilkanAntrian3(){
        System.out.println("\n\n ====== MENAMPILKAN DATA DENGAN BATAS 5 DALAM ANTRIAN =====");
        for (SiswaQue a : Antrian3){
                System.out.println(a);
        }
    }
}
