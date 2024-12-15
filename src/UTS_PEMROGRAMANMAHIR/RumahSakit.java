package UTS_PEMROGRAMANMAHIR;

import KelasEnum.JenisKelamin;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class RumahSakit <T extends Data> {
    private List<T> Rs = new ArrayList<>();

    public void tambahData(T pasien) {
        Rs.add(pasien);
        System.out.println("*| Nama Dokter : " + pasien.getNama() + ", Nomor ID : " + pasien.getNomorID() + " , Spesialisasi :" + pasien.getSpesialisasi() + "Tempat Paktik : " + pasien.getTempat() + ", Jenis Kelamin :" + pasien.getJenis());
    }

    public void tampilkanData() {
        for (T pasien : Rs) {
            System.out.println(pasien);
        }
    }

    public void urutkanDokter() {
        Rs.sort(Comparator.comparing(Data::getNama));
        tampilkanData();
        Rs.remove(0);
        if (Rs.size() > 1) {
            Rs.set(1, (T) new Data("Haniva Azzahra", "ID2350123200", "Spesialis Kejiwaan", "Klinik Tampan", jenisKelamin.Wanita));
            System.out.println(Rs.get(1));
        } else {
            System.out.println("Tidak Ada Data yang Perlu Di Update");
        }
    }
}
