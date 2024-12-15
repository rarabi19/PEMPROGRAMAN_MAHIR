package Queue.PersentasiQueue.JenisQueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueTes {
    public static void main(String[] args) {
        PriorityQueue<Integer> nama = new PriorityQueue<>(Comparator.reverseOrder());
        nama.offer(1);
        nama.offer(15);
        nama.offer(3);
        nama.offer(0);


        System.out.println(nama);

        }
    }
