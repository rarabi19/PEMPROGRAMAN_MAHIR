package SimpleDateJava;

import java.util.Calendar;
import java.util.Date;

//set digunakan untuk mengubah tanggal /waktu
//field menentukan parameter yang akan diubah, jika ingin mengubah tahun maka instruksinya
//
public class Date2 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        calendar.set(Calendar.YEAR, 2010);
        calendar.set(Calendar.MONTH, 11);
        calendar.set(Calendar.DATE, 25);

        calendar.set(Calendar.HOUR_OF_DAY, 18);
        calendar.set(Calendar.MINUTE, 20);
        calendar.set(Calendar.SECOND, 45);

        Date waktu = calendar.getTime();

        System.out.println(waktu);
    }
}
