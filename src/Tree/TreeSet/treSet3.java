package Tree.TreeSet;
// Cara Agar "TreeSet" Menampilkan data dari bawah ke atas
//Desending != Asending
import java.util.Comparator;


public class treSet3 implements Comparator<String> {
    @Override
    public int compare(String o1, String o2){
        return o1.compareTo(o2) * -1; // (*-1) --> untuk membalikkan susunan
    }



}
