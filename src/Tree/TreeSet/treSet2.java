package Tree.TreeSet;

//data diurutkan secara Assending dari Huruf besar Kekecil (kapital - nonKapital),
// baru diurutkan berdasarkan abjad


import java.util.TreeSet;

public class treSet2 {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>(new treSet3());
        // new treSet3 memanggil kelas untuk menampilkan hasil Dissending/urut dari bawah ke atas
        //jika ingin menampilkan tetap urut hapus instruksi "treSet3"

        set.add("Haniva");
        set.add("Burnia");
        set.add("Lucika");
        set.add("budiana");
        set.add("diana");
        set.add("Yudiana");

        for (String value : set){
            System.out.println(value);
        }
    }

}
