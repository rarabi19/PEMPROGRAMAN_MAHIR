package Queue.PembagianQueue.AntrianQueue;

import java.util.LinkedList;
import java.util.Queue;

public class BelajarQueue {
    public static void main(String[] args) {
        Queue<String> que = new LinkedList<>();
        que.add("jojo");
        que.add("jiji");
        que.add("juju");
        que.add("jaja");

        System.out.println("Data Awal          : " + que);

        System.out.println("Data yang di Hapus : " + que.poll());
        System.out.println("Hasil Akhir        : " + que);

    }
}
