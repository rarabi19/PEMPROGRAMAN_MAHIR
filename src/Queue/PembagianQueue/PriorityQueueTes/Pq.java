package Queue.PembagianQueue.PriorityQueueTes;

import java.util.PriorityQueue;
import java.util.Queue;

public class Pq {
    public static void main(String[] args) {
        Queue<CustomerPQ> pembeli = new PriorityQueue<>(new Customer());
        pembeli.add(new CustomerPQ(1,50.0,"Clara"));
        pembeli.add(new CustomerPQ(8,57.0,"Caca"));
        pembeli.add(new CustomerPQ(15,30.0,"Cici"));
        pembeli.add(new CustomerPQ(20,10.0,"Coco"));
        pembeli.add(new CustomerPQ(3,20.0,"Cloro"));
        pembeli.add(new CustomerPQ(6,70.0,"Clini"));

        System.out.println(pembeli);
        System.out.println("Data yang dihapus"+ pembeli.poll());
        System.out.println(pembeli);

    }
}
