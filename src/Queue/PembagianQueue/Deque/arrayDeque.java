package Queue.PembagianQueue.Deque;
// Methode Utama : addFirst(), addLast(), offerFirst(), offerLast()
//removeFirst(), removeLast(), pollFirst(), pollLast()
//peekFirst(), peekLast(), getFirst(), getLast()

import java.util.ArrayDeque;

public class arrayDeque {
    public static void main(String[] args) {

        ArrayDeque<String> antrian = new ArrayDeque<>();
        antrian.offer("Haniva");
        antrian.offer("Azzahra");
        antrian.offer("Salsabila");
        antrian.offer("Haniva");
        antrian.offer("Azzahra");
        antrian.offer("Salsabila");
        
        antrian.offerFirst("Nama Kamu"); //Menambahkan data Diawal
        antrian.offerLast("Singkat Saja"); //Menambahkan data diakhir

        antrian.pollFirst(); //Menghapus data Awal
        antrian.pollLast(); //Menghapus data Akhir

        System.out.println(antrian);
    }
}
