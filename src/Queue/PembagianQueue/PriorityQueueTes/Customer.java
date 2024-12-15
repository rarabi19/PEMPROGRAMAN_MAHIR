package Queue.PembagianQueue.PriorityQueueTes;

import java.util.Comparator;

public class Customer implements Comparator<CustomerPQ> {

    @Override
    public int compare(CustomerPQ o1, CustomerPQ o2) {
        return o1.getJumlah() < o2.getJumlah() ? 1 : -1;
    }
}