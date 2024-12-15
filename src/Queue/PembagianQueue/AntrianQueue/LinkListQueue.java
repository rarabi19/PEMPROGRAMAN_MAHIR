package Queue.PembagianQueue.AntrianQueue;

import java.util.LinkedList;

public class LinkListQueue {
    public static void main(String[] args) {
        LinkedList<String> eyya = new LinkedList<>();

        eyya.offer("Zaza");
        eyya.offer("mona");
        eyya.offer("Sandi");
        eyya.offer("Peta");

        System.out.println(eyya);

        eyya.poll();
        System.out.println(eyya);
    }
}
