package HashSet;
//Dalam Haset data yang ditampung tidak akan Duplikat
//jika dalam suatu Program ada 3 data yang sama maka hanya akan dianggap 1 saja
//Hasset tidak dapat mengambil data berdasarkan indeks menggunakan "Get"
//Indeks Haset juga tidak teratur saat di running
//Dengan kata lain Haset menampilkan data secara Acak
//Haset membandingkan data dengan equals "True", jika sama maka hanya akan ditampilkan satu

import java.util.HashSet;

public class hasett {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        set.add("Haniva");
        set.add("Azzahra");
        set.add("Salsabila");

        set.add("Haniva");
        set.add("Azzahra");
        set.add("Salsabila");

        set.add("Haniva");
        set.add("Azzahra");
        set.add("Salsabila");

        for(String value : set){
            System.out.println(value);
        }
    }
}
