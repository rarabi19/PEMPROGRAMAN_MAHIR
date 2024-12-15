package PersiapanUTS.PengelolaTugasHarian;

import java.util.ArrayList;
import java.util.List;

public class DaftarTugas <T extends Tugas> {
    List<T> a = new ArrayList<>();


    public void addTgs(T tugas){
        a.add(tugas);
        System.out.println(tugas + " ' berhasil ditambahkan");
    }
    public int hitungJumlahTugas (PrioritasTugas prioritas){
        return hitungJumlahTugasRekursif(prioritas, 0);
    }
    private int hitungJumlahTugasRekursif(PrioritasTugas prioritas, int index) {
        if (index >= a.size()) {
            return 0;
        }
        T tugas = a.get(index);
        int jumlah = (tugas.getProritas() == prioritas) ? 1 : 0;

        return  jumlah + hitungJumlahTugasRekursif(prioritas, index + 1);
    }
    public void tampilkanPrioritas() {
        // Menampilkan tugas berdasarkan prioritas TINGGI, SEDANG, dan RENDAH
        System.out.println();
        System.out.println("===== TUGAS PRIORITAS TINGGI ======");
        for (T tugas1 : a) {
            if (tugas1.getProritas() == PrioritasTugas.TINGGI) {
                System.out.println(tugas1);
            }
        }
        System.out.println();
        System.out.println("===== TUGAS PRIORITAS SEDANG ======");
        for (T tugas1 : a) {
            if (tugas1.getProritas() == PrioritasTugas.SEDANG) {
                System.out.println(tugas1);
            }
        }
        System.out.println();
        System.out.println("===== TUGAS PRIORITAS RENDAH ======");
        for (T tugas1 : a) {
            if (tugas1.getProritas() == PrioritasTugas.RENDAH) {
                System.out.println(tugas1);
            }
        }
    }
}
