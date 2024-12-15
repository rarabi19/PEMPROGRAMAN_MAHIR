package Queue.PersentasiQueue.StudyKasus;

public class Mahasiswa implements Comparable<Mahasiswa> {
    private String Nama;
    private String Nim;
    private Double NilaiUjian;

    public Mahasiswa(String nama, String nim, Double nilaiUjian) {
        this.Nama = nama;
        this.Nim = nim;
        this.NilaiUjian = nilaiUjian;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        Nama = nama;
    }

    public String getNim() {
        return Nim;
    }

    public void setNim(String nim) {
        Nim = nim;
    }

    public Double getNilaiUjian() {
        return NilaiUjian;
    }

    public void setNilaiUjian(Double nilaiUjian) {
        NilaiUjian = nilaiUjian;
    }

    @Override
    public String toString() {
        return "*| Nama='" + Nama + ", Nim='" + Nim +", NilaiUjian=" + NilaiUjian;
    }

    @Override
    public int compareTo(Mahasiswa o) {
        return o.getNilaiUjian().compareTo(this.getNilaiUjian());
    }
}
