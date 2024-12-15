package Queue.ContohCodeQueue.TestingBefore;

public class SiswaQue implements Comparable<SiswaQue> {
     String Nama;
     String NIM;
     Double Nilai;

    public SiswaQue(String nama, String NIM, Double nilai) {
        Nama = nama;
        this.NIM = NIM;
        Nilai = nilai;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        Nama = nama;
    }

    public String getNIM() {
        return NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public Double getNilai() {
        return Nilai;
    }

    public void setNilai(Double nilai) {
        Nilai = nilai;
    }

    @Override
    public String toString() {
        return "* | Nama='" + Nama + ", NIM='" + NIM + " Nilai Ujian ='" + Nilai ;
    }

    @Override
    public int compareTo(SiswaQue o) {
        return o.getNilai().compareTo(this.getNilai());
    }

}
