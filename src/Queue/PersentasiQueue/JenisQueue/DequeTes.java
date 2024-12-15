package Queue.PersentasiQueue.JenisQueue;

import java.util.ArrayDeque;

public class DequeTes {
    public static void main(String[] args) {
        ArrayDeque<String> antrian = new ArrayDeque<>();
        antrian.add("jeje");
        antrian.add("juju");
        antrian.add("jeje");

        antrian.addFirst("zahra");

        antrian.poll();
        antrian.pollLast();
        System.out.println(antrian);



    }
}
