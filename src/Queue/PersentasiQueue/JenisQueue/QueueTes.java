package Queue.PersentasiQueue.JenisQueue;


import java.util.LinkedList;
import java.util.Queue;

public class QueueTes {
    public static void main(String[] args) {
        Queue<String> que = new LinkedList<>();

        que.add("jojo");
        que.add("jeje");
        que.add("juju");
        que.add("jeje");

        System.out.println("Data Awal :" +  que);

        System.out.println("Data di awal :" + que.poll());
        System.out.println("Data Akhir" + que);


    }
}
