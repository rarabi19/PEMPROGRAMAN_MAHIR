package Queue.ContohCodeQueue.AntrianBimbingan;

public class Mahasiswa implements Comparable<Mahasiswa>  {
    private String nama;
    private String nim;
    private Double nilaiUjian;

    public Mahasiswa(String nama, String nim, Double nilaiUjian) {
        this.nama = nama;
        this.nim = nim;
        this.nilaiUjian = nilaiUjian;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public Double getNilaiUjian() {
        return nilaiUjian;
    }

    public void setNilaiUjian(Double nilaiUjian) {
        this.nilaiUjian = nilaiUjian;
    }
    @Override
    public String toString() {
        return "* | Nim :" + nim + " , Nama : " + nama + " , Nilai Ujian : " + nilaiUjian;
    }

    @Override
    public int compareTo(Mahasiswa o) {
        return o.nilaiUjian > this.nilaiUjian ? 1 : -1;
    }
}
