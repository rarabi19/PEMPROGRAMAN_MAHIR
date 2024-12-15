package Queue.PembagianQueue.Deque;

import java.util.ArrayDeque;
import java.util.Iterator;

public class Belajar2 {
    public static void main(String[] args) {
        ArrayDeque<String> deq = new ArrayDeque<>();

        deq.add("Zahra");
        deq.add("Mumu");
        deq.add("Jesika");

        System.out.println(deq);
        deq.addFirst("Joko Susanto");
        deq.poll();
        deq.pollLast();
        System.out.println(deq);

        deq.add("yona");
        deq.add("tara");
        deq.add("tiri");
        System.out.println(deq);

        for (Iterator<String> it = deq.descendingIterator(); it.hasNext(); ) {
            String a = it.next();
            System.out.print(a + ", ");
        }
        }
    }
