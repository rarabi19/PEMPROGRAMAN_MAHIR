package Queue.PembagianQueue.PriorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;
//Data output secara default mengurutkan elemen dalam urutan naik. perlu dingat data yang dihasilkan tidak lah urut 100%
// sebab PriorityQueue hanya mengambil patokan data pertama haruslah data yang paling kecil
// Methode Utama : add(), offer(), peek(), poll(), remove()
//dengan kata lain elemen dengan muatan terkecil akan keluar lebih dahulu

public class ProrityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> nama = new PriorityQueue<>(); // mengurutkan data dsc
        nama.offer(8);
        nama.offer(1);
        nama.offer(100);
        nama.offer(70);
        nama.offer(0);

        System.out.println(nama);
        System.out.println(nama.poll());
        System.out.println(nama);

    }
}

//urutan output : parent, Lchild, Rchild