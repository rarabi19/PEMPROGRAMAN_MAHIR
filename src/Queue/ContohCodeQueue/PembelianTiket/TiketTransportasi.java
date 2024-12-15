package Queue.ContohCodeQueue.PembelianTiket;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class TiketTransportasi {

    protected static Queue<Penumpang> terminal1 = new LinkedList<>();
    protected static ArrayDeque<Penumpang> terminal2 = new ArrayDeque<>();
    protected static PriorityQueue<Penumpang> terminal3 = new PriorityQueue<>(Comparator.reverseOrder());
    protected static ArrayBlockingQueue<Penumpang> terminal4 = new ArrayBlockingQueue<>(3);

    public static void tampilkanterminal1(){
        System.out.println(" \n ==== TAMPILKAN DATA MENGGUNAKAN QUEUE STANDAR ===== ");
        for (Penumpang a : terminal1){
            System.out.println(a);
        }
    }
    public static void tampilkanterminal2(){
        System.out.println(" \n ==== TAMPILKAN DATA MENGGUNAKAN DEQUE STANDAR ===== ");
        for (Iterator<Penumpang> it = terminal2.descendingIterator(); it.hasNext(); ) {
            Penumpang a = it.next();
            System.out.println(a);
        }
    }
    public static void tampilkanterminal3(){
        System.out.println(" \n ==== TAMPILKAN DATA MENGGUNAKAN PRIORITY QUEUE STANDAR ===== ");
        for (Penumpang a : terminal3){
            System.out.println(a);
        }
    }
    public static void tampilkanterminal4(){
        System.out.println(" \n ==== TAMPILKAN DATA MENGGUNAKAN BLOCKING QUEUE STANDAR ===== ");
        for (Penumpang a : terminal4){
            System.out.println(a);
        }
    }

}
