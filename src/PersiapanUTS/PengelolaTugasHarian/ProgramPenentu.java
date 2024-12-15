package PersiapanUTS.PengelolaTugasHarian;

public class ProgramPenentu {
    public static void main(String[] args) {
        DaftarTugas<Tugas> a = new DaftarTugas<>();
        System.out.println("===== MASUKKAN TUGAS =====");
        a.addTgs(new Tugas("Persiapan UTS Pemrograman Mahir ", PrioritasTugas.TINGGI));
        a.addTgs(new Tugas("Mencari Data Keuangan Masjid DataBase ", PrioritasTugas.SEDANG));
        a.addTgs(new Tugas("Persentasi Teori Bahasa Otomata ", PrioritasTugas.RENDAH));
        a.addTgs(new Tugas("Persentasi Sejarah Asia Tenggara ", PrioritasTugas.RENDAH));
        a.addTgs(new Tugas("Beli Beras Persedian Kos!! ", PrioritasTugas.TINGGI));
        a.addTgs(new Tugas("Beli Baju Kelas BradE ", PrioritasTugas.RENDAH));
        a.addTgs(new Tugas("Perdiapan UTS Aljabar Liner ", PrioritasTugas.TINGGI));
        a.addTgs(new Tugas("Persiapan UTS Bahasa Arab ", PrioritasTugas.TINGGI));

        System.out.println();
        System.out.println("===== LIST KELOMPOK TUGAS ======");
        a.tampilkanPrioritas();

        System.out.println();
        System.out.println("====== TOTAL TUGAS KESELURUHAN ======");
        System.out.println("Tugas Prioritas Tinggi : " + a.hitungJumlahTugas(PrioritasTugas.TINGGI));
        System.out.println("Tugas Prioritas Sedang : " + a.hitungJumlahTugas(PrioritasTugas.SEDANG));
        System.out.println("Tugas Prioritas Rendah : " + a.hitungJumlahTugas(PrioritasTugas.RENDAH));
    }
}
