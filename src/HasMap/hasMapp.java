package HasMap;
//Struktur data HashMap
// HashSet dan ArrayList saat kita menambahkan data kita menambahkan 1 data
//di HasMap saat kita menambahkan data kita akan menambahkan 2 hal yakni "Key" dan "value" nya
//Dimana "Key" ---> "id Data"
// "Value" ---> "data nya"
// Menambahkan data tidak menggunakna instruksi "add" tapi "put"
//untuk menampilkan semua data tidak bisa menggunkan for(loop) sebab hashmap mempunyai 2 tipe data
//tapi kita bisa menggunakan set, lalu baru gunakan for(loop)

import java.util.HashMap;
import java.util.Set;

public class hasMapp {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "zahra");
        map.put(3, "haniva");
        map.put(5, "zakia");
        map.put(4, "najla");

        map.remove(9); //menghapus data pada index "key"
        System.out.println(map.get(3)); //menampilkan data pada bagian tertentu saja

        Set<Integer> set = map.keySet(); //--> tambahkan set agar for its bisa digunakan

        for(Integer value : set){ //menampilkan indeks keys yang tersimpan di program
            System.out.println(value);
        }

        for (String value : map.values()){ //menampilkan value data yang tersimpan "String"
            System.out.println(value);
        }
    }
}
