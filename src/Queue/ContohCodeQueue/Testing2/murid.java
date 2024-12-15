package Queue.ContohCodeQueue.Testing2;

public class murid implements Comparable<murid> {
    private String Nama;
    private String Nim;
    private Double NilaiUjian;

    public murid(String nama, String nim, Double nilaiUjian) {
        Nama = nama;
        Nim = nim;
        NilaiUjian = nilaiUjian;
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
        return " * | Nama :  " + Nama + ", Nim='" + Nim + ", NilaiUjian=" + NilaiUjian;
    }

    @Override
    public int compareTo(murid o) {
        return o.getNilaiUjian().compareTo(this.getNilaiUjian());
    }
}
