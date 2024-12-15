package ArrayList;
//Array list bersifat Dinamis dimana bisa bertambah besar jika kita menambah data dan akan menjadi kecil ketika kita menghapus data
//Dimana hal ini tidak dapat kitalakukan saat menggunkan Array biara
//Array List dapat menampilkan data yang bersifat Duplikat
//Di Array List kita tidak perlu menentukan panjang data yang akan kita buat
//Array biasa lika menggunakan "lenght" tabi di Array list kita menggunkan istilah "size"
// Gunakan "remove" untuk menghapus
//Data akan ditampilkan sesuai urutan data yang ada didalam Array

import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        array.add("Haniva");
        array.add("Azzahra");
        array.add("Salsabila");

        array.add("Haniva");
        array.add("Azzahra");
        array.add("Salsabila");


        array.remove(0); //menghapus data pada indeks ke satu, jadi data di indeks kesatu akan dihapus dan data indeks 2 akan naik sebagai data indeks kesatu yang baaru

        array.set(1, "Ini Saya Tambahkan Data Baru"); // Mengganti / mengubah data pada indeks ke 1
        System.out.println(array.get(1)); //Menampilkan array list indeks ke satu

        int panjang= array.size();
        System.out.println(panjang);

        //kedua instruksi diatas & bawah ini sama, digunakan untuk menghitung panjang atau banyak data didalam array list

        panjang = array.size();
        System.out.println(panjang);

        for (String value : array){ //Menampilkan Data
            System.out.println(array);
        }

    }
}
