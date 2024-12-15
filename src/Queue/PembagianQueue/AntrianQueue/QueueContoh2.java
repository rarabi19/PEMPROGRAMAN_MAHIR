package Queue.PembagianQueue.AntrianQueue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueContoh2 {
    public static void main(String[] args) {
        Queue<String> msh = new LinkedList<>();
        msh.add("Zahra");
        msh.offer("Julaiha");

        System.out.println("Data Antrian : " + msh);
        System.out.println("Data Yang dihapus :" + msh.remove());
        System.out.println("Antrian Tersisa : " + msh);
    }
}
