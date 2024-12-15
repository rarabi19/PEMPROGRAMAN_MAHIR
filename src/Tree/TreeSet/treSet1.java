package Tree.TreeSet;
// TreeSet digunakan untuk menampung koleksi Data
// Dimana data yang dimasukkan ke program secara Otomatis akan diurutkan secara Assending (dari yang terkecil ke yang terbesar)
//TreeSet hanya Menampung 1 tipe data saja
// Tidak menerima data yang Duplikat, jika ada data yang ganda maka hanya akan dianggap 1 saja

import java.util.TreeSet;

public class treSet1 {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();

        set.add(15);
        set.add(6);
        set.add(1);
        set.add(10);
        set.add(6); //Ganda hanya akan dianggap 1
        set.add(23);
        set.add(3);

        set.remove(15); //menghapus data tertentu
        for(Integer value : set){
            System.out.println(value);
        }
    }
}
