package SimpleDateJava;

import java.text.SimpleDateFormat;
import java.util.Date;

//Untuk membuat tanggal kita bisa menggunakan instruksi :
// SimpleDateFormat
// E --> untuk Hari , jika mau harinya lengkap tulis 4 kali "EEEE"
// h --> jam, pulujan/2 digit "hh"
// m --> menit, puluhan "mm"
// s --> detik, angka puluhan "ss"
// a --> penentuan "am / pm"
// d --> untuk angka hari lengkap  "dd"
// M --> bulan, untuk bukan lengkap "MMMM"
// Y --> tahun lengkap "YYYY"

public class Date1 {
    public static void main(String[] args) {
        SimpleDateFormat format = new SimpleDateFormat("EEEE, dd MMMM YYYY");

        Date tanggal = new Date();
        String hasil = format.format(tanggal);

        System.out.println(hasil);
    }

}
